//Write a java program that calculates factorial of a number entered at runtime

public class AssignmentOne_One{

public static void main(String[] args) {
	int number=Integer.parseInt(args[0]);		//taking input at runtime

	long factorial=1;
	while(number!=1){
		factorial=factorial*number;
		number--;
	}		
	System.out.println(+factorial);

}
}