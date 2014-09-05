public class _07_4_CountOfBitsOne {
	
	/**
	 * Write a program to calculate the count of bits 1 in the binary
	 * representation of given integer number n
	 */
	
	//A method for counting the 1 bits in a binary representation of an integer number
	public static void bitCounter(int num){
		String binaryNumber = Integer.toBinaryString(num);
		int counter = 0;
		for (int i = 0; i < binaryNumber.length(); i++) {
			if (binaryNumber.charAt(i) =='1') {
				counter ++;
			}
		}
		System.out.println(counter);
	}
}