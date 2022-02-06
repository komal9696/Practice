package Thread;


	public class amount extends Thread {
		  public static int amount =1000;

		  public static void main(String[] args) {
		    amount thread = new amount();
		    thread.start();
		   
		    while(thread.isAlive()) {
		      System.out.println("Waiting...");
		    }
		   
		    System.out.println("increament amount: " + amount);
		    amount++;
		    System.out.println("more decrement amount: " + amount);
		    amount--;
		    System.out.println("more increment amount: " + amount);
		    amount++;
		  }
		  public void run() {
		    amount++;
		    amount--;
		  }
		}


