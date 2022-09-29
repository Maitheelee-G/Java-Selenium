package ClassWork;


//parent class
class Company {
	//global variable
	int G;
	
	//method with method overloading use of this keyword
	void Display()
	{
		System.out.println("Hi..I'm Parent Display");
	}
	
	void Display(int G)
	{
		//this.G= G;
		System.out.println("Without this keyword: "+G);
		System.out.println("Using this keyword: "+this.G);
	}
	//constructor with overloading and use of this()
	Company()
	{
		System.out.println("This is Parent Constructor..");
		
	}
	
	Company(int G)
	{
		this();
		this.G = G;
		System.out.println("This is parameterized Parent Constructor " +this.G);
		
	}
	
}
//child class of Company
class Employee extends Company {
	//global variable name as Company name variable
	int G;
		//method with method overloading use of this & super keyword
	void Display()
	{
		System.out.println("This is the information of Employee..");
		
	}
	
	void Display(int G)
	{
		super.G = G;
		this.G = G;
		System.out.println("This is local G: "+G);
		System.out.println("This is Global G of class Employee: "+this.G);
		System.out.println("This is Global G of class Company(Parent class): "+super.G);
	}
		//constructor with overloading and use of this() & super()
	Employee()
	{
		System.out.println("This is child class Constructor");
	}
	
	Employee(int G)
	{
		this();
		
		this.G= G;
		super.G = G;
		System.out.println("This is child class Parameterized Constructor who includes this()");
	}
	
	Employee(int G, int M)
	{
		super(10);
		
	
		System.out.println("This is child class Parameterized Constructor who includes super()");
	}
}
public class Inheritance10 {

	public static void main(String[] args) 
	{
		Company c = new Company(67);
		c.Display();
		c.Display(10);
		System.out.println("*************Calling Child Class Employee*****************************");
		Employee e = new Employee(30,40);
		System.out.println("*************Calling Display Methods of  Employee*****************************");
		e.Display();
		e.Display(50);
		c.Display(50);
		
		//access all the above class members
	}

}