package javafeature;


	
	import java.util.function.BiConsumer;  
	
	public class Biconsumer1 {

	    static void Information(String name, Integer id)
	    {  
	        System.out.println(name+" "+id);  
	    }  
	    public static void main(String[] args) {  
	  
	        BiConsumer<String, Integer> biCon= Biconsumer1::Information;
	        biCon.accept("Divya", 20);  
	        biCon.accept("Kiran", 25);
		
	}
	}
