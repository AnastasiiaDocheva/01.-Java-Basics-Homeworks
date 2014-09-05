import java.util.ArrayList;
import java.util.Scanner;
 
/* Write a program that reads two lists of letters l1 and 
 * l2 and combines them: appends all letters c from l2 to 
 * the end of l1, but only when c does not appear in l1. 
 * Print the obtained combined list. All lists are given 
 * as sequence of letters separated by a single space, each 
 * at a separate line. Use ArrayList<Character> of chars 
 * to keep the input and output lists. */
 
public class _09_2_CombineListsOfLetters {
 
        public static void main(String[] args) {
               
                ArrayList<Character> list1 = readListChar();
                ArrayList<Character> list2 = readListChar();
               
                list2.removeAll(list1);
               
                list1.addAll(list2);
               
                for (Character character : list1) {
                        System.out.print(character + " ");
                }
        }
 
 
        public static ArrayList<Character> readListChar() {
               
                Scanner input = new Scanner(System.in);
 
                String[] chars = input.nextLine().split(" ");
 
                ArrayList<Character> list = new ArrayList<>();
               
                for (String ch : chars) {
                        list.add(ch.charAt(0));
                }
 
                return list;
        }
}