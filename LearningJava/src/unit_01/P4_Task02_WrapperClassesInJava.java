package unit_01;
/*
 * The Wrapper class in java provides the mechanism to convert primitive inti object and
 * Why??
 * Because we want to sue predefined method of those objects
 * - boolean data type ->boolean object: -> obj.toString();
 * 
 * */

public class P4_Task02_WrapperClassesInJava {

	public static void main(String[] args) {
		
		//Converting int into Integer
		int a = 20;
		
		String s = "" + a + "";
		
		Integer i = Integer.valueOf(a); // converting int into Integer explicity
		Integer j = a; //auto-boxing, now complier will write Integer.valueOF(a) internally
		
		System.out.println(a + " " + i + " " + j);
		
		System.out.println(i.toString());
		
		//a.toString()  can not be done due to a is int not object
		
		//Auto-boxing : Converting primitives into objects
		
		byte b = 10;
		Byte byteobj=b;
		
		System.out.println(byteobj);
		
		//Un_boxing : converting Object to Primitives
		
		byte bytevalue=byteobj;
		System.out.println(bytevalue);
		

	}

}