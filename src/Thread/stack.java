package Thread;

public class stack 
{

   int stacklimit=5;    
			    
			synchronized void pop(int slimit){    
				System.out.println("performing push operation..."); 
			    
			if(this.stacklimit<slimit){    
			System.out.println("no more element; waiting for adding element...");    
			try
			{wait();
			}
			catch(Exception e){}    
			}    
			this.stacklimit-=slimit;    
			System.out.println("successfuly done push operation... ");    
 
			}    
			    
			synchronized void push(int slimit){    
			System.out.println("performing push operation...");    
			this.stacklimit+=slimit;    
			System.out.println("successfuly done push operation... ");    
			notify();    
			}    
		 
			    
			 
			public static void main(String args[]){    
			final stack s=new stack();    
			new Thread(){    
			public void run()
			{
				s.pop(6);}    
			}.start();  
			
			new Thread()
			{    
			public void run()
			{
				s.push(8);}    
			}.start();    
			    
			
	}

}
