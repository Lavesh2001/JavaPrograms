package Assignment_01;
import java.util.*;
/*
 * Q3- Given an interface in1 which includes a method display which takes
   an integer as input .
   interface In1
   {
      void display(int p);
   }
   Task is to write a class testClass which implements interface In1 and has
   a method named display which takes an integer as an input p and the
   display method should be able to tell if the number is prime or not?
   - The main method should not be in testClass, create a separate class for
     that
 */
public class Q03 {

	public static void main(String[] args) {
		TestClass obj=new TestClass();
		Scanner sc=new Scanner(System.in);
		int num;
		num=sc.nextInt();
		obj.display(num);

	}

}
interface In1
{
	void display(int p);
}
class TestClass implements In1
{
	public void display(int p)
	{   
		if(p==2)
		{
			System.out.println(p+" is a prime number");
			return;
		}
		else
		{
		for(int i=2;i<=Math.sqrt(p);i++)
		{
			if(p%i==0)
			{
				System.out.println(p+" is a not prime number");
				return;
			}
		}
		System.out.println(p+" is a prime number");
		}
	}
}