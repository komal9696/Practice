package Thread;

public class sleepmethod {

	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try
		{
				Thread.sleep(90);
				System.out.println(Thread.currentThread().getName()); 
				
		}
		catch(InterruptedException e1)
		{
		System.out.println(e1);
	}
	System.out.println(i);
	}
	}
	
	public static void main(String[]args)
	{
	sleepmethod s=new sleepmethod();
	
	s.run();

}
	}
