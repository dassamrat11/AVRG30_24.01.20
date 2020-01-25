// Write a java program which take a decimal number from user at runtime and then prints it's binary equivalent.

public class AssignmentOne_Six{
	
	public static void decimalToBinary(int number){ //recursive function for decimal to binary
	if(a>0)
	{
		decimalToBinary(number/2); 	//dividing the number by 2
		System.out.print(number%2);  //obtaining the remainder
	}
	else{
		
			System.out.print(0);	//if zero ocurs then print 0
	}
}


public static void main(String[] args) {
	


	int number=Integer.parseInt(args[0]);
	decimalToBinary(number);
	

}
}