package ArrayAssignments;

import java.util.Scanner;

public class SortAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] a = new int[5];
		System.out.println("Enter elements of Array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			
		}
		System.out.println("Array is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
						
		}
		System.out.println("Ascending Sorted Array is: ");

		int[] res= sortAcsend(a);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
						
		}
		int[] a1 = new int[5];
		System.out.println("Enter elements of Array:");
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=s.nextInt();
			
		}
		System.out.println("Array is: ");
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(a1[i]+" ");
						
		}
		
		System.out.println("Descending Sorted Array is: ");

		int[] res1= sortDecsend(a1);
		for(int i=0;i<res1.length;i++)
		{
			System.out.print(res1[i]+" ");
						
		}
	}

	
	public static int[] sortAcsend(int[] b)
	{
		//int min = b[0];
		//int[] c = new int[b.length];
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				int temp=0;

				if(b[i]>b[j])
				{
					temp = b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		return b;
	}
	
	public static int[] sortDecsend(int[] b)
	{
		//int min = b[0];
		//int[] c = new int[b.length];
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				int temp=0;

				if(b[i]<b[j])
				{
					temp = b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		return b;
	}
}
