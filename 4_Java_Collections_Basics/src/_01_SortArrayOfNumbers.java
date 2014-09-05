import java.util.Arrays;
import java.util.Scanner;

/* Write a program to enter a number n and n integer numbers and sort and print them.
 * Keep the numbers in array of integers: int[].
 */

public class _01_SortArrayOfNumbers {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	scanner.nextLine();
	int[] nums = new int[n];
	for (int i = 0; i < nums.length; i++) {
	    nums[i] = scanner.nextInt();
	}
	Arrays.sort(nums);  // sorts integers
	System.out.println();
	for (int i : nums) { // for each
	    System.out.printf("%d ", i);
	}
    }

}