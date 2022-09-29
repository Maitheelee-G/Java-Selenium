package ClassWork;


class ABC {
	void myMethod() {
		System.out.println("method of ABC class");
	}
}
class Overriding1 extends ABC {
	public void myMethod() {
		// This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("Overriding method of Class Overriding4");
	}
	public static void main(String args[]) {
		Overriding1 obj = new Overriding1();
		obj.myMethod();
	}
}