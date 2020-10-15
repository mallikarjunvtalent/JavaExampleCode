package opps;


class SuperClass{
	
	public Number method() {
		return 5;
	}
	
	public int method(int n) {
		return n+1;	
	}
	
}

class SubClass extends SuperClass{
//	public int method() {   
//		return 6;         compile time error
//	}
	
	public Number method() {
		return 6;
	}
	
	public int method(int n) {
		return n+2;	
	}
}

public class OverridingTest {

	public static void main(String[] args) {
		
		SuperClass class1 = new SubClass();
		
		System.out.println(class1.method());
		System.out.println(class1.method(0));
	}
	
}
