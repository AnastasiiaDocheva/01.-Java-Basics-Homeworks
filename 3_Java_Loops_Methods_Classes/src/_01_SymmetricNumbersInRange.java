import java.util.Scanner;

/**
 * Write a program to generate and print all symmetric numbers in given range [start…end].
 * A number is symmetric if its digits are symmetric toward its middle. For example, the numbers
 * 101, 33, 989 and 5 are symmetric, but 102, 34 and 997 are not symmetric.
 */

public class _01_SymmetricNumbersInRange {

	public static boolean checkSymmetricity(int number){
		if (Integer.toString(number).equals(new StringBuilder(Integer.toString(number)).reverse().toString()))
	        return true;    // reverse!!!							//
	    else														//
	        return false;											//
	}																//
																	//
	public static void main(String[] args) {						//  method for checking								//		symmetricity
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);						//
		int start = input.nextInt();								//
		int end = input.nextInt();									//
		for(int number = start ; number<=end ; number++){			//
			if(checkSymmetricity(number)==true){// <================//
				System.out.print(number);
				if(number!=end) System.out.print(" ");
			}
		}
	}
	
}
