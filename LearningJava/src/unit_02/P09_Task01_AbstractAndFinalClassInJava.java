package unit_02;

/*
  - Abstract Class:
    - An abstract class must be declared with an abstract keyword.
    
    - Abstraction is a process of hiding the implementation details and showing only
      functionality (Function declarations) to the user.
    - can not make object of abstract class directly, but through derived class 
    
    - Abstract Class may contain abstract and non-abstract methods
    -(0-100) abstract methods can be there!
    
    - In case of inheritance: 100% abstract methods should be there!
    
    Final Class :
    - The main purpose of using a class  being declared as final is to prevent the class from being inherited
    - If a class is marked as final the no class can inherit any feature from the final class.
    - You cannot extend a final class. If you try it gives a compile time error.
 */
abstract class Bike
{
	int a;
	Bike()
	{
		System.out.println("Inside Bike Constructor : "+a+"\n");
	}
	
	abstract void run(); //abstract method! (0-100)%
	
	void display()
	{
		System.out.println("This is display method!");
	}
}
class Honda4 extends Bike
{
	void run()
	{
		
	}
}
public class P09_Task01_AbstractAndFinalClassInJava {
	public static void main(String args[])
	{
		Bike obj = new Honda4();
		obj.run();
		obj.display();
	}
}
//final class 
final class Super
{
	public int data = 30;
	
	void display()
	{
		System.out.println(data);
	}
}
/*public class Sub extends Super
{
	void display2()
	{
		display();
	}
}*/