package org.campus02.pr1.ue.emp;

import java.util.ArrayList;

public class Employee {

	private int empNumber;
	private String name;
	private double salary;
	private String department;
	
	private String role;
	
	private Employee superior;
	private ArrayList<Employee> subordinates = new ArrayList<>();
	
	public Employee(int empNumber, String name, double salary, String department, String role) {
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.role = role;
	}
	
	public Employee(int empNumber, String name, double salary, String department) {
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public int getEmpNumber() {
		return empNumber;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employee getSuperior() {
		return superior;
	}

	public void setSuperior(Employee superior) {
		this.superior = superior;
	}

	public ArrayList<Employee> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(ArrayList<Employee> subordinates) {
		this.subordinates = subordinates;
	}
	
	public void addSubordinate(Employee subordinate) {
		subordinates.add(subordinate);
	}

	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", name=" + name + ", salary=" + salary 
				+ ", department=" + department + ", role=" + role + "]";
	}
	
}
