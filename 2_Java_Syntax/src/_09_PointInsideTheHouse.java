import java.util.Scanner;

/**
Write a program to check whether a point is inside or outside the house below.
 The point is given as a pair of floating-point numbers, separated by a space. 
 Your program should print "Inside" or "Outside".
 */

public class _09_PointInsideTheHouse {
	
	private static Scanner in;
	//(aX*(bY-cY) + bX*(cY-aY) + cX*(aY-bY))/2 - triangle area
	
	public static void main(String[] arg) {
		in = new Scanner(System.in);
		double x = in.nextDouble();        // P coordinates
		double y = in.nextDouble();
		// finding triangle area;
		double ax = 17.5;
		double ay = 3.5;
		double bx = 12.5;
		double by = 8.5;
		double cx = 22.5;
		double cy = 8.5;       // Math.abs - modulus (absolute value)
		double area = Math.abs(ax*(by-cy) + bx*(cy-ay) + cx*(ay-by))/2;
		// finding three new triangle areas
		double areaABP = Math.abs(ax*(by-y) + bx*(y-ay) + x*(ay-by))/2;
		double areaACP = Math.abs(ax*(cy-y) + cx*(y-ay) + x*(ay-cy))/2;
		double areaBPC = Math.abs(bx*(y-cy) + x*(cy-by) + cx*(by-y))/2;
		if ((x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5)
                ||(x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5)
                ||(x == 17.5 && y >=3.5 && y <=8.5)){
					
					System.out.println("Inside");

				} 
		else if (area == areaABP+ areaACP+areaBPC) {
			System.out.println("Inside");
		}

		else {
	System.out.println("Outside");
		}
		
	in.close();

	}	
}