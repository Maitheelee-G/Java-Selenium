package ArrayAssignments;

public class ReverseArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int[] res = reverse(a);
		System.out.println("The reversed array is: ");
		for(int i=0; i<res.length; i++)
		{
			System.out.print(res[i]+" ");
		}

	}
	
	static int[] reverse(int[] a)
	{
		
		int[] b = new int[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
			
			b[j]=a[i];
			j++;
		}
		return b;
	}
}
