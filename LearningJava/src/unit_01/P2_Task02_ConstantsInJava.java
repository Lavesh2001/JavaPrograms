package unit_01;

public class P2_Task02_ConstantsInJava {
     static final double PI=3.14;
	public static void main(String[] args) {
		 //Constant In Java 
      // Piece of data/code that would never change
      //Constant never change once a value is assigned
		System.out.print("Value of PI=");
		System.out.println(PI);   
		 
		//The final field P2_Task02_ConstantsInJava.PI cannot be assigned 
		//We can't change the value of constants(PI)
		PI=4.14;  
		//Accessing Non static constant in static functions
		Abcd Obj=new Abcd(); 
		System.out.print("Value of g=");
		System.out.println(Obj.g);  
		

	} 
	public  void main(String args) {
		 
		System.out.print("Value of PI=");
		System.out.println(PI);  

	} 
	
} 
class Abcd
{
	final double g=9.8;  
	void main(String args) {
	System.out.print("Value of g=");
	System.out.println(g);  
	
	}
	
}
