package Assignment_01;

/*
 * Q14. Can we create a private constructor?
 *      
 *      - Yes We can declare private constructors in java 
 *        but if create private constructors in java then we can not create objects of the class 
 */
public class Q14 {

	public static void main(String[] args) {
		
		test6 obj=new test6();//can not create objects
		test6 obj1=new test6(4);//can not create objects
		

	}

}
class test6
{
	private test6()
	{
		
	}
	private test6(int a)
	{
		
	}
}
