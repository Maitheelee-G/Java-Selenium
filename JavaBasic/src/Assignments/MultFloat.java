package Assignments;

public class MultFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x= 2.3f, y=3.4f;  // can use double also
		float m = multiplication(x,y);  //double
		System.out.println("Multipliction of floating point numbers 2.3 & 3.4 is: "+m);
		//multiplication(2.3)
	}
	
	static float multiplication(float a, float b)  //double
	{
		float res = a*b;  //double
		return res;
	
	}

}
