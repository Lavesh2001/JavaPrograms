package Assignment_01;
import java.lang.Cloneable;
/*
 * Describe various forms of implementing interfaces and extending
     an Abstract Class. Explain it with suitable examples
     Interface: 
       1. Functional Interface [only on abstract method, like runnable ] 
         -An Interface that contains exactly one abstract method is known as functional interface. 
          It can have any number of default, static methods but can contain only one abstract method. 
          It can also declare methods of object class.
         -Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces. 
          It is a new feature in Java, which helps to achieve functional programming approach.
          
       2. Marker interface [0-any abstract methods]
         - Marker interfaces are empty interface used to tag or group specific type of classes 
           so that JVM can identify and apply some logic on them.
         - An marker interface that does not contain any methods, fields, Abstract Methods, and any Constants
         -Built-in marker interfaces are:
          1. Cloneable Interface
          2. Serializable Interface
          3. Remote Interface
     
     Abstract Class:
       1. Pure or 100% abstract class
        -In a pure or 100% abstract class all the methods of class are abstract(methods without body)
       2. Normal Abstract Class [0-100% abstract methods]
        - In a Normal Abstract class some methods are abstract or some are non-abstract  (0 to 100%)
 */
public class Q16 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
          
		test11 obj =new test11(4,5);
		test11 obj1=(test11)obj.clone();
		System.out.println("Value of a of obj1="+obj1.a);
		System.out.println("Value of a of obj1="+obj1.b);
		
		test8 obj2=new test9();
		obj2.display();
		
		A obj3=new B();
		obj3.fun1();
		obj3.fun2();
		obj3.fun3();
		
		C obj4=new D();
		obj4.fun4();
		obj4.fun5();
		obj4.fun6();
		obj4.fun7();
		
	}

}

interface test8  //functional interface
{
	void display();
}
class test9 implements test8 //implementing functional interface
{
	public void display()
	{
		System.out.println("Implementing test8 interface");
	}
}
interface test10//marker interface 
{
	
}

//cloning using using built in marker interface (Cloneable interface)
//Cloneable interface
class test11 implements Cloneable
{
	int a,b;
	test11(int x,int y)
	{
		a=x;
		b=y;
	}
	protected Object clone()
		    throws CloneNotSupportedException
		     
		    {
		        return super.clone();
		    }
}

//100% or pure abstract class
abstract class A
{
	abstract void fun1();//abstract method
	abstract void fun2();//abstract method
	abstract void fun3();//abstract method
}
class B extends A//extending abstract class 
{
	void fun1()
	{
		System.out.println("function 1");
	}
	void fun2()
	{
		System.out.println("function 2");
	}
	void fun3()
	{
		System.out.println("function 3");
	}
}

//Normal abstract class(0 to 100%)

abstract class C
{
	abstract void fun4();//abstract method
	void fun5()
	{
		System.out.println("function 5");
	}
	abstract void fun6();//abstract method
	void fun7()
	{
		System.out.println("function 7");
	}
}
class D extends C
{
	void fun4()
	{
		System.out.println("function 4");
	}
	void fun6()
	{
		System.out.println("function 6");
	}
}
