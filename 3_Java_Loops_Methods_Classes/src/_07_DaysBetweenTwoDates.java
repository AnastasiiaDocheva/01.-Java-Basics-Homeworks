import java.util.Scanner;
import org.joda.time.DateTime;
import org.joda.time.Days;
public class _07_DaysBetweenTwoDates {

	public static void main(String[] args) {   //using joda-time-2.3.jar
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String startDate = input.nextLine();
		String endDate = input.nextLine();
		String[] firstDateSplitted = startDate.split("-");
		String[] secondDateSplitted = endDate.split("-");
		DateTime past = new DateTime(Integer.parseInt(firstDateSplitted[2]),
				Integer.parseInt(firstDateSplitted[1]),
				Integer.parseInt(firstDateSplitted[0]), 0,0);
		DateTime today = new DateTime(Integer.parseInt(secondDateSplitted[2]),
				Integer.parseInt(secondDateSplitted[1]),
				Integer.parseInt(secondDateSplitted[0]), 0,0);
		int days = Days.daysBetween(past, today).getDays();
		System.out.println(days);
	}

}