import java.util.Scanner;
import java.util.Arrays;
public class _8_SortArrayOfStrings {

	public static void main(String[] args) {
		
		/**
		 * Write a program that enters from the console number n and n strings,
		 * then sorts them alphabetically and prints them. Note: you might need
		 * to learn how to use loops and arrays in Java (search in Internet). 
		 */
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] allWords = new String[n]; // [] sequence [n] - n words in the sequence
		for(int i=0;i<n;i++)
		{
			allWords[i] = sc.next();
		}
		Arrays.sort(allWords); // sort sequence
		for(int i=0;i<n;i++)
		{
			System.out.println(allWords[i]);
		}
	}
}