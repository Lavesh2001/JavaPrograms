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
public class Q5 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         Employee obj[]=new Employee[2];
         String name;
         int age;
         int salary;
         String department;
         for(int i=0;i<2;i++)
         {
      	   name=sc.nextLine();
      	   age=sc.nextInt();
      	   sc.nextLine();
      	   department=sc.nextLine();
      	   salary=sc.nextInt();
      	   sc.nextLine();
      	   obj[i]=new Employee(name,age,department,salary);   
         }
          System.out.println("Salary of deparment A: "+obj[0].A);
          System.out.println("Salary of deparment B: "+obj[0].B);
          System.out.println("Salary of deparment C: "+obj[0].C);
          System.out.println("Salary of deparment D: "+obj[0].D);
	}

}
class Employee
{
	String name;
	int age;
	String department;
	int salary;
	static int A=0,B=0,C=0,D=0;
	Employee(String name1,int age1,String department1,int salary1)
	{
		name=name1;
		age=age1;
		department=department1;
		salary=salary1;
		if(department=="A")
		{
			if(salary<=30000)
			{
				A+=salary;
			}
			else
			{
				A+=25000;
			}
		}
		else if(department=="B")
		{
			if(salary<=30000)
			{
				B+=salary;
			}
			else
			{
				B+=25000;
			}
		}
		else if(department=="C")
		{
			if(salary<=30000)
			{
				C+=salary;
			}
			else
			{
				C+=25000;
			}
		}
		else
		{
			if(salary<=30000)
			{
				D+=salary;
			}
			else
			{
				D+=25000;
			}
		}
	}
}
