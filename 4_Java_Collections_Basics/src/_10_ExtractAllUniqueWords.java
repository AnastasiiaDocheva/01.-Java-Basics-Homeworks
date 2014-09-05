import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/* At the first line at the console you are given a
 * piece of text. Extract all words from it and print
 * them in alphabetical order. Consider each non-letter
 * character as word separator. Take the repeating
 * words only once. Ignore the character casing. Print
 * the result words in a single line, separated by spaces. */

public class _10_ExtractAllUniqueWords {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String[] input = scanner.nextLine().toLowerCase()
		.split("([().,!?:;'\"-]|\\s)+");
	Set<String> words = new TreeSet<>();
	for (String string : input) {
	    words.add(string);
	}
	for (String string : words) {
	    System.out.print(string + " ");
	}
    }

}