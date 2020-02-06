/*
Write a Java program that prompts the user for an integer and then prints out all the prime
numbers up to that Integer.
*/



import java.lang.Exception;
import java.util.*;

class PrimeNumbers{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, j , count=0;
		System.out.print("Enter a range to print prime numbers: ");
		try{
			 n = sc.nextInt();
		}catch(InputMismatchException e)
			{
			System.out.print("The Input entered is incorrect");
			return;
			}	

		for (i=1 ; i<=n ; i++) {
			j=1;
			while(j<=i)
				{if (i%j == 0)
					count ++;
				j++;
				}	
			if (count == 2) 
				System.out.print(i + " ");	
		count=0;	
		}

	}
}