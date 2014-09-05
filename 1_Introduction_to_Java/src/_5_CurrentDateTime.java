import java.time.LocalDate;
import java.time.LocalDateTime;

public class _5_CurrentDateTime {
	public static void main(String[] args) {
		
		/**
		 * Create a simple Java program CurrentDateTime.java to print
		 * the current date and time.
		 */
		
		//Locale.setDefault(Locale.ROOT);
		//Locale.setDefault(new Locale("BG", "BG"));
		//Locale.setDefault(Locale.US);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		System.out.printf(
				  "Today is %1$td.%1$tm.%1$tY\n", LocalDate.now());
	}
}