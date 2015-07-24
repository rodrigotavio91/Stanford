import acm.program.*;

public class Balance extends ConsoleProgram {
	
	public void run(){
		println("Interest calculation program");
		double balance = readDouble("Enter starting balance:");
		double interestRate = readDouble("Enter annual interest rate:");
		interestRate /= 100;
		balance += balance * interestRate;
		println("Balance after one year:"+balance);
		balance += balance * interestRate;
		println("Balance after two year:"+balance);
	}
}
