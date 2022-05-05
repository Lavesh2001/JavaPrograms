package Assignment_01;

/*
 * Q15. Can we have a Constructor in an Interface?
 *  
 *   -An Interface in Java doesn't have a constructor because all data members in interfaces are public static final by default,
 *    they are constants (assign the values at the time of declaration).
     - There are no data members in an interface to initialize them through the constructor.
      In order to call a method, we need an object,
      -Since the methods in the interface don’t have a body there is no need for calling the methods in an interface.
      -Since we cannot call the methods in the interface, 
       there is no need of creating an object for an interface and there is no need of having a constructor in it.
 */

public class Q15 {

	public static void main(String[] args) {
		

	}

}
interface test7
{
	test7()//Interfaces cannot have constructors
	{
		
	}
}
