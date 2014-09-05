import java.util.Scanner;

public class _07_2_CountOfBitsOne {
	
	/**
	 * Write a program to calculate the count of bits 1 in the binary
	 * representation of given integer number n
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int number = input.nextInt();
		int count = 0;

		for (int i = 0; i < 32; i++) {
			int bit = number & 1;
			if (bit == 1) {
				count++;
			}
			number >>= 1; // move 1 charter right until the last bit is 1
		}
		System.out.println(count);
	}
}