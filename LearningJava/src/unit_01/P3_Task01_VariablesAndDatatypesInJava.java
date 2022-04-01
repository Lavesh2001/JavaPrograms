package unit_01;
/*
  - Variables in Java is a data container that saves the data value during program execution.
  
  Types of Variables:
  - In Java, there are three types of variables:
       1. Local Variables-Declared inside the body of a method
       
       2. Instance Variables- Instance variables are defined without static keyword.
         -They are defined outside a method declaration.
         -They are object specific and are known as instance variables.
        
       3. Static Variables-
         -Static variables are defined with the STATIC keyword
         -Static Variables are initialized only once, at the start of the program execution.
         -These Static Variables will be initialized first, before the initialization of any instance variables.
 *  
 *  - Data Types in Java: 
 */
public class P3_Task01_VariablesAndDatatypesInJava {
      
	static int q=11;
	int p=10;
	public static void main(String[] args) {
		   
		//Valid declaration
		int a,b,c;
		float pi;
		double d;
		char e;
		
		//Valid Initialization
		pi=3.14f;
		d=20.22d;
		e='v';
		a=10;
		b=10;
		c=10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(pi);
		System.out.println(d);
		System.out.println(e);
		
		int myNum=5;//Integer(Whole number)
		float myFloatNum=5.99f;//Floating point Number
		char myLetter='D';//Character
		boolean myBool=true;//Boolean
		String myText="Hello";//String
		
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);
		
		/*
		 * Java Variable Type conversion and Type casting 
		 */
		double f;
		int i=10;
		f=i;//Type conversion
		double g=10;
		int j;
		j=(int)g;//Type Casting
		System.out.println(f);
		System.out.println(i);
		System.out.println(g);
		System.out.println(j);
		byte k=10;//1 byte
		boolean l=true;//1bit=true or false only
		long m=10L;
		float n=1.2f;
		double o=1.2d;
		
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
		System.out.println(ABCDE.j);//Accessing static Variables
		
		ABCDE obj1=new ABCDE();
		obj1.display();//Accessing function from class object
		System.out.println(obj1.i++);
		System.out.println(obj1.i);
		
		ABCDE obj2=new ABCDE();
		System.out.println(obj2.i);
		
		System.out.println(ABCDE.j++);
		System.out.println(ABCDE.j);
		
		ABCDE.typeConversionAndTypeCasting();
       
	}
	int r=10;
     void display()
	{
		int a=5;//Local Variable
		System.out.println("This is a display Method");
		System.out.println(a);
	}

}
class ABCDE
{
	  static int j=10;//Class variable/static variable
	  int i=10;//Instance Variable`
	 void display()
		{
			int a=5;//Local Variable
			System.out.println("This is a display Method");
			System.out.println(a);
		}
	 static void typeConversionAndTypeCasting()
	 {
		 double f;//64 slots
			int i=10;//32 slots
			f=i;//Type conversion
			double g=10;
			int j;
			j=(int)g;//Type Casting
			System.out.println(f);
			System.out.println(i);
			System.out.println(g);
			System.out.println(j);
	 }
}
