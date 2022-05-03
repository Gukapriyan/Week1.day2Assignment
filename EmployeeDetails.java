package week1.day2Assignment3;

public class EmployeeDetails {
	public void printEmployeeName(String empName, int empId) {
		System.out.println(" empName & empId " + empName +" "+ empId);
			
		}
		
		public void getEmployeeAddress(String empAddress) {
			System.out.println("Employee address: "+ empAddress);
			
		}
		
		public void printEmployeeSalary(double empSalary) {
			System.out.println("Employee salary: "+ empSalary);
			
			
		}
		 public void printEmployeeMobileNumber(long mobNumber) {
			 System.out.println("Employee number: "+ mobNumber);
			
			 
		}
		
		
		
		public static void main(String[] args) {

			EmployeeDetails object=new EmployeeDetails();
			
			object.printEmployeeName("Gukan", 18);
		    object.getEmployeeAddress("77,Mahalashmi Nagar,Andiyarplayam,Thavalakuppam,Puducherry- 605007");
			object.printEmployeeSalary(50000.50);
			object.printEmployeeMobileNumber(7598704010l);
			
		}

	}
	