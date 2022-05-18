package unit_03;
import java.util.*;
import java.io.IOException;

public class SamleClass3 {

	public static void main(String[] args) {
		try {
			int a=100/0;
			System.out.println(a);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	    catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		// if there is no exception still finally will always run
		//  if there is  exception still finally will always run 
		// there is a try block and there is no catch block for handling that exception then Finally block run
		//finally block always run
		finally
		{
		System.out.println("Rest of the code");
		}
	}

}
