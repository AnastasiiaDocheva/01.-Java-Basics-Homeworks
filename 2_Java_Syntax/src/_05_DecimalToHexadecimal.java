import java.util.Scanner;

public class _05_DecimalToHexadecimal {

	/**
	 * Write a program that enters a positive integer number num and converts 
	 * and prints it in hexadecimal form. You may use some built-in method from
	 *  the standard Java libraries
	 */
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String hexnum = Integer.toHexString(num); // converts to hex
		System.out.println(hexnum.toUpperCase()); // prints hex in upper case
	}
}