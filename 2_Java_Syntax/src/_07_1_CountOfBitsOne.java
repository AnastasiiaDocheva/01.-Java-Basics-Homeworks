import java.util.Scanner;

/**
 * Write a program to calculate the count of bits 1 in the binary
 * representation of given integer number n
 */

public class _07_1_CountOfBitsOne {

    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int count = Integer.bitCount(n);    // counts bit 1 in the binary representation
        
        System.out.println(count);
    }
}