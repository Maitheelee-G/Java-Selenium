package ArrayAssignments;

public class CountFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 1, 2, 3, 3, 3, 3};
		int[] res = frequency(a);
		for(int i=0;i<res.length;i++)
		{
			if(res[i]!=-1)
				System.out.print("Frequency of "+a[i]+" is: "+res[i]);
		}
	}

	static int[] frequency(int[] b)
	{
		int count;
		int[] fr = new int[b.length];
		for(int i=0; i<b.length;i++)
		{
			count=1;
			//dummy = b[i];
			//fr[i] = dummy;
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
				{
					count++;
					fr[j]=-1;
				}
			}
			if(fr[i]!=-1)
				fr[i]=count;
			//System.out.println("Frequency of "+b[i]+" is:"+fr[i]);
		}
		return fr;
	}
}
