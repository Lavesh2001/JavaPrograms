package unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s2);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		// Write Logic Here! 
		int l=s.length()-1;
		int i=0;
		while(i<l)
		{
			if(s.charAt(i)==s.charAt(l))
			{
				l--;
				i++;
				continue;
			}
			else
			{
				break;
			}
		}
		if(i<l)
		{
			System.out.println("String is Not Palindrome");
		}
		else
		{
			System.out.println("String is Palindrome");
		}
	}

	void reverseOfAString(String s) {
		// Write Logic Here!
		int l=s.length()-1;
		String str="";
		while(l>=0)
		{
			str=str+s.charAt(l);
			l--;
		}
		s=str;
		System.out.print("String after reversing: ");
		System.out.println(s);

	}
	
	void stringEqualOrNot(String s1,String s2) {
		// Write Logic Here!
		if(s1==s2)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		
	}
}