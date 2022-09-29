package day13.pack2;

import day13.pack1.ProtectedMembers;
import day13.pack1.PublicMembers;
		//or
//import day13.pack1.*;
class AccessProtectedMembers extends ProtectedMembers {

	public static void main(String[] args) {
		
		AccessProtectedMembers p1=new AccessProtectedMembers();
		System.out.println("Accessing Protected members from another class outside of package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class TestProtectedMembers extends AccessProtectedMembers{
	public static void main(String[] args) {
	AccessProtectedMembers p1=new AccessProtectedMembers();
	//System.out.println(p1.accNum); //not accessible from child class
	//p1.displayAccNum(); //not accessible from child class
	PublicMembers p2=new PublicMembers();
	}
}
/*
using inheritance we can access protected members from outside the package
*/