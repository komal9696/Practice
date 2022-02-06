package javafeature;
interface square
{
	int square(int a, int b);
}
public class Lambda
{
	
 public static void main(String[]args)
 {
	 square s=(a,b)->(a*b);
	 System.out.println(s.square(9,9));
	 
	 
	 square s1=(a,b)->(a-b);
	 System.out.println(s1.square(9,3));
	
	 };
}

