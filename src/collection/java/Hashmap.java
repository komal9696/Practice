package collection.java;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[]args)
	{
		HashMap <Integer,String> h=new HashMap<Integer,String>();
		h.put(1,"A");
		h.put(2,"B");
		h.put(3,"C");
		h.put(4,"D");
		for(Map.Entry h1:h.entrySet())
		{
			
		 System.out.println(h1.getKey()+ " "+h1.getValue());
		}
		{
			 System.out.println("after putting null value");
		   h.putIfAbsent(5, "G"); 
		   for(Map.Entry h1:h.entrySet())
			{
				
			 System.out.println(h1.getKey()+ " "+h1.getValue());
			}
		   {
			   System.out.println("after removing value");
			   h.remove(3,"C");
			   for(Map.Entry h1:h.entrySet())
				{
					
				 System.out.println(h1.getKey()+ " "+h1.getValue());
			   
		   }
		   
		h.replace(2, "E");
		for(Map.Entry h1:h.entrySet())
		{
			 System.out.println(h1.getKey()+ " "+h1.getValue());
		   
		
		}
		}
	}
		
	}
	}

