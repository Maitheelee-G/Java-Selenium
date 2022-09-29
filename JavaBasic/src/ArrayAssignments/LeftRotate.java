package ArrayAssignments;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		System.out.println("Original array is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		int[] res = leftRotate(a);
		System.out.println("\nLeft Rotated array is: ");
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		
		int[] b = {1,2,3,4,5};
		System.out.println("\nOriginal array is: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		

		int[] res1 = rightRotate(b);
		System.out.println("\nRight Rotated array is: ");
		for(int i=0;i<res1.length;i++)
		{
			System.out.print(res1[i]+" ");
		}
	}

	static int[] leftRotate(int[] b)
	{
		int dummy=b[0];
		for(int i=0;i<b.length;i++)
		{
			if(i<b.length-1)
			{
			b[i]=b[i+1];
			}
		}
		b[b.length-1]=dummy;
		return b;
	}
	
	static int[] rightRotate(int[] b)
	{
		int dummy=b[b.length-1];
		for(int i=b.length-1;i>=0;i--)
		{
			if(i>0)
			{
			b[i]=b[i-1];
			}
		}
		b[0]=dummy;
		return b;
	}
}
