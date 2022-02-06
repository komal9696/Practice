
package ExceptionHandeling;
import java.io.*; 
class filenotfound extends RuntimeException
{
	
	 
	    public static void main(String args[])
	    {  
	        FileInputStream f = null;  
	        try
	        {  
	            f = new FileInputStream("C:/Users/komalghadge/Desktop/komal.txt");  
	        }
	        catch(FileNotFoundException fnf)
	        {  
	            System.out.println("File Not Found!");  
	        }  
	      
	        }  
	    }  
	 
