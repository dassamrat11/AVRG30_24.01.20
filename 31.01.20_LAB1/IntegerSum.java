//Write a Java program that reads a line of integers and then displays each integer and the
//sum of all integers. (Use StringTokenizer class)


import java.util.*;


class IntegerSum{

	public static void main(String[] args) {
		int n,sum=0;



		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a list Number: ");			//TAKING LIST OF NUMBERS

		StringTokenizer stoken = new StringTokenizer(scan.nextLine(), " "); //TOKENZING

		while (stoken.hasMoreTokens()) {
            n=Integer.parseInt(stoken.nextToken()); 		//PARSING STRING TO INTEGER
        	System.out.println(n);
        	sum=sum+n;										//SUMMING UP NUMBERS	
        }
 		System.out.println("The sum is "+sum);  //PRINT THE SUM
	}
}