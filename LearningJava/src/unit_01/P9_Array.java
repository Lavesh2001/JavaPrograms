package unit_01;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 4, 2, 3, 1, 6, 4, 3, 5, 2 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		int size=arr.length;
		for(int i=0;i<size-1;i++)
		{
			int mn=i;
			for(int j=i+1;j<size;j++)
			{
				if(arr[j]<arr[mn])
				{
					mn=j;
				}
			}
			if(mn!=i)
			{
				int temp=arr[i];
				arr[i]=arr[mn];
				arr[mn]=temp;
			}
		}
		System.out.print("Aarray after sorting:");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}

	}

	void findTheDuplicateElements(int[] arr) {
		// write code here!
		System.out.print("\nDuplicates element in the array are:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]);
					System.out.print(" ");
					break;
				}
			}
		}

	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		// write code here! 
		int l1=arr[0],l2=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>l1)
			{   
				l2=l1;
				l1=arr[i];
			}
			else
			{
				if(arr[i]>l2)
				{
					l2=arr[i];
				}
			}
			
		}
		System.out.print("\nLargest element in the array: ");
		System.out.println(l1);

		System.out.print("Second Largest element in the array: ");
		System.out.println(l2);

	}

	void leftRotationInAnArray(int[] arr) {
		// write code here! 
		int temp=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		System.out.print("Aarray after left rotating the array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}

	}

	void removeElementInArray(int[] arr) {
		// write code here! 
		

	}

}