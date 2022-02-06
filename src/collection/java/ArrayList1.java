package collection.java;

import java.util.ArrayList;

public class ArrayList1
{  
	 public static void main(String args[])
	 { 
ArrayList<String> al=new ArrayList<String>();  
al.add("GPay");  
al.add("PhonePe");  
al.add("Paytm");  
al.add("iMobile");  

System.out.println(al.get(1));

al.set(1,"Kotak Bank");  
 
for(String Transaction:al)    
  System.out.println(Transaction);  


}  
} 