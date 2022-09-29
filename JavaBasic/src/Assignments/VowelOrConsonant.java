package Assignments;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char res;
		res = checkAlphabate('f');
		if(res=='v')
			System.out.println("The given alphabate is Vowel");
		else
			System.out.println("The given alphabate is Consonant");

	}
	
	public static char checkAlphabate(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			return 'v';
		else
			return 'c';
	}

}
