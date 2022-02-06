package javafeature;


import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoField;
import java.util.Date;

public class FindDay
{
public static void main(String[]args)
{
	
		
	try
	{
		
	  String i = "03/01/2022";
  
	  
	  SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
	  Date dt1 = format1.parse(i);
	  System.out.println(dt1);
	  System.out.println(java.time.LocalTime.now());  
	  
	 
	  //Period period = Period.of(2022,01,03);  
	//  System.out.println(period);
	   LocalDate localDate = LocalDate.of(2020, Month.JANUARY, 03);  
	    DayOfWeek dayOfWeek = DayOfWeek.from(localDate);  
	    System.out.println(dayOfWeek.get(ChronoField.DAY_OF_WEEK));  
	}
	    catch(Exception e)
		{
			System.out.println(e);
		}	
}
	}

	
	  

	



