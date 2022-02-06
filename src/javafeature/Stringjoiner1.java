package javafeature;

import java.util.StringJoiner;

public class Stringjoiner1 {

	public static void main(String[]args)
	{
		StringJoiner j=new StringJoiner(",");
				j.add("komal");
				j.add("Swarali");
				j.add("pragati");
			
				{
				System.out.println(j);
				}
		
	}
}
