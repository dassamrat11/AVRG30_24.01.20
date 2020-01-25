//Write a java program which prints the table of a number upto it's limit. The numbers should be taken from runtime. Output in format: 4 * 1 = 4
public class AssignmentOne_Four{

public static void main(String[] args) {
	int number=Integer.parseInt(args[0]);	//TAKING INPUTS AT RUNTIME
	int limit=Integer.parseInt(args[1]);	// NUMBER AND ITS LIMIT

	for(int i=1;i<=limit;i++){
	System.out.println(+number+" * "+i+" = "+(number*i));	//PRINTING TABLE UPTO LIMIT	
	}

}
}