/*
 Create a method to check if a number is a power of two or not
*/

 import java.util.Scanner;
import java.lang.*;
class CheckPowerTwo{


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the number: ");			//TAKING THE NUMBER
		Integer n=scan.nextInt();

		if(checkNumber(n))
		 System.out.println("It is a power of two");
		else
			System.out.println("It is not a power of two");

		}

		static boolean checkNumber(Integer n){					//FUNCTION FOR CHECKING 
			if(n==0)
				return false;									//IF N->0 THEN NOT POWER OF TWO

				if((n&(n-1))==0)								//N->1000 THEN (N-1)->0111, N BITWISE AND (N-1) PRODUCE 0
					return true;								//N->1010 THEN (N-1)->1001, N BITWISE AND (N-1) PRODUCE 1000
						
				return false;
			}




}
