package Assignment_01;
import java.util.*;
/*
 * Q10. WAP in Java Program To Survey Four Different Car Models For Four
    Different Cities:
    Your job is to find out the total number of cars sold of each model in all
    the cities. Use Array of objects or multiple objects of class name City.
 */
public class Q10 {

	public static void main(String[] args) {
		
       Car obj[]=new Car[4];
       int marutiK10,zenastelo,wagnor,marutisx4;
       String cityname;
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<4;i++)
       {
    	   cityname=sc.nextLine();
    	   marutiK10=sc.nextInt();
    	   zenastelo=sc.nextInt();
    	   wagnor=sc.nextInt();
    	   marutisx4=sc.nextInt();
    	   sc.nextLine();
    	   obj[i]=new Car(cityname,marutiK10,zenastelo,wagnor,marutisx4);
    	   
       }
       int n1=0,n2=0,n3=0,n4=0;
       for(int i=0;i<4;i++)
       {
    	   n1+=obj[i].marutiK10;
    	   n2+=obj[i].zenAstelo;
    	   n3+=obj[i].wagnor;
    	   n4+=obj[i].marutiSX4;
       }
       System.out.println("Number of marutiK10:"+n1);
       System.out.println("Number of zenAstelo:"+n2);
       System.out.println("Number of wagnor:"+n3);
       System.out.println("Number of marutiSx4:"+n4);
       
	}

}
class Car
{
	String cityname;
	int marutiK10;
	int zenAstelo;
	int wagnor;
	int marutiSX4;
	Car(String str,int n1,int n2,int n3,int n4)
	{
		cityname=str;
		marutiK10=n1;
		zenAstelo=n2;
		wagnor=n3;
		marutiSX4=n4;
		
	}
}
