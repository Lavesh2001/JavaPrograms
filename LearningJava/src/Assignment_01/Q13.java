package Assignment_01;

/*
 * Q13. How Compiler And Jvm Can Differentiate Constructor And Method
         Definitions Of Both Have Same Class Name?
        
        -In java every method have a return type
          but constructor does not any return type
          This is the way java runtime distinguish between a normal method and a constructor.
          if we place a return type in constructor the it becomes the method
         
 */
public class Q13 {

	public static void main(String[] args) {
		

	}

}
class test5
{  
	test5()//No return type hence it is a constructor
	{
		
	}
	int test5()//it has a return type hence it is a method
	{
		return 0; 
	}
}
