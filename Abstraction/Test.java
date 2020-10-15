package Abstraction;

class A{
	
	public static void m1() {
		System.out.println("class A m1 method");
	}
	
	public  void m2() {
		System.out.println("class A m2 method");
	}
	
}

class B extends A{
	
	public static void m1() {
		System.out.println("class B m1 method");
	}
	
	public void m2() {
		System.out.println("class B m2 method");
	}
}

public class Test {

	public static void main(String[] args) {

		A a = new A();
		
		a.m1();
		a.m2();
		
		a=new B();
		a.m1();
		a.m2();
		
		B b = new B();
		 
		b.m1();
		b.m2();
	}

}
