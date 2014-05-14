/*
 * @author Akeel Ali
 */
public class MultThreeMultFive {
	
	public final static String MULT_THREE = "MultThree";
	public final static String MULT_FIVE = "MultFive";
	public final static String MULT_THREE_MULT_FIVE = "MultThreeMultFive";

	/**
	 * Translates a given number to its string representation.
	 * If the number is a multiple of 3, return {@link MultThreeMultFive#MULT_THREE}
	 * If the number is a multiple of 5, return {@link MultThreeMultFive#MULT_FIVE}
	 * If the number is a multiple of 3 and 5, return {@link MultThreeMultFive#MULT_THREE_MULT_FIVE}
	 * Otherwise, return the string representation of the number
	 * 
	 * @param i	the integer number (Must be between 1 and 100)
	 * @return	the string representation of the given integer according to the rules above
	 */
	public static String translateNumber(int i) {
		String str = "";
		
		if (i < 1 || i > 100) {
			throw new IllegalArgumentException("Number must be between 1 and 100");
		}
		
		if (i % 3 == 0) {
			str += MULT_THREE;
		}
		
		if (i % 5 == 0) {
			str += MULT_FIVE;
		}
		
		if (str.equals("")) {
			str += i;
		}
		
		return str;
	}
	
	/**
	 * Prints the numbers from 1 to 100.
	 * For multiples of 3, it prints the string "MultThree" instead of the number and for multiples of 5, it prints the string "MultFive". 
	 * For numbers which are multiples of both 3 and 5, it prints "MultThreeMultFive".
	 */
	public static void printTranslatedNumbers() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(translateNumber(i));
		}
	}
	
	public static void main(String args[]) {
		printTranslatedNumbers();
	}
}
