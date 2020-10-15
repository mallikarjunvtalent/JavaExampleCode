package Basics;

class A{
	int speedLimit = 90;
}

class B extends A{
	int speedLimit = 150;
}

public class OverrideVariable {
public static void main(String[] args) {
	B b=new B();
	System.out.println(b.speedLimit);
	A a = new B();
	System.out.println(a.speedLimit);
}
}
