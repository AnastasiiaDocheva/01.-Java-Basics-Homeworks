import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/* Write a program that enters an array of strings and finds in it the largest sequence of 
 * equal elements. If several sequences have the same longest length, print the leftmost of them.
 * The input strings are given as a single line, separated by a space.
 */

public class _03_LargestSequenceOfEqualStrings {

    public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	String line = scanner.nextLine();
	String[] tokens = line.split(" ");
	Map<String, Integer> counters = new TreeMap<String, Integer>(); // map = key and value of element
	for (String string : tokens) {
	    Integer count = counters.get(string); // returns key?
	    if (count == null) {
		count = 0;
	    }
	    counters.put(string, count + 1); // Associates the specified value with the specified key in this map (optional operation).
	}
	Map.Entry<String, Integer> maxEntry = null;//Returns a Set view of the mappings contained in this map
	for (Map.Entry<String, Integer> entry : counters.entrySet()) {
	    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) { //max
		maxEntry = entry;
	    }
	}
	for (int i = 0; i < maxEntry.getValue(); i++) {
	    System.out.print(maxEntry.getKey() + " ");
	}
    }

}