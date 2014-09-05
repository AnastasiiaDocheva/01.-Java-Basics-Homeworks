/**
 * Write a method to convert from degrees to radians. Write a method to convert from radians
 * to degrees. You are given a number n and n queries for conversion. Each conversion query
 * will consist of a number + space + measure. Measures are "deg" and "rad". Convert all radians
 * to degrees and all degrees to radians. Print the results as n lines, each holding a number + 
 * space + measure. Format all numbers with 6 digit after the decimal point.
 */

import java.util.Scanner;

public class _05_AngleUnitConverter {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int convertionsCount = Integer.parseInt(input.nextLine());
		String[] commands = new String[convertionsCount*2];
		int lastCommandIndex = 0;
		for(int i = 0 ; i < convertionsCount ; i++){
			   String line = input.nextLine();
			   String[] lineAsArray = line.split(" ");
			   String inputValue = lineAsArray[0];  // represents as array of strings
			   commands[lastCommandIndex] = inputValue;
		       String typeOfConvertion = lineAsArray[1];
		       char[] typeOfConvertionCharArray = typeOfConvertion.toCharArray();
			   if(typeOfConvertionCharArray[0]=='r') commands[lastCommandIndex + 1] = "r";
			   else commands[lastCommandIndex+1] = "d";
			   lastCommandIndex += 2;
			}
		lastCommandIndex = 0;
		for(int i = 0 ;i<convertionsCount; i++){
			 if(commands[lastCommandIndex+1]=="r") {
				 System.out.format("%.6f deg", (Math.toDegrees(Double.parseDouble(commands[lastCommandIndex]))));
				 System.out.println();
				 }
			 else {
				   System.out.format("%.6f rad",Math.toRadians(Double.parseDouble(commands[lastCommandIndex])));
				   System.out.println();
			   }
			 lastCommandIndex +=2;
			 }
		}
		}