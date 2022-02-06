package Thread;


	
	class setname extends Thread{  
		  public void run(){  
		  
		  }  
		 public static void main(String args[]){  
			 
		  setname t1=new setname();  
		  setname t2=new setname();  
		  t1.start();  
		  System.out.println(t1.getName());  
		    
		   t1.setName("komal ranaware");  
		  System.out.println(t1.getName()); 
		  t1.setName("thread 9");  
		  System.out.println(t1.getName());  
		  System.out.println(t2.getName()); 
		 }  
		} 
	

