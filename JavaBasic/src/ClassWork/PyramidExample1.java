package ClassWork;


public class PyramidExample1 {

	public static void main(String[] args) {

		for(int i=0;i<5;i++) {			
			for(int j=0;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("+++++++++++++++++++++++++++++");
		for(int i=0;i<5;i++) {			
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("+++++++++++++++++++++++++++++");
		for(char i='a';i<'e';i++) {			
			for(char j='a';j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("++++++++++++++++++++++++++++++");
		for(int i=5;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			}
		
		
		System.out.println("+++++++++++++++++++++++++++++++++");
		int evenNum=0;
		for(int i=0;i<5;i++)
		{
			evenNum=0;
			for(int j=0;j<=i;j++)
			{
					System.out.print(evenNum+" ");		
					evenNum=evenNum+2;
					
			}
			System.out.println();
		}
		System.out.println("+++++++++++++++++++++++++++++++++");
		int oddNum=0;
		for(int i=0;i<5;i++)
		{
			oddNum=1;
			for(int j=0;j<=i;j++)
			{
					System.out.print(oddNum+" ");		
					oddNum=oddNum+2;
					
			}
			System.out.println();
		}
		}
		}

	

	//System.out.println("++++++++++++++++++++++++++++++++");
//	for(int i=0; i<=5; i++)
//	{
//		System.
//	}

