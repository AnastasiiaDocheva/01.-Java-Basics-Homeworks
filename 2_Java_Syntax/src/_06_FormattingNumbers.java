import java.util.Scanner;

public class _06_FormattingNumbers {
	
	/**
	 * Write a program that reads 3 numbers: an integer a (0 ≤ a ≤ 500),
	 * a floating-point b and a floating-point c and prints them in 
	 * 4 virtual columns on the console. Each column should have a width of 10 characters.
	 * The number a should be printed in hexadecimal, left aligned;
	 * then the number a should be printed in binary form, padded with zeroes,
	 * then the number b should be printed with 2 digits after the decimal point, right aligned;
	 * the number c should be printed with 3 digits after the decimal point, left aligned
	 */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		String aHexString = Integer.toHexString(a).toUpperCase();
		String aBinary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
		                             //%10s - 10 characters binary
		if (c%1 == 0) { //if int
			System.out.printf("|%-10s|%s|%10.2f|%-10.0f|",aHexString,aBinary,b,c);
		}else {
			System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",aHexString,aBinary,b,c);
		}
	
	}
}