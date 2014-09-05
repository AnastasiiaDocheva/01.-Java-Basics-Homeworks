import java.util.Scanner;

public class _08_1_CountOfEquelBitPairs {

	/**
	 * Write a program to count how many sequences of two equal bits ("00" or "11") can be found 
	 * in the binary representation of given integer number n (with overlapping).
	 */
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = scan.nextInt();
		char[] binary = Integer.toBinaryString(num).toCharArray();  // ---> to array
		int count = 0;

		for (int i = 0; i < binary.length-1; i++) {
			if (binary[i]==binary[i+1]) {
				count++;
			}
		}
		System.out.println("Equal bits: ");
		System.out.print(count);
	}

}