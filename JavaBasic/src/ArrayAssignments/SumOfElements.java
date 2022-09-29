package ArrayAssignments;
import java.util.Scanner;
public class SumOfElements {

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
			System.out.println(a[i]+" ");
						
		}
		
		int res = sum(a);
		System.out.println("Sum of Elements of array is: "+res);
	}

	
	public static int sum(int[] b)
	{
		int s=0;
		for(int i=0;i<b.length;i++)
		{
			s=s+b[i];
						
		}
		return s;
	}
}
