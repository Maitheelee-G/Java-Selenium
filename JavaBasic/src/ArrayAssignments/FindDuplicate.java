package ArrayAssignments;

public class FindDuplicate 
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,2,4,5,4,5};
		findDuplicateItem(a);
		
	}

	static void findDuplicateItem(int[] b)
	{
		//int[] dupl=new int[b.length];
		//int flag = 0;
		for(int i=0;i<b.length;i++)
		{
			//flag=0;
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
				{
					//flag=1;
					System.out.print(b[i]+" ");
					//break;
					//dupl[i]=b[i];
					//b[j]=-1;
				}
				
					
			}
			
		}
		
	}

}
