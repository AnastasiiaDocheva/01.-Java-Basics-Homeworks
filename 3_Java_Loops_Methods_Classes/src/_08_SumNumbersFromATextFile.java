/**
 * Write a program to read a text file "Input.txt" holding a sequence of integer numbers,
 * each at a separate line. Print the sum of the numbers at the console. Ensure you close
 * correctly the file in case of exception or in case of normal execution. In case of exception
 * (e.g. the file is missing), print "Error" as a result. 
 */

import java.io.BufferedReader;
import java.io.FileReader;

public class _08_SumNumbersFromATextFile {

	public static void main(String[] args) {
		BufferedReader reader;
		int sum = 0;
		try {															 //
			reader = new BufferedReader(new FileReader("src/08. Input.txt"));//
			String line = null;											 //
			while ((line = reader.readLine()) != null) {				 //
			   int number = Integer.parseInt(line);						 // right way to
			   sum+=number;												 // close 
			}															 //
			System.out.println(sum);									 //
		} 																 //
		catch (Exception e) {											 //
			System.out.println("Error");								 //
		}																 //
	}
}