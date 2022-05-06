package Assignment_01;
/*
 * Q17. How a 100% abstract class is different from an Interface.
 *     - 100% abstraction can be done by both(100% abstract class and interface)
 *     - but Multiple inheritance can be done by only interfaces(by implementing multiple interfaces
 *       not by abstract class or 100% abstract class
 *       
 *      -Type of variables: Abstract class can have final, non-final, static and non-static variables. 
 *        The interface has only static and final variables.
 *       
 *      -Implementation: Abstract class can provide the implementation of the interface. 
 *        Interface can’t provide the implementation of an abstract class.
 *        
 *      -Accessibility of Data Members: Members of a Java interface are public by default. 
 *        A Java abstract class can have class members like private, protected, etc.
 */
public class Q17 {

	public static void main(String[] args) {
		
		test15 obj=new test15();
		obj.fun1();
		obj.fun2();
		obj.fun3();
		obj.fun4();

	}

} 
 abstract class test12//100% or pure abstract class
{
	abstract void fun1();
	abstract void fun2();
}
 abstract class test13//100% or pure abstract class
 {
 	abstract void fun3();
 	abstract void fun4();
 }
/* class test14 extends test12,test13//can not do multiple inheritance using class or abstract class
 {
	 void fun1()
	 {
		 
	 }
     void fun2()
     {
    	 
     }
     void fun3()
     {
    	 
     }
     void fun4()
     {
    	 
     }
 }
 */
 interface A1
 {
	 void fun1();
	 void fun2();
 }
 interface B1
 {
	 void fun3();
	 void fun4();
 }
 class test15 implements A1,B1//implementing multiple inheritance using interfaces
 {
	 public void fun1()
	 {
		 System.out.println("function1");
	 }
     public void fun2()
     {
    	 System.out.println("function2");
     }
     public  void fun3()
     {
    	 System.out.println("function3");
     }
     public void fun4()
     {
    	 System.out.println("function4");
     }
 }
