package Assignment_01;
import java.util.*;
/*
 * Q6. As given there are two sample methods: First one returns the sum of
    two numbers a and b and second one returns the subtraction of a and b.
    Use ternary operator to call
   these two methods. If a>b then ternary should call sum(a,b) but if a<b
   then ternary operator should call sub(a,b). Eventually print the result of
   the ternary operation on variable a and b.
 */
public class Q06 {

	public static void main(String[] args) {
		
       int a,b;
       Scanner sc=new Scanner(System.in);
       a=sc.nextInt();
       b=sc.nextInt();
       AddSub obj=new AddSub();
       int result=(a>b)?obj.add(a,b):obj.subtraction(a,b);
       System.out.println("Result after operation: "+result);
	}

}
class AddSub
{
	int add(int a,int b)
	{
		return a+b;
	}
	int subtraction(int a,int b)
	{
		return a-b;
	}
}

