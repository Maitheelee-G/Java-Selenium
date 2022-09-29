package Assignments_ForLoops;

public class DisplayUpperAlphabates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Uppercase Alphabates are: ");
		upperCase();
		DisplayUpperAlphabates obj1 = new DisplayUpperAlphabates();
		System.out.println("\nThe Lowercase Alphabates are: ");
		obj1.lowerCase();
	}
	
	static void upperCase()
	{
		for (char c='A'; c<='Z';c++)
		{
			System.out.print(c+" ");
		}
	}

	 void lowerCase()
	{
		for (char ch='a'; ch<='z';ch++)
		{
			System.out.print(ch+" ");
		}
	}

}
