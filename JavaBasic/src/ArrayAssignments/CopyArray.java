package ArrayAssignments;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int[] res = copyOfArray(a);
		System.out.println("The copied array is: ");
		for(int i=0; i<res.length; i++)
		{
			System.out.print(res[i]+" ");
		}

	}
	
	static int[] copyOfArray(int[] a)
	{
		
		int[] b = new int[a.length];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			b[j]=a[i];
			j++;
		}
		return b;
	}

}
