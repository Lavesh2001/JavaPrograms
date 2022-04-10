package unit_01;
import java.util.*;
import java.time.LocalDate;
/* Problem Statements: P7_SwitchStatements:
   Create a switch Statement [Manual],In which
   a. When you pass 1 your program would print current year
   b. When you pass 2 your program would print current month
   c. When you pass 3 your program would print current day
   d. When you Pass 4 your program would print Not applicable
 
 */
public class P7_SwitchStatements {

	public static void main(String[] args) {
		SwitchStatements obj=new SwitchStatements(); 
		obj.switchStatements();
	}

}
class SwitchStatements
{   
	Scanner sc= new Scanner(System.in);
	void switchStatements()
	{   
		System.out.print("Enter 1-year,2-month,3-day: ");
		int c=sc.nextInt();
		LocalDate currentdate=LocalDate.now();
		switch(c)
		{
		case 1:System.out.println(currentdate.getYear());
		break;
		case 2:System.out.println(currentdate.getMonth());
		break;
		case 3:System.out.println(currentdate.getDayOfMonth());
		break;
		case 4:System.out.println("Not Applicable");
		break;
		}
		
	}
}
