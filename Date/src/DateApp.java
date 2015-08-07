import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class DateApp 
{

	
	public static void main(String[] args) 
	{
	
		int d, m, y, days;
		String date, month, day, year,sendDay, sendWeather, choice = "y";
		
		while(choice.equalsIgnoreCase("y"))
		{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a day of the week in the format mm/dd/yyyy");
		date=keyboard.nextLine();
	
		DateActivity tom = new DateActivity();
		String str=new String(date);
		month=str.substring(0,2);
		day= str.substring(3,5);
		year= str.substring(6,10);
		
		d=Integer.parseInt(day);
		m=Integer.parseInt(month);
		y=Integer.parseInt(year);
		
		
		Calendar cal = new GregorianCalendar(y,m-1,d);
		Calendar cal2= new GregorianCalendar();
		
		//Code to get the day of the week when a date is entered.
		Date d1= new Date(y,m,d);
		sendDay= Integer.toString(d1.getDay());
		tom.setDay(sendDay);
		System.out.println(tom.getDay());
		
		//Code to get the weather and temperature on that day
		Random r = new Random();
		int weather = r.nextInt(5);
		sendWeather=Integer.toString(weather);
		tom.setWeather(sendWeather);
		System.out.println(tom.getWeather());
		
		//Code to calculate the amount of days between today and the date entered
		Date endDate = cal.getTime();
		Date currentDate=cal2.getInstance().getTime();
		long startDateMS = currentDate.getTime();
		long endDateMS= endDate.getTime();
		long elapsedMS= startDateMS - endDateMS;
		long elapsedDays= elapsedMS/ (60*60*24*1000);
		
		System.out.println("It was " + elapsedDays + " day(s) ago.\n");
		System.out.println("Would you you like to enter another date? (Y/N)");
		choice=keyboard.next();
		}
	}

}
