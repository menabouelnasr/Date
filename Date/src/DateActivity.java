import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateActivity 
{
	String date;
	String day;
	String sendDay;
	String sendWeather;
	int week, weather;
	
	public int getWeek() 
	{
		return week;
	}
	public void setWeek(int week) 
	{
		this.week = week;
	}
	public String getWeather() 
	{
		if(sendWeather.equals("0"))
			return "It was a sunny day and the temperature averaged 85 degrees.";
		else if (sendWeather.equals("1"))
			return "It was a cloudy day and the temperature averaged 65 degrees.";
		else if(sendWeather.equals("2"))
			return "It was a rainy day and the temperature averaged 60 degrees.";
		else if(sendWeather.equals("3"))
			return "It was a snowy day and the temperature averaged 25 degrees.";
		else if(sendWeather.equals("4"))
			return "It was a partly cloudy day and the temperature averaged 54 degrees.";
		else if(sendWeather.equals("5"))
			return "It was a windy day and the temperature averaged 67 degrees.";
		else
			return "invalid";
	
	}
	public void setWeather(String sendWeather) 
	{
		this.sendWeather = sendWeather;
		
	}

	public String getDay() 
	{
		if (sendDay.equals("0"))
			return "That was a Wednesday.";
		else if(sendDay.equals("1"))
			return "That was a Thursday.";
		else if(sendDay.equals("2"))
			return("That was a Friday.");
		else if(sendDay.equals("3"))
			return ("That was a Saturday.");
		else if(sendDay.equals("4"))
			return("That was a Sunday.");
		else if(sendDay.equals("5"))
			return("That was a Monday.");
		else if(sendDay.equals("6"))
			return ("That was a Tuesday.");
		else
		return "Invalid";
	}
	public void setDay(String sendDay) 
	{
		this.sendDay = sendDay;
		
	}
	 
}
