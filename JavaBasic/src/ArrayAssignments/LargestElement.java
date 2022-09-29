package ArrayAssignments;


import java.util.Scanner;


public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]= s.nextInt();
			//empId[i]=in.nextInt();
		}
		System.out.println("Your array is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		int resMax = findLargest(a);
		System.out.println("\nLargest element from array is: "+resMax);
		int resMin = findSmallest(a);
		System.out.println("\nSmallest element from array is: "+resMin);

	}
	
	public static int findLargest(int[] b)
	{
		int max=b[0];
		for(int i=0;i<b.length;i++)
		{
			if(max<b[i])
				max=b[i];
		}
		return max;
	}
	
	public static int findSmallest(int[] b)
	{
		int min=b[0];
		for(int i=0;i<b.length;i++)
		{
			if(min>b[i])
				min=b[i];
		}
		return min;
	}
}
