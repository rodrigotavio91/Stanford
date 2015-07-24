import acm.program.*;
import acm.graphics.*;

public class Calendar extends GraphicsProgram {
	
	/* The number of days in the month */ 
	private static final int DAYS_IN_MONTH = 31;
	/* The day of the week on which the month starts */
	/* (Sunday = 0, Monday = 1, Tuesday = 2, and so on) */
	private static final int DAY_MONTH_STARTS = 5;
	/* The width in pixels of a day on the calendar */ 
	private static final int DAY_WIDTH = 40;
	/* The height in pixels of a day on the calendar */
	private static final int DAY_HEIGHT = 30;
	
	public void run(){
		int columns = (DAYS_IN_MONTH + DAY_MONTH_STARTS - 1) / 7;
		int day = 1;
		int half = DAY_WIDTH / 2;
		for (int i = 0; i <= columns; i++) {
			for (int n = 0; n < 7; n++) {
				int x = n * DAY_WIDTH;
				int y = i * DAY_HEIGHT;
				add(new GRect(x, y, DAY_WIDTH, DAY_HEIGHT));
				if ((i > 0 || n >= DAY_MONTH_STARTS) && day <= DAYS_IN_MONTH) {				
					add(new GLabel(String.valueOf(day)), x + half, y + half);					
					day++;
				}				
			}
		}
	}
}
