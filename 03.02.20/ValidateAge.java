/*

Validate the
age of a person and display proper message by using user defined
exception. Age of a person should be above 15
*/



import java.util.Scanner;
class MyException extends Exception{
	MyException(){
		super();
			}
}
class ValidateAge{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scan.nextInt();
		try{  
			 if(age < 15) {
			 	throw new MyException();
			 }

		} catch(Exception e){
			System.out.println("Caught Exception");
			System.out.println("Invalid age");
			return;
			}
		System.out.print("Entered age is valid..");
		return;
	}
}