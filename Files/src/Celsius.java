
import acm.program.*;

public class Celsius extends ConsoleProgram {
	
	public void run(){
		println("This program converts Fahrenheit to Celsius.");
		double fah = readDouble("Enter Fahrenheit temperature: ");
		double celsius = (5.0 / 9.0) * (fah - 32);
		println("Celsius equivalent: " + celsius);
	}
}
