package Encapsul;

class Employee {
	private String employeeName;
	private int employeeID;
	private String employeePosition;

	
	

	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public int getEmployeeID() {
		return employeeID;
	}



	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}



	public String getEmployeePosition() {
		return employeePosition;
	}



	public void setEmployeePosition(String employeePosition) {
		this.employeePosition = employeePosition;
	}

class Salary extends Employee{
	private int employeeSalary;

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		
		
		e.setEmployeeName("Hridita");
		e.setEmployeeID(111777);
		e.setEmployeePosition("Associate");
		
		
		System.out.println("The details of: " + e.getEmployeeName() + " is: ");
		System.out.println(e.employeeID);
		System.out.println(e.employeePosition);
		
		

	}

}
