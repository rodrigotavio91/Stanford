import acm.program.*;

public final class AverageList extends ConsoleProgram {
	
	private static final int SENTINEL = -1;
	
	public void run(){
		println("This program read a list of scores and shows the average");
		double total = 0;
		int cont = 0;
		while (true) {
			double score = readDouble("Type the score:");
			if (score == SENTINEL) break;
			total += score;
			cont++;
		}
		if (cont > 0) {
			println("The average is "+ total / cont);
		}
	}
}
