package Assignment_01;
import unit_02.*;
/*
 * Q9. WAP in java, which would demonstrate access protection over a
       class and a variable of that class.
       Note: class can be public and default while variable can be default,
       private, protected, and public.
 */

public class Q9 {

	public static void main(String[] args) {
		SampleClass2 obj=new SampleClass2();//public class from package unit_02
	    System.out.println("value of a: "+obj.a);//can not access default member outside the package
	    System.out.println("value of a: "+obj.b);//can access public member outside the package
	    System.out.println("value of a: "+obj.c);//can not access private member outside the package or outside the class
	    System.out.println("value of a: "+obj.d);//can not access protected member outside the package
	    
	    test1 obj1=new test1();//can not access default class outside the package
	    
	    test2 obj2=new test2();
	    System.out.println("value of a: "+obj2.a);
	    System.out.println("value of a: "+obj2.b);
	    System.out.println("value of a: "+obj2.c);//can not access private member outside the class
	    System.out.println("value of a: "+obj2.d);
	    
	    test3 obj3=new test3();//can access default class with in package
	    System.out.println("value of a: "+obj3.a);
	    System.out.println("value of a: "+obj3.b);
	    System.out.println("value of a: "+obj3.c);//can not access private member outside the class
	    System.out.println("value of a: "+obj3.d);

	}

}
class test2
{
	int a=10;
	public int b=10;
	private int c=24;
	protected int d=2434;
	
}
