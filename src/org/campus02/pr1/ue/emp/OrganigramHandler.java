package org.campus02.pr1.ue.emp;

public class OrganigramHandler {
	
	public static String getChainOfCommand(Employee employee) {
		
		String chain = employee.getName()  
							+ " ["+employee.getRole()+ "]";
		
		if(employee.getSuperior() == null) {
			return chain;
		}
		
		return chain + " -> " + getChainOfCommand(employee.getSuperior());
	}

}
