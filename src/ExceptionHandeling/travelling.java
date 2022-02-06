package ExceptionHandeling;

	class vaccine extends Exception
	{
	 
		vaccine(String message)
		{
			super(message);
		}
	}
	public class travelling
	{
		public static void main(String[] args)
		{
		String vaccinated= "yes";
		try
		{
			if(vaccinated=="yes")
			{
				System.out.println("you have  permission to travel");
				
			}
	
			else
			{
				
			System.out.println("you have no permission to travel");
			}
		}
		}
	}
