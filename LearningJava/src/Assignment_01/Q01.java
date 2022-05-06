package Assignment_01;
import java.util.*;
/*
 * Q1- WAP which would contain 6 objects, of a class
       Student. Student [Name, Age, section, percentage]. They all belong to
       Section-A. Your program would be able to find the average percentage of
       students in this section. Use constructors to create these 6 objects and
       input from Scanner class.
 */

public class Q01 {

	public static void main(String[] args) {
		
           Scanner sc=new Scanner(System.in);
           Student obj[]=new Student[6];
           String name;
           int age;
           float percentage;
           String section;
           for(int i=0;i<6;i++)
           {
        	   name=sc.nextLine();
        	   age=sc.nextInt();
        	   section="A";
        	   percentage=sc.nextFloat();
        	   sc.nextLine();
        	   obj[i]=new Student(name,age,section,percentage);   
           }
           float sum=0,avg;
           for(int i=0;i<6;i++)
           {
           	sum+=obj[i].percentage;
           }
           avg=sum/6;
           System.out.println("Average of perecntage of 6 students: "+avg);
	}

}
class Student
{
	String name;
	int age;
	String section;
	float percentage;
	Student(String name1,int age1,String section1,float percentage1)
	{
		name=name1;
		age=age1;
		section=section1;
		percentage=percentage1;
	}
}
