//Create a method to find the sum of the cubes of the digits of an n digit number

import java.util.Scanner;
class SumOfCubesOfDigts{


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the number: ");			
		long number=scan.nextLong();
		System.out.println("The sum is "+cubeSum(number));

	}
	static long cubeSum(long number){				
		long n=number,t;
		long sum=0;
		while(n>0){						//EXTRACTING EACH DIGIT AND THEN CALCULATING CUBE
			t=n%10;
			sum=sum+t*t*t;
			n/=10;
		}
		return sum;
	}
}