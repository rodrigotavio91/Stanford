
import acm.program.*;

public class Bottles extends ConsoleProgram {

	public void run(){
		int bottles = 99;
		while (bottles > 95){
			println(bottles + " bottles of beer on the wall");
			println(bottles + " bottles of beer");
			println("You take one down, pass it around");
			bottles -= 1;
			println(bottles + " bottles of beer on the wall");
		}
	}
}
