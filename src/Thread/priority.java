package Thread;

public class priority {

	public void run()  
	{  
System.out.println("Inside the run() method");  
	}  
  public static void main(String argvs[])  
	{  
	
	priority th1 = new priority();  
	  
	  
	System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  
	  
;  
	
	Thread.currentThread().setPriority(10);  
	  
	System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());
	
	}  
	} 