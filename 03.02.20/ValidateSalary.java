/*
Create an Exception class named as “EmployeeException”(User defined Exception) in a
package named as “com.cg.eis.exception” and th
row an exception if salary of an employee is below
than 3000. Use Exception Handling mechanism to handle exception properly.
*/
import java.util.Scanner;
class EmployeeException extends Exception{
	EmployeeException(){
		super();
			}
}
class ValidateSalary{
	public static void main(String[] args) {
		System.out.println("Enter employee salary");
		Scanner scan = new Scanner(System.in);
		int sal = scan.nextInt();
		try{
			if(sal < 3000)
              throw new EmployeeException();
			System.out.println("Valid");
			return ;
			
		}catch(Exception e){
			System.out.println("salary should not be less than 3000!");
			return;
		}
	}
}