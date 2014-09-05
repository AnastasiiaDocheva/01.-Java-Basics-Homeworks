import java.util.Scanner;

public class _6_SumTwoNumbers {
	public static void main(String[] args) {
		
		/**
		 * Write a program SumTwoNumbers.java that enters two integers from the console,
		 * calculates and prints their sum. Search in Internet to learn how to read 
		 * numbers from the console. 
		 */
		
		@SuppressWarnings("resource")
		Scanner number = new Scanner(System.in);
		// Scanner - read from the console
		int a = number.nextInt();
		// nextInt - scans the next token of the input as an int
		int b = number.nextInt();
		System.out.println(a+b);
	}
}