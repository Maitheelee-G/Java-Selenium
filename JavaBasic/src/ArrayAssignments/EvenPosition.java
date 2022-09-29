package ArrayAssignments;

public class EvenPosition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		System.out.println("The Even positioned elements from array is: ");
		evenPosition(a);
		System.out.println("\nThe Odd positioned elements from array is: ");
		oddPosition(a);
//		System.out.println("The reversed array is: ");
//		for(int i=0; i<res.length; i++)
//		{
//			System.out.print(res[i]+" ");
//		}

	}
	
	static void evenPosition(int[] a)
	{
		
		//int[] b = new int[a.length];
		//int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
				System.out.print(a[i]+" ");
			
		
		}
		//return b;
	}
	
	static void oddPosition(int[] a)
	{
		
		//int[] b = new int[a.length];
		//int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
				System.out.print(a[i]+" ");
			
		
		}
		//return b;
	}
}
