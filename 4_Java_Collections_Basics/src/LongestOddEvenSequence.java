import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.text.Format;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
import java.lang.Object;


public class LongestOddEvenSequence {

	public static void main(String[] args) {
		int g = 0;
		int c = 0;
		String s = "stacks";
		String b = "beers";
		String beer;
		Scanner input = new Scanner(System.in);
		
		do {
			beer = input.nextLine();
			if (beer.toLowerCase().contains(s.toLowerCase())) {
				int f = Integer.parseInt(beer.replaceAll("[\\D]", ""));
				c += f;
			}
			else if (beer.toLowerCase().contains(b.toLowerCase())) {
				int i = Integer.parseInt(beer.replaceAll("[\\D]", ""));
				g += i;
			}
			
		} while (!beer.toLowerCase().equals("end"));
		int o = (g/20);
		int p = (g%20);
		int y = c+o;
		System.out.println(y + " stacks + " + p + " beers");
	}
}
