package Assignment_01;

/*
 * Q8. WAP in java, to delete index=3, element from the given array
       mentioned below.
       Int[] arr = {1,2,3,4,5,6,7,8,9}
       Note: Non relevance places would be filled with zeros.
 */
public class Q8 {

	public static void main(String[] args) {
		
		int arr[]=new int[9];
		for(int i=0;i<9;i++)
		{
			arr[i]=i+1;
		}
		for(int i=3;i<8;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[8]=0;
		System.out.print("Array after deleting index 3 element: ");
		for(int i=0;i<9;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
