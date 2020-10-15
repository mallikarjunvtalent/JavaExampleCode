package Basics;

final class ImmutableClass{
	
	private final int id;
	private final String name;
	private final double sal;
	
	
	public ImmutableClass(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public double getSal() {
		return sal;
	}


	@Override
	public String toString() {
		return "ImmutableClass [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
	
}

public class ImmutableEmployee {

	public static void main(String[] args) {
		
		ImmutableClass immutableClass = new ImmutableClass(1,"Mallikarjun", 25000.00);
		ImmutableClass immutableClass1 = new ImmutableClass(1,"Arjun", 25000.00);
		System.out.println(immutableClass);
		System.out.println(immutableClass1);
		
		System.out.println(immutableClass.getId());
	}
	
}
