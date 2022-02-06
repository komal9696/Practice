package Thread;


public class Main extends Thread 
{
	  public static void main(String[] args)
	  {
	    Main t = new Main();
	    t.start();
	    System.out.println("This code is running");
	  }
	  public void run()
	  {
	    System.out.println("This code is not running");
	  }
	}