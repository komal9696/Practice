package ExceptionHandeling;

public class Nestedtrycatch 
{
	
		   public static void main(String args[]){
		     
		    try
		    {
		    
		     try{     
        
		        int arr[]= {1,2,3,4};
		            	
		            	System.out.println(arr[10]);
		            }
          
		        catch(ArithmeticException e)
		     {
		           System.out.print("Arithmetic Exception");
		           System.out.println(" handled in try-block1");
		        }
		    }
		    catch(ArrayIndexOutOfBoundsException e1)
		    {
		    	System.out.print("ArrayIndexOutOfBoundsException");
		     	System.out.println(" handled in main try-block");
		    }
		   }
}
