
import acm.program.*;

public class AreaCirculo extends ConsoleProgram {
	
	private static final double PI = 3.14;
	
	public void run(){
		println("Calcula a �rea de um c�rculo pelo raio");
		double r = readDouble("Digite o raio do c�rculo:");
		double area = PI * r * r;
		println("A �rea do c�rculo � "+area);
		
	}
}
