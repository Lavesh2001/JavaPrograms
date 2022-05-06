package Assignment_01;

/*
 * Q7. WAP to count the total number of calls for a member function:
       display(), from more than one objects and how many times the object is
       created of a class name Employee.
 */
public class Q07 {

	public static void main(String[] args) {
		  
		Employee1 obj1=new Employee1();
		obj1.display();
		Employee1 obj2=new Employee1();
		obj1.display();
		Employee1 obj3=new Employee1();
		obj1.display();
		Employee1 obj4=new Employee1();
		obj1.display();
		Employee1 obj5=new Employee1();
		obj1.display();
		System.out.println("Number of calls for function display():"+obj1.count);

	}

}
class Employee1
{  
	static int count=0;
	void display()
	{
		count++;
	}
}
