/*
Write a Java Program to validate the full name of an employee. Create and throw a
user defined exception if firstName and lastName is blank
*/



import java.util.Scanner;
class MyException extends Exception{
	MyException(){
		super();
			}
}
class NameValidation{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name:");
		String firstName = scan.nextLine();
		System.out.println("Enter your last name: ");
		String lastName = scan.nextLine();
		try{  
			 if(firstName.isEmpty() || lastName.isEmpty()){
			 	throw new MyException();
			 }

		} catch(MyException e){
			System.out.println("Caught Exception");
			System.out.println("Invalid user name");
			return;
		}
		System.out.print("Entered name is valid..");
	}
}