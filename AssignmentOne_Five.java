/*
Write a java program which takes 3 numbers from user at runtime, adds them. The program should print PASSING only once if the numbers are individually greater than or equal to 40 and their sum is greater than or equal to 125. Otherwise the output should be FAILING.

You don't have to use nested if's or logical operators in this program, not if else. You can use multiple ifs

*/
public class AssignmentOne_Five{

public static void main(String[] args) {
	int numberone=Integer.parseInt(args[0]);	//TAKING THREE NUMBERS
	int numbertwo=Integer.parseInt(args[1]);
	int numberthree=Integer.parseInt(args[2]);
	int sum=numberone+numbertwo+numberthree;						//CALCULATING SUMS

	if(numberone>=40) 		//USE OF MULTIPLE IFs
	if(numbertwo>=40)
	if(numberthree>=40)
	if(sum>=125){
		System.out.println("PASSING");
		return;
	}
	System.out.println("FAILING");

	}
}