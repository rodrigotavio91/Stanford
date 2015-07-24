import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	public void run() {
		int p1 = 0;
		int p2 = 1;
		println(p1);
		println(p2);
		for (int i = 0; i < 15; i++) {
			int sum = p1 + p2;
			println(sum);
			p1 = p2;
			p2 = sum;
		}
	}
}
