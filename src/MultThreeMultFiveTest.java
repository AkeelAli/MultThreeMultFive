/*
 * @author Akeel Ali
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MultThreeMultFiveTest {

	@Test
	public void testTranslateNumberMultThree() {
		/* Test all possible multiples of 3 between 1 and 100 */
		for (int i = 3; i <= 100; i += 3) {
			if (i % 5 != 0) // eliminate multiples of 3 AND 5
				assertEquals("Multiples of 3 must print MultThree", "MultThree", MultThreeMultFive.translateNumber(i));
		}
	}
	
	@Test
	public void testTranslateNumberMultFive() {
		/* Test all possible multiples of 5 between 1 and 100 */
		for (int i = 5; i <= 100; i += 5) {
			if (i % 3 != 0) // eliminate multiples of 3 AND 5
				assertEquals("Multiples of 5 must print MultFive", "MultFive", MultThreeMultFive.translateNumber(i));
		}
	}
	
	@Test
	public void testTranslateNumberMultThreeMultFive() {
		/* Test all possible multiples of 3 and 5 between 1 and 100 */
		for (int i = 5; i <= 100; i += 5) {
			if (i % 3 == 0) // only include multiples of 3 and 5
				assertEquals("Multiples of 3 and 5 must print MultThreeMultFive", "MultThreeMultFive", MultThreeMultFive.translateNumber(i));
		}
		
	}
	
	@Test
	public void testTranslateNumberNonMult() {
		/* Test all possible non-multiples of 3 or 5 between 1 and 100 */
		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0 && i % 5 != 0)
			assertEquals("Number that aren't multiples of 3 or 5 must return their String representations", String.valueOf(i), MultThreeMultFive.translateNumber(i));
		}
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testTranslateNumberZero() {
		MultThreeMultFive.translateNumber(0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testTranslateNumberNegative() {
		MultThreeMultFive.translateNumber(-1);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testTranslateNumberLarge() {
		MultThreeMultFive.translateNumber(101);
	}
	
}
