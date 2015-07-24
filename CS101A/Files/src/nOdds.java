
import acm.program.*;

public class nOdds extends ConsoleProgram {
	public void run(){
		int n = readInt("Digite a quantidade de números ímpares: ");
		int i = 1;
		int cont = 0;
		int total = 0;
		while (cont < n) {
			if (!(i % 2 == 0)) {
				total += i;
				cont++;
			}
			i++;
		}
		println("O total é "+ total);
	}
}
