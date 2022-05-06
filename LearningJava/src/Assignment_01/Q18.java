package Assignment_01;
/*
 * Q18. How local static variable is different from global static variable?
 *     
 *     - In Java, there is no concept of global variables; since Java is an Object-oriented programming language, 
 *       everything is a part of the Class. But if we want to make a variable globally accessible, 
 *       we can make it static by using a static Keyword.
 *     - Global static variable: They are declared outside the method/function
 *       -We can access global variable from outside of the class with the help of class name
 *        
 *     -Local variable: They are declared with in a method(inside the block of a method)
 *      There accessibility is inside the method we can not access these variable from outside the method or class
 *     -Local static variable: we can not create static variable inside the method in java
 *      
 *      Both is declared with static keyword
 */
public class Q18 {

	public static void main(String[] args) {
		
		//we can access static variable (a) directly
		System.out.println(test16.a);
		
		//for accessing instance variable we use object of that class
		test16 obj=new test16(4);
		
		System.out.println(obj.b);
		

	}

}
class test16
{
	static int a=0;//Global static variable
	
	 int b;//instance variable
	 
	 test16(int n)
	 {
		 b=n;
	 }
	 
	 void fun()
	 {
		 int n=10;//local variable
		 
		// static int n1=0;//we can not create static variable inside the method in java
	 }
	
}
