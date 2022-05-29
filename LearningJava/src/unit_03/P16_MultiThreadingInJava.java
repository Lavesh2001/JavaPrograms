package unit_03;

import java.util.Scanner;

/*
 * Multi-Threading  
 * 
 * Multi-Processing
 *   -Sequential Multi-Processing
 *   -Parallel Multi-Processing 
 *   -concurrent Multi-Processing
 *  
 * Multi-Tasking
 *   -Sequential Multi-Tasking
 *   -Parallel Multi-Tasking
 *   -concurrent Multi-Tasking
 * 
 */
public class P16_MultiThreadingInJava {

	public static void main(String[] args) {
		
		Threading obj=new Threading();
		obj.threadConcept();
		obj.threadSynchronization();
		obj.interThreadCommunication();
		obj.ProducerConsumersProblems();
		obj.Wait_And_Notify();  
		
	
//		C1 obj1=new C1(); 
//		obj1.show1();
//		C2 obj2=new C2();
//		obj2.show2();
		Thread t1=new Thread(new T1());
		Thread t2=new Thread(new T2());
		t1.start();
		t2.start();
		Thread t3=new Thread(new T3());
		t3.start();
		
	}

}
class Threading
{
	void threadConcept()
	{
		
	}
	void threadSynchronization()
	{
		
	}
	void interThreadCommunication()
	{
		
	}
	void ProducerConsumersProblems()
	{
		
	}
	void Wait_And_Notify()
	{
		
	}
}
class C1 
{
	void show1()
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(a);
	}
}
class C2 
{
	void show2()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("hey show2!");
		}
	}
}
class T1 extends Thread
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(a);
	}
}
class T2 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("hey 2!");
		}
	}
}
class T3 extends Thread 
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("hey 3!");
		}
	}
}