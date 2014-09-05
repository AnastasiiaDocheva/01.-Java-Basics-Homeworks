import java.util.Scanner;

public class _04_SmallestOfThreeNumbers {
	
	/**
	 * Write a program that finds the smallest of three numbers. 
	 */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double first = Double.parseDouble(sc.next());
		double second = Double.parseDouble(sc.next());
		double third = Double.parseDouble(sc.next());
		double min = Math.min(first, Math.min(second, third)); // minimum
		System.out.println(min);
	}
}