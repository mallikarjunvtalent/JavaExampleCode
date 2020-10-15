package Collections;

public class Emp {
	int id;
	String name;
	double sal;
	String dept;

	public Emp(int id, String name, double sal, String dept) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Emp) {
			Emp e = (Emp)obj;
			return(this.id==e.id)&&(this.dept.equals(e.dept));
		}
		return false;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + ", dept=" + dept + "]";
	}
	
	
}
