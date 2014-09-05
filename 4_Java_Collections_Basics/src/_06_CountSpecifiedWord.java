import java.util.Scanner;

/* Write a program to find how many times a word
 * appears in given text. The text is given at the
 * first input line. The target word is given at
 * the second input line. The output is an integer
 * number. Please ignore the character casing. Consider
 * that any non-letter character is a word separator. */

public class _06_CountSpecifiedWord {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String text = scanner.nextLine();
	String word = scanner.next();
	String[] words = text.split("([().,!?:;'\"-]|\\s)+");
	int count = 0;
	for (String currentWord : words) {
	    if (currentWord.equalsIgnoreCase(word)) {
		count++;
	    }
	}
	System.out.println(count);
    }

}