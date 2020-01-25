//Write a java program to print fibonocci series from 1 to 89

public class AssignmentOne_Two{

public static void main(String[] args) {
	
	int firstnumber=1,secondnumber=1,thirdnumber=2;
		System.out.println(firstnumber);	// 1st fibonacci number
		System.out.println(secondnumber);	// 2nd fibonacci number
		
	do{
		System.out.println(thirdnumber);  
		
		firstnumber=secondnumber;				//changing values
		secondnumber=thirdnumber;
		thirdnumber=firstnumber+secondnumber;
	}while(thirdnumber<=89);   //limit upto 89

}

}