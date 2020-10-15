package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private long id;
	private long age;
	private String name;

	public Employee() {
	}

	public Employee(long id, long age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

}

public class TestStream {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();	
		
		
		employees.add(new Employee(1, 20,"Mallikarjun"));
		employees.add(new Employee(2, 25,"Thati"));
		employees.add(new Employee(3, 36,"Arjun"));
		employees.add(new Employee(4, 50,"Father"));
		employees.add(new Employee(5, 15,"Mother"));
		employees.add(new Employee(6, 28,"Brother"));
		employees.add(new Employee(7, 30,"Malli"));
		employees.add(new Employee(8, 35,"Hello"));
		employees.add(new Employee(9, 37,"World"));
		employees.add(new Employee(10, 40,"Welcome"));
		
		for(Employee employee :employees) {
			System.out.println(employee);
		}
		System.out.println();
		employees.stream()
		.filter(emp -> {
			return emp.getName().startsWith("M");
		//	return emp.getAge()>30;
		})
		.forEach(emp -> System.out.println(emp));
		
		long count=	employees.stream()
		.filter(emp -> emp.getAge()>30)
		.collect(Collectors.counting());
		System.out.println(count);
		
		employees.stream()
		.filter(emp -> emp.getAge() > 30)
		.collect(Collectors.groupingBy(employee1 -> employee1.getName() ));
		
		
		employees.stream()
		//.filter(emp -> emp.getName().startsWith("M"))
		.filter(emp -> emp.getAge()>30)
		.forEach(emp -> System.out.println(emp));
		
		
		
	}
}
