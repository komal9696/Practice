
package collection.java;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
class Movie
{
   
		int id;    
		String name;
		String generation;
	 String releasedate;  
	 int rating;
	
		  
		public Movie(int i, String n, String g,String r,int r1) 
		{    
		    id = i;    
		    name = n;    
		    generation=g;
		    releasedate=r;
		    rating=r1;
		    
		} 
		 public int getid()
		 {
		        return this.id;
		 }
		 public String getname()
		 {
		        return this.name;
		 }
		
		 public String getgeneration()
		 {
		        return this.generation;
		 }
		 public String getreleasedate()
		 {
		        return this.releasedate;
		 }
		 public int getrating()
		 {
		        return this.rating;
		 }
		
		 public String toString()
		 {
			  return id+" "+name+" "+generation+" "+releasedate+" "+rating ;  

		 }

}
public class Moviesservice
{	 
	public static void main(String[] args) {  
	    HashSet<Movie> s1=new HashSet<Movie>();  
	     
	    Movie m1=new Movie(1,"PK","NEW","2018-10-13",5);  
	    Movie m11=new Movie(1,"DHOOM","NEW","2020-09-29",4);  
	    Movie m2=new Movie(1,"DHADKAN","OLD","2008-06-06",4);  
	    s1.add(m1);  
	    s1.add(m11);  
	    s1.add(m2);
	    for(Movie m:s1)
	    {  
	    System.out.println(m.id+" "+m.name+" "+m.generation+" "+m.releasedate+" "+m.rating);  
	    }  

	for (Entry<Integer, Integer> entry : map.entrySet())
	{  
        if (entry.getValue()==maxValueInMap)
        {
            System.out.println(entry.getKey());     
        }
    }

}
}
	}

