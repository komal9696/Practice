package collection.java;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

class Movie11 {
   
		int id;    
		String name;
		String generation;
	 String releasedate;    
		  
		public Movie11(int id, String name, String generation,String releasedate) 
		{    
		    this.id = id;    
		    this.name = name;    
		    this.generation=generation;
		    this.releasedate=releasedate;
		    
		} 
		
		
		public String toString() 
		{
		      return name;
		}

{

public class Movies {

Map<String,Integer> m = new HashMap<>();
Map.Entry<String,Integer> m1= null;

m.put("Java", 5000);
m.put("Python", 3000);
m.put("CPP", 4000);
m.put("Android", 8000);

for(Map.Entry<String,Integer> price:m.entrySet())
{
	if (m1 == null || price.getValue().compareTo(m1.getValue()) > 0)
	{
		m1 = price;
	}
}
System.out.println("Maximum price is: "+m1.getValue());
}
}


