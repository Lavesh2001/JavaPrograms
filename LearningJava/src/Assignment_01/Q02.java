package Assignment_01;

/*
 * Q2- WAP to count the total number of calls for a member function from
       more than one objects. [Let’s say, from 3 such Objects] 
 */
public class Q02 {

	public static void main(String[] args) {
		  
		ABCDEF obj1=new ABCDEF();
		obj1.fun();
		ABCDEF obj2=new ABCDEF();
		obj2.fun();
		ABCDEF obj3=new ABCDEF();
		obj3.fun();
		System.out.println("Total number of calls for function fun() :"+ABCDEF.val);

	}

}
class ABCDEF
{
	static int val=0;
	void fun()
	{
		val++;
	}
}
