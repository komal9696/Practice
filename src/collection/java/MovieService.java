package collection.java;

import java.util.HashMap;
import java.util.Map;

public class MovieService {
	public static void main(String[]args)

	{
		

		Map<String,Integer> m = new HashMap<>();
		Map.Entry<String,Integer> m1= null;

		m.put("PK", 5);
		m.put("DHOOM", 3);
		m.put("YZ", 4);
		m.put("PQR", 2);

		for(Map.Entry<String,Integer> rating:m.entrySet())
		{
			if (m1 == null || rating.getValue().compareTo(m1.getValue()) > 0)
			{
				m1 = rating;
			}
		}
		System.out.println("Highest Rating Movies  is: "+m1.getKey());
		}
}

