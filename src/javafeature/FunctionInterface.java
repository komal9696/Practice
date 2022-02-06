package javafeature;



	import java.util.function.Function;  
	
	public class FunctionInterface
	{  
	    static String Activity(String message)
	    {  
	        return "Student palying "+message;  
	    }  
	    public static void main(String[] args) 
	    {  
	    	
	        Function<String, String> fun = FunctionInterface::Activity;  
	       
	        System.out.println(fun.apply("cricket"));  
	    }  
	} 

