package questionPractice;
 
import java.util.Scanner;
public class Question_01 {

	public static void main(String[] args) {
		
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        String name;
        int age;
        String section;
        float percentage;
        student obj1[]=new student[6];
        for(int i=0;i<6;i++)
        {   
        	name=sc.nextLine();
        	age=sc.nextInt();
        	sc.nextLine();
        	section=sc.nextLine();
        	percentage=sc.nextFloat();
        	sc.nextLine();
        	obj1[i]=new student(name,age,section,percentage);	
        }
        float sum=0,avg;
        for(int i=0;i<6;i++)
        {
        	sum+=obj1[i].percentage;
        }
        avg=sum/6;
        System.out.println("Average of perecntage of 6 students: "+avg);
        
	}

}
class student
{
	String name;
	int age;
	String section;
	float percentage;
	student(String name1,int age1,String section1,float percentage1)
	{
		name=name1;
		age=age1;
		section=section1;
		percentage=percentage1;
	}
}
