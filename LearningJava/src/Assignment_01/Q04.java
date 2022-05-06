package Assignment_01;

/*
 * Q4. Create a multi-level inheritance hierarchy from ClassOne, ClassTwo,
       ClassThree classes.
       ClassOne contains one, single parameterized constructor
       ClassTwo contains only a default constructor
       ClassThree contains one, single parameterized constructor and a default
       constructor.
       Create an object of top child class and make sure the constructor
       execution will take place according to respective multi-level inheritance
       hierarchy.
       ClassThree obj = new ClassThree(1);
       ClassThree obj = new ClassThree();
 */
public class Q04 {

	public static void main(String[] args) {
		ClassThree obj = new ClassThree(1);// parameterized constructor
		ClassThree obj1 = new ClassThree();// Default constructor

	}

}
class ClassOne
{
	ClassOne(int x)
	{
		System.out.println("ClassOne constructor");
		System.out.println("Value of x in ClassOne="+x);
	}
}
class ClassTwo extends ClassOne
{
	ClassTwo()
	{   
		super(10);
		System.out.println("ClassTwo constructor");
	}
}
class ClassThree extends ClassTwo
{   
	ClassThree()
	{
		System.out.println("ClassThree Default constructor");
	}
	ClassThree(int x)
	{
		System.out.println("ClassThree Parametrized constructor");
		System.out.println("Value of x in ClassThree="+x);
	}
}
