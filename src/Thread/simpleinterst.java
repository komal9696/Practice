package Thread;


	public class simpleinterst extends Thread {
		  public static double P =89;
		  public static double T =6;
		  public static double R =9;
		  public double si;
		  public double CI;
		  public double N;
		  public double amount;
		  public static void main(String[] args) {
			  simpleinterst thread = new simpleinterst();
		    thread.start();
		   
		    while(thread.isAlive()) {
			      System.out.println("Waiting...");
			    }
		    
		   double si=P*T*R/100;
		    System.out.println("si: " + si);
		    
		  }
		 
		
		  public void run()
		  {
			  System.out.println("calculating simple Interest");
			  double amount = P * Math.pow(1 + (R / N), N * T);
		        double CI = amount - P;
			 
		}

}
