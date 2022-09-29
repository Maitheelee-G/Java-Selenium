package Assignment2;

public class AllInOne {
	
	// Global Variable ---> Static and non-static global variable
	static int l,b,side,rad;
	final static double PI=3.14;
	double areaCir, areaRect, areaTri;
	
	//constructor
	
	AllInOne(int r)
	{
		//double circum=2*PI*r;
		System.out.println("Radius of the circle is: "+r);
	}

	//constructor overloading
	
	AllInOne(int side)
	{
		//double circum=2*PI*r;
		System.out.println("Side of the Triangle is: "+side);
	}
		// blocks---> static and non-static block
	
	static
	{
		System.out.println("*****And the Calculation Begins......**********");
	}	
	
	{
		System.out.println("*************************Here is the Partition***********************");
	}	
	
	AllInOne(int l, int b)
	{
		//double circum=2*PI*r;
		System.out.println("Length of Rectangle is: "+l);
		System.out.println("Breadth of Rectangle is: "+b);
	}
		
	// method or function ---> can have static or non-static method with local variables
		
	static void area(int r)
	{
		double res=0;
		res= PI*r*r;
		System.out.println("Area of Circle is: "+res);		
	}
	
	//method overloading
	void area(int l, int b)
	{
		double res= l*b;
		System.out.println("Area of Rectangle is: "+res);
	}
		
		//this keyword & this() statement

		public static void main(String[] args)
		{
			//local variable

			int radius=10, len = 20, brd= 30;
			AllInOne obj1 = new AllInOne(radius);
			area(radius);
			AllInOne obj2 = new AllInOne(len, brd);
			obj2.area(len,brd);
			
			
		}

	
}
