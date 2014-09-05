import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Write a program to extract all email addresses from given 
 * text. The text comes at the first input line. Print the emails 
 * in the output, each at a separate line. Emails are considered 
 * to be in format <user>@<host>. */

public class _08_ExtractEmails {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String text = scanner.nextLine();
	Pattern emailPattern = Pattern.compile("[\\w-+]+(?:\\.[\\w-+]+)*@(?:[\\w-]+\\.)+[a-zA-Z]{2,7}");
	Matcher matcher = emailPattern.matcher(text);
	while (matcher.find()) {
	    System.out.println(matcher.group());
	}
    }

}