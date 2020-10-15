package Abstraction;

import java.util.HashSet;

public class Employee {
 public String name;
 
 @Override
 public int hashCode() {
  return 31;
 }
 
 @Override
 public boolean equals(Object obj) {
  return true;
 }
 
 
 
 public static void main(String args[]) {
  Employee employeeOne = new Employee();
  Employee employeeTwo = new Employee();
  employeeOne.name = "John";
  employeeTwo.name = "Martin";
  HashSet employeeSet = new HashSet();
  employeeSet.add(employeeOne);
  employeeSet.add(employeeTwo);
  System.out.println(employeeSet.size());
  System.out.println(employeeSet);
 }
}
