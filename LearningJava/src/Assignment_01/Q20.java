package Assignment_01;

/*
 * Q20. What happens if we add final keyword with Class, Method and a variable in java.
 *      
 *      -add final keyword with a class
 *          - if we add a final keyword in class means now we can not inherited that class.
 *        
 *      -add final keyword with a method
 *          - if we add a final keyword with a method means now we can not override or redefine that method.
 *         
 *      -add final keyword with a variable
 *          - if we add final keyword with a variable means now we can not change the value of that variable
 *            adding final keywords to variable means making that variable as constant
 */
public class Q20 {

	public static void main(String[] args) {
		
         final int n=245;
         n=4665;//we can not change the value of a final variable
	}

}

final class A3
{
	int a;
	int b;
	void fun1()
	{
		
	}
	void fun2()
	{
		
	}
}
class A4 extends A3//we can not inherited final class
{
	
}

class A5
{
	int a;
	int b;
	final void fun3()
	{
		System.out.println("function3");
	}
}
class A6 extends A5
{
	void fun3()//we can not override the final method
	{
		System.out.println("third function");
	}
}

