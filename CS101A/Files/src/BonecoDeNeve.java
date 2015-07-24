import acm.graphics.*;
import acm.program.*;

public class BonecoDeNeve extends GraphicsProgram {
	public void run(){
		add(new GOval(70, 20, 50, 50));
		add(new GOval(82, 32, 8, 8));
		add(new GOval(100, 32, 8, 8));
		add(new GLabel("v"), 93, 49);
		add(new GOval(89, 52, 12, 12));
		add(new GOval(55, 71, 80, 80));
		add(new GRect(90, 83, 10, 10));
		add(new GRect(90, 105, 10, 10));
		add(new GRect(90, 127, 10, 10));
		add(new GOval(40, 151, 110, 110));
		add(new GLabel("Rodrigo Otávio"), 150, 300);
	}
}
