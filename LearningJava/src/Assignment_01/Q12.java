package Assignment_01;

/*
 * Q12. If We Place Return Type In Constructor Prototype Will It Leads To Error?
 */
public class Q12 {

	public static void main(String[] args) {
		test4 obj =new test4();//no default constructor in the class test4
          
	}

}
/*
 * if we place return type in constructor then it will not give any error
 *  but it will give a warning:This method has a constructor name
 *  If we add a return type to a constructor, then it will become a method of the class. 
 *  This is the way java runtime distinguish between a normal method and a constructor.
 * 
 */
class test4
{
	int test4()
	{
		return 0;
	}
	test4(int a)
	{
		
	}
}


