

	import java.util.regex.*;
	
	public class Adhar {
	   
	    public static boolean
	    isValidAadharNumber(String str)
	    {
	 
	        String regex
	            = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";
	 
	        // Compile the ReGex
	        Pattern p = Pattern.compile(regex);
	 
	        // If the string is empty
	        // return false
	        if (str == null) {
	            return false;
	        }
	 
	    
	        Matcher m = p.matcher(str);
	 
	      
	        return m.matches();
	    }
	 
	    // Driver Code.
	    public static void main(String args[])
	    {
	 
	        // Test Case 1:
	        String str1 = "3675 9834 6015";
	        System.out.println(isValidAadharNumber(str1));
	 
	        // Test Case 2:
	        String str2 = "4675 9834 6012 8";
	        System.out.println(isValidAadharNumber(str2));
	 
	        // Test Case 3:
	        String str3 = "0175 9834 6012";
	        System.out.println(isValidAadharNumber(str3));
	 
	        // Test Case 4:
	        String str4 = "3675 98AF 60#2";
	        System.out.println(isValidAadharNumber(str4));
	 
	        // Test Case 5:
	        String str5 = "417598346012";
	        System.out.println(isValidAadharNumber(str5));
	    }
}
