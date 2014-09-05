import java.util.Scanner;

public class _01_RectangleArea {
	
	 /**
	 * Write a program that enters the sides of a rectangle (two integers a and b) 
	 * and calculates and prints the rectangle's area
	 */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String sides = sc.nextLine();
		String arr[] = sides.split(" ");    //split sequence separated by space ---> array
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		System.out.println(a*b);
	}
}