import java.util.Scanner;

/* Write a program to find how many times given 
 * string appears in given text as substring. The 
 * text is given at the first input line. The search 
 * string is given at the second input line. The 
 * output is an integer number. Please ignore the 
 * character casing. */

public class _07_CountSubstringOccurences {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String text = scanner.nextLine().toLowerCase();
	String subString = scanner.next().toLowerCase();
	int count = count(text, subString);
	System.out.println(count);
    }

    public static int count(final String string, final String substring) {
	int count = 0;
	int idx = 0;

	while ((idx = string.indexOf(substring, idx)) != -1) {
	    idx++;
	    count++;
	}

	return count;
    }

}