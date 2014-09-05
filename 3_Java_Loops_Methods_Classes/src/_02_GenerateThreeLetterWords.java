/**
 * Write a program to generate and print all 3-letter words consisting of given set of characters.
 * For example if we have the characters 'a' and 'b', all possible words will be "aaa", "aab",
 * "aba", "abb", "baa", "bab", "bba" and "bbb". The input characters are given as string at 
 * the first line of the input. Input characters are unique (there are no repeating characters).
 */

import java.util.Scanner;

public class _02_GenerateThreeLetterWords {

	
	static void generate(StringBuilder sb, int n, String characters) {
		char[] alphabet = characters.toCharArray();
        if (n == sb.length()) {
            System.out.println(sb.toString());
            return;
        }
        for (char letter : alphabet) { // for each
            sb.setCharAt(n, letter); // sets the character at the specified index to ch
            generate(sb, n + 1, characters);
        }
    }
	
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	    String characters = input.next();
	    StringBuilder sb = new StringBuilder(); // mutable sequence of characters
        sb.setLength(3);
        generate(sb, 0, characters);
        }
	}