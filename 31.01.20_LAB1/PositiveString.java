/*
Create a method that accepts a String and checks if it
is a positive string. A string is
considered a positive string, if on moving from left to right each character in the String comes after the
previous characters in the Alphabetical order. For Example: ANT is a positive String (Since T comes
after N and N c
omes after A). The method should return true if the entered string is positive.

*/

import java.util.Scanner;
class PositiveString{


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a String: ");			//TAKING LIST OF NUMBERS
		String str=new String(scan.next());
		if(chekcPositiveString(str))							//CALLING THE FUCTION TO CHECK POSITIVE
			System.out.println(str +" is a positive string");
		else
			System.out.println(str +" is a negetive string");
			

	}

	static boolean chekcPositiveString(String s){

		for(int i=0;i<s.length()-1;i++) 
		{
			if(s.charAt(i)>s.charAt(i+1)) //COMPARING CHARACTERS
				return false;
		}
		return true;
	}


}