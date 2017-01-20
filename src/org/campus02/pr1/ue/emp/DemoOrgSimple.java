package org.campus02.pr1.ue.emp;

public class DemoOrgSimple {

	public static void main(String[] args) {
		
		EmployeeManager em = new EmployeeManager();
		
		//create employees and build hierarchy
		//according to organigram in the exercise
		Employee ceo = new Employee(1, "Mitarbeiter 1", 7_500,
									"Management", "CEO");
		
		Employee cto = new Employee(2, "Mitarbeiter 2", 6_500,
									"Management", "CTO");
		cto.setSuperior(ceo);
		ceo.addSubordinate(cto);
		
		Employee dev1 = new Employee(3, "Mitarbeiter 3", 3_500,
									"Engineering", "Dev");
		dev1.setSuperior(cto);
		Employee dev2 = new Employee(4, "Mitarbeiter 4", 3_500,
									"Engineering", "Dev");
		dev2.setSuperior(cto);
		
		cto.addSubordinate(dev1);
		cto.addSubordinate(dev2);
		
		Employee hr = new Employee(5, "Mitarbeiter 5", 6_500,
									"Management", "HR");
		hr.setSuperior(ceo);
		ceo.addSubordinate(hr);
			
		//register all employees
		em.addEmployee(ceo);
		em.addEmployee(cto);
		em.addEmployee(hr);
		em.addEmployee(dev1);
		em.addEmployee(dev2);
			
		//show chain of command for all employees
		//without the chain length
		for(Employee e : em.getAllEmployees()) {
			System.out.println(OrganigramHandler.getChainOfCommand(e));
		}
		
		//show chain of command for all employees
		//including the chain length at the end
		for(Employee e : em.getAllEmployees()) {
			System.out.println(OrganigramHandler.getChainOfCommand(e,0));
		}
		
		//walking down the organigram without indent
		String result = OrganigramHandler.processHierarchy(ceo);
		System.out.println(result);

		//walking down the organigram with indent
		result = OrganigramHandler.processHierarchy(ceo,"");
		System.out.println(result);

	}

}
