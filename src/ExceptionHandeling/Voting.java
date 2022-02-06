package ExceptionHandeling;

	class UnderAgeException extends Exception
	{
	    UnderAgeException()
	    {
	        super("you are under age!");
	    }
	    UnderAgeException(String message)
	    {
	        super(message);
	    }
	}
	public class Voting {
	    public static void main(String[] args) {
	        
	        int age = 19;
	        try
	        {
	        if(age <18)
	        {
	            throw new UnderAgeException("You can not vote!");
	        }
	        else
	        {
	            System.out.println("you can vote now!");
	        }
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }
	    }

	 


}
