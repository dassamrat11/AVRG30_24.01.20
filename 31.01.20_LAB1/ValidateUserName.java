/*
 You are asked to create an applic
ation for registering the details of jobseeker. The
requirement is:
Username should always end with _job and there should be at least minimum of 8 characters to the
left of _job. Write a function to validate the same. Return true in case the validation is
passed. In case
of validation failure return false

*/

import java.util.Scanner;
class ValidateUserName{


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the username: ");			
		String str=new String(scan.next());
		if(validateUName(str))
			System.out.println("Valid User Name");
		else
			System.out.println("Not a valid User Name");

	}

	static boolean validateUName(String str){
			int len=str.length();
			int before_job_len=len-4;
			String job=new String("_job");
			String subone=str.substring(0,before_job_len);					//EXTRACTING THE SUBSTRING BEFORE _JOB
			String subtwo=str.substring(before_job_len,len);				//EXTRACTING THE SUBSTRING  _JOB TO LAST
			if(subtwo.matches(job)&&(subone.length()>7))					//CHECKING VALIDATION
				return true;
			return false;

	}
}