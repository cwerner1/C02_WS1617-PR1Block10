package org.campus02.pr1.ue.emp;

import java.util.ArrayList;

public class EmployeeManager {

	private ArrayList<Employee> employees = new ArrayList<Employee>();

	public void addEmployee(Employee e) {
		employees.add(e);
	}

	public Employee findByMaxSalary() {
		double max = 0.0;
		Employee found = null;
		for (Employee e : employees) {
			if (e.getSalary() > max) {
				max = e.getSalary();
				found = e;
			}
		}
		return found;
	}

	public Employee findByEmpNumber(int number) {
		for (Employee e : employees) {
			if (e.getEmpNumber() == number) {
				return e;
			}
		}
		return null;
	}

	public ArrayList<Employee> findByDepartment(String department) {
		ArrayList<Employee> found = new ArrayList<>();
		for (Employee e : employees) {
			if (department.equals(e.getDepartment())) {
				found.add(e);
			}
		}
		return found;
	}
	
	public ArrayList<Employee> getAllEmployees() {
		return employees;
	}

}
