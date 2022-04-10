package unit_01;

/*
- It is called when an instance of the class created
- At the time of calling the constructor, memory for the object is allocated in the memory
- It is special type of method which is used to initialize the object
- Every time an object is created using the new() keyword, at least one constuctor is called
- Two types of constuctor in java
   - Parameterized Contructor
   -Default Contructor
 */

public class P5_Task03_ConstructorsInJava {

	public static void main(String[] args) {
		
		ABC4 obj = new ABC4();
		
		ABC4 obj1 = new ABC4(1);
		
		System.out.println(obj.a);
		System.out.println(obj1.a);

	}

}
class ABC4 {
	
	int a;
	
	/* 
	 ClassName(Contructor Parameters)
	 {
	   All the class and instance variable can be intialized here!!!
	   }
	 */
	
	ABC4()
	{
		a = 10;
	}
	
	ABC4(int a)
	{
		this.a = a;
	}
	
	void display()
	{
		int b = 10;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	
	int display2()
	{
		System.out.println(a);
		
		//As a was a local variable so we can not access it outside the method
		//System.out.println(b);
		
		return a;
	}

}