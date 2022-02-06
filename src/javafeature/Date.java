package javafeature;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Date
{
	public String FindDay(int day,int month,int year)
	{
	String result=" " ;
	if(day<1 || day>31)
	{
		return "given day in range";
	}
	else if(month<1 || month>12)
	{
		return "given month in range";
	}
	else if(year<1 || year>12)
	{
		return "given year in range";
	}
	LocalDate d=LocalDate.of(year,month,day);
	DayOfWeek d1=d.getDayOfWeek();
	result=d1.toString();
	return result;
	
}
	//public static void main(String[]args)
	//{
	}
	//}

