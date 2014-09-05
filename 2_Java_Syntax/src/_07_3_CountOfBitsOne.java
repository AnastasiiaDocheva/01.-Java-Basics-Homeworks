import java.util.Scanner;

public class _07_3_CountOfBitsOne {

	/**
	 * Write a program to calculate the count of bits 1 in the binary
	 * representation of given integer number n
	 */
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char[] aToBin = String.format("%10s", Integer.toBinaryString(a)).toCharArray();
		int count = 0;
		for (int i = 0; i < aToBin.length; i++) {
			if (aToBin[i] == '1') count++;
		}
		System.out.println(count);
	}

}