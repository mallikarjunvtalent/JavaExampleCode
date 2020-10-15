package Collections;

import java.util.ArrayList;

public class EmpSearch {
	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(101,"A",1000,"java"));
		al.add(new Emp(102,"B",2000,"java"));
		al.add(new Emp(103,"C",3000,".net"));
		System.out.println(al.contains(new Emp(102,"B",2000,"java")));
		System.out.println(al);
		System.out.println(al.get(4));
	}
}
