
import acm.program.*;

public class AreaCirculo extends ConsoleProgram {
	
	private static final double PI = 3.14;
	
	public void run(){
		println("Calcula a área de um círculo pelo raio");
		double r = readDouble("Digite o raio do círculo:");
		double area = PI * r * r;
		println("A área do círculo é "+area);
		
	}
}
