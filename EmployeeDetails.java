package week1.day2;

public class EmployeeDetails {

	public static void main(String[] arg) {
	
	EmployeeDetails company = new EmployeeDetails();
	company.printEmployeeName("Yuvarani",562);
	company.getEmployeeAddress("karur");	
	company.printEmployeeSalary(98733.34);
	company.printEmployeeMobileNumber(638738697);
		}
	
	public void printEmployeeName(String empName,int empid) {
		System.out.println("EmpName:"+empName);
		System.out.println("Empid:"+empid);
	}
	
	public void getEmployeeAddress(String empAddress) {
		System.out.println("EmpAddress:;"+empAddress);
		
	}
	
	public void printEmployeeSalary (double empSalary) {
		System.out.println("EmpSalary:"+empSalary);
		
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("MobileNumber:"+mobNum);
	}
}
