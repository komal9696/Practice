package javafeature;

import java.util.Arrays;
import java.util.List;

public class ForEacch
{

	public static void main(String[]args)
	{
	List<Integer>list=Arrays.asList(1,3,5,9,8,29);
	for(Integer i1:list)
	{
		System.out.println(i1);	
		
	}
	//for(i=0;i<)
	
	list.forEach(li-> System.out.println(li));  

	
	
	
}
}
