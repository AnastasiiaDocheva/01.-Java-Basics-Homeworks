import java.util.Scanner;

public class _03_PointsInsideAFigure {
	
	/**
	 * Write a program to check whether a point is inside or outside of the figure below.
	 * The point is given as a pair of floating-point numbers, separated by a space. 
	 * Your program should print "Inside" or "Outside"
	 */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String point = sc.nextLine();
		String arr[] = point.split(" ");
		double x = Double.parseDouble(arr[0]);
		double y = Double.parseDouble(arr[1]);      // point coordinates
		if(y<6 || y> 13.5) System.out.println("Outside"); // up and bottom sides
		else
		{
			if(x<12.5 || x>22.5) System.out.println("Outside"); // left and right sides
			else
			{
				if(x>17.5&&x<20&&y>8.5) System.out.println("Outside"); // exception
				else System.out.println("Inside");
			}
		}
	}
}