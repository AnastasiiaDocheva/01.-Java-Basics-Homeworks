import java.util.Scanner;

/* Write a program to count the number of words in given
 * sentence. Use any non-letter character as word separator.*/

public class _05_CountAllWords {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String text = scanner.nextLine();
	String[] words = text.split("([().,!?:;'\"-]|\\s)+");
	System.out.println();
	System.out.println(words.length);
    }

}