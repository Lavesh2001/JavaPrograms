package Assignment_01;

import java.util.Scanner;

/*
 * 5Q. WAP in Java which would contain 8 objects of a Class Employee.
       Employee contains name, age, department, salary. Your program would
       be able to calculate the total salary to be paid in each department. Use
       constructors to create these 8 objects and Scanner to take inputs.
       Restrictions:
      1- Minimum 8 objects [can be created manually with parameterized
       constructors with Scanner input]
      2- Departments are, A, B, C, D: minimum 4 departments [String Type]
      3- If the Salary exceeds more than 30,000, then the default salary
      would be 25000 of any of the employee
      4- Use array of objects, instead of using multiple 8 objects separately
     Use:
     Employee arr[] = new Employee[8];
     And
     arr[i].department.equals("A");   
 */
public class Q05 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         Employee obj[]=new Employee[2];
         String name;
         int age;
         int salary;
         char department;
         int A=0,B=0,C=0,D=0;
         for(int i=0;i<2;i++)
         {
      	   name=sc.nextLine();
      	   age=sc.nextInt();
      	   sc.nextLine();
      	   department=sc.next().charAt(0);   
      	   salary=sc.nextInt();
      	     sc.nextLine();
      	   obj[i]=new Employee(name,age,department,salary);   
         }
         for(int i=0;i<2;i++)
         {
        	 if(obj[i].department=='A')
     		{
     			if(obj[i].salary<=30000)
     			{
     				A+=obj[i].salary;
     			}
     			else
     			{
     				A+=25000;
     			}
     		}
     		else if(obj[i].department=='B')
     		{
     			if(obj[i].salary<=30000)
     			{
     				B+=obj[i].salary;
     			}
     			else
     			{
     				B+=25000;
     			}
     		}
     		else if(obj[i].department=='C')
     		{
     			if(obj[i].salary<=30000)
     			{
     				C+=obj[i].salary;
     			}
     			else
     			{
     				C+=25000;
     			}
     		}
     		else
     		{
     			if(obj[i].salary<=30000)
     			{
     				D+=obj[i].salary;
     			}
     			else
     			{
     				D+=25000;
     			}
     		}
         }
          System.out.println("Salary of deparment A: "+A);
          System.out.println("Salary of deparment B: "+B);
          System.out.println("Salary of deparment C: "+C);
          System.out.println("Salary of deparment D: "+D);
	}

}
class Employee
{
	String name;
	int age;
	char department;
	int salary;
	Employee(String name1,int age1,char department1,int salary1)
	{
		name=name1;
		age=age1;
		department=department1;
		salary=salary1;
	}
}
