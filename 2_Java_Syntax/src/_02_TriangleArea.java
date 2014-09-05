import java.util.Scanner;

public class _02_TriangleArea {

	/**
	 * Write a program that enters 3 points in the plane (as integer x and y coordinates),
	 *  calculates and prints the area of the triangle composed by these 3 points.
	 *  Round the result to a whole number. In case the three points do not form a triangle, 
	 *  print "0" as result.
	 */
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String pointA = sc.nextLine();
		String ArrA[] = pointA.split(" ");         // array 1st point coordinates
		int ax = Integer.parseInt(ArrA[0]);
		int ay = Integer.parseInt(ArrA[1]);
		String pointB = sc.nextLine();
		String ArrB[] = pointB.split(" ");         // array 2st point coordinates
		int bx = Integer.parseInt(ArrB[0]);
		int by = Integer.parseInt(ArrB[1]);
		String pointC = sc.nextLine();
		String ArrC[] = pointC.split(" ");         // array 3st point coordinates
		int cx = Integer.parseInt(ArrC[0]);
		int cy = Integer.parseInt(ArrC[1]);
		//double area = Math.abs((ax*(by-cy) + bx*(cy-ay) + cx*(ay-by))/2);
		double area = (double)((ax*(by-cy) + bx*(cy-ay) + cx*(ay-by))/2);  // triangle area formula
		if(area>=0) System.out.println(area);
		else System.out.println(area*-1);          // when area is negative
	}

}