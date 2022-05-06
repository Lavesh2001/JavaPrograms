package Assignment_01;

/*
 *  Q19. Why we cannot create a private and protected class in Java?
 *       
 *   - In java, we can create inner class as private or protected class but
 *     - We can not create outer class as private and protected class in java because 
 *       if a class is private then it accessibility is within class
 *       and if class is protected then its accessibility is with in a package or outside the package through inheritance
 *       hence if class created as private and protected the JVM can not access these classes and program  can not be compiled or executed
 *       JVM is not written in a way so that it will inherit class for protected accessibility
 */
public class Q19 {

	public static void main(String[] args) {
		

	}
   
}
private class test17//outer class can not be private
{
	
}
protected class test18//outer class can not be protected
{
	
}
class test19
{
	private class test20//inner class can be private
	{
		
	}
	protected class test21//inner class can be protected
	{
		
	}
}
