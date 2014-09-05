import java.util.ArrayList;
import java.util.Scanner;

/* Write a program that reads two lists of letters l1 and 
 * l2 and combines them: appends all letters c from l2 to 
 * the end of l1, but only when c does not appear in l1. 
 * Print the obtained combined list. All lists are given 
 * as sequence of letters separated by a single space, each 
 * at a separate line. Use ArrayList<Character> of chars 
 * to keep the input and output lists. */

public class _09_1_CombineListsOfLetters {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Character> firstList = new ArrayList<>();
	ArrayList<Character> secondList = new ArrayList<>();
	for (char character : scanner.nextLine().toCharArray()) {
	    firstList.add(character);
	}
	for (char character : scanner.nextLine().toCharArray()) {
	    secondList.add(character);
	}
	ArrayList<Character> output = new ArrayList<>();
	output.addAll(firstList);
	for (int i = 0; i < secondList.size(); i++) {
	    if (!firstList.contains(secondList.get(i))) {
		output.add(' ');
		output.add(secondList.get(i));
	    }
	}
	for (char character : output) {
	    System.out.print(character);
	}
    }

}