import acm.program.ConsoleProgram;

public class Fibonacci10000 extends ConsoleProgram {
	public void run() {
		int p1 = 0;
		int p2 = 1;
		println(p1);
		println(p2);
		while (true) {
			int sum = p1 + p2;
			if (sum >= 10000) break;
			println(sum);
			p1 = p2;
			p2 = sum;
		}
	}
}
