package org.campus02.pr1.ue.emp;

public class OrganigramHandler {

	public static String getChainOfCommand(Employee employee) {

		String chain = employee.getName() + " [" + employee.getRole() + "]";

		if (employee.getSuperior() == null) {
			return chain;
		}

		return chain + " -> " + getChainOfCommand(employee.getSuperior());

	}

	public static String getChainOfCommand(Employee employee, int length) {

		String chain = employee.getName() + " [" + employee.getRole() + "]";

		if (employee.getSuperior() == null) {
			return chain + " (" + length + ")";
		}

		return chain + " -> " + getChainOfCommand(employee.getSuperior(), length + 1);
	}
	
	public static String processHierarchy(Employee emp) {

		if(emp.getSubordinates().isEmpty()) {
			return " - "+emp.getRole() + " ["+emp.getName()+"]\n";
		}
		
		String result = " + "+emp.getRole() + " ("+emp.getName()+")\n";
		
		for(Employee e : emp.getSubordinates()) {
			result += processHierarchy(e);
		}
		
		return result;
		
	}
	
	public static String processHierarchy(Employee emp, String indent) {

		if (emp.getSubordinates().size() == 0) {
			return indent + " - " + emp.getRole() + " [" + emp.getName() + "]\n";
		}

		String result = indent + " + " + emp.getRole() + " (" + emp.getName() + ")\n";
		indent += "   ";

		for (Employee e : emp.getSubordinates()) {
			result += processHierarchy(e, indent);
		}

		return result;
	}

}
