package javafeature;

import java.util.function.Predicate;

public class Predicate1 {

	static Boolean CheckEligible(int age)
	{
		 if(age>45)  
	            return true;  
		 
	        else return false;
	}
	static Boolean Checkname(String name)
	{
		 if(name=="komal")  
	            return true;  
		 
	        else return false;
	}
	
	public static void main(String[]args)
	{
		Predicate<Integer> p=Predicate1::CheckEligible;
		
		boolean result=p.test(89);
		System.out.println(result);
Predicate<String> p1=Predicate1::Checkname;
		
		boolean result1=p1.test("swarali");
		System.out.println(result1);
	}
			
}
