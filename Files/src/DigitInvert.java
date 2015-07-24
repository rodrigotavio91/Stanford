/* File: DigitSum.java 
 * ------------------ 
 * This program sums the digits in a positive integer. 
 * The program depends on the fact that the last digit of 
 * a integer n is given by n % 10 and the number consisting 
 * of all but the last digit is given by the expression n / 10.
 */
import acm.program.*;

public class DigitInvert extends ConsoleProgram {
	public void run() { 
		println("This program inverts the digits in an integer."); 
		int n = readInt("Enter a positive integer: "); 
		int dsum = 0; 
		while (n > 0) { 
			dsum *= 10;
			dsum += n % 10; 
			n /= 10; 
		}
		println("The reversed number is " + dsum); 
	}
}