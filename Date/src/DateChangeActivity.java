import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateChangeActivity 
{

	public static void main(String[] args) 
	{
		int day, month, year, sec, min, hr;
		Date time;
		GregorianCalendar date = new GregorianCalendar();

		day= date.get(Calendar.DAY_OF_MONTH);
		month= date.get(Calendar.MONTH);
		year= date.get(Calendar.YEAR);
		time= date.getTime();

	     sec = date.get(Calendar.SECOND);
	     min = date.get(Calendar.MINUTE);
	     hr = date.get(Calendar.HOUR);
		System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
		System.out.println("Current time is  "+hr+" : "+min+" : "+sec);

	}

}