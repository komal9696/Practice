package javafeature;
import java.util.function.Consumer;  
public class Interface
{
static void studentdetail(String name)
{
	System.out.println(name);
}
private static void studentdID(Integer id)
{
	System.out.println(id);
}




public static void main(String[]args)
{
	Consumer <String> c=Interface::studentdetail;
	
	c.accept("komal");
Consumer <Integer> c1=Interface::studentdID;
	
	c1.accept(9);
	
}
}

