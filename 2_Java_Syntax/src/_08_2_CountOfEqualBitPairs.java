import java.math.BigInteger;
import java.util.Scanner;

public class _08_2_CountOfEqualBitPairs {
	
	/**
	 * Write a program to count how many sequences of two equal bits ("00" or "11") can be found 
	 * in the binary representation of given integer number n (with overlapping).
	 */
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scaner = new Scanner(System.in);
		BigInteger n = scaner.nextBigInteger();
		int counter = 0;
		
		for (int i = 0; i < n.bitLength(); i++) {
			if(n.testBit(i)==n.testBit(i+1))
			{
				counter++;
			}
		}
		System.out.println(counter);
	}
}