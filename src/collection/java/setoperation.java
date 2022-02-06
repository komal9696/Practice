package collection.java;

	import java.util.*;    
	
	public class setoperation  
	{    
	    public static void main(String args[])    
	    {    
	        Integer[] A = {2, 4,33, 6, 5, 34, 9}; 
	        
	        Integer[] B = {14, 2, 83, 7, 3, 12, 2};  
	        
	        Set<Integer> set1 = new HashSet<Integer>();  
	        
	        set1.addAll(Arrays.asList(A));    
	        
	        Set<Integer> set2 = new HashSet<Integer>();    
	        set2.addAll(Arrays.asList(B));    
	    
	        
	        Set<Integer> union_data = new HashSet<Integer>(set1);    
	        union_data.addAll(set2);    
	        System.out.print("Union of set1 and set2 is:");    
          System.out.println(union_data); 
          
          
          Set<Integer> intersection_data = new HashSet<Integer>(set1);    
	        union_data.addAll(set2);    
	        System.out.print("intersection of set1 and set2 is:");    
	        System.out.println(intersection_data); 
	        
	        Set<Integer> difference_data = new HashSet<Integer>(set1);    
	        union_data.addAll(set2);    
	        System.out.print("difference of set1 and set2 is:");    
	        System.out.println(difference_data); 
}
}