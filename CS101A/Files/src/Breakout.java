/*
 * File: Breakout.java
 * -------------------
 * This file will eventually implement the game of Breakout.
 */
import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Breakout extends GraphicsProgram {
	
	/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;
	
	/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;
	
	/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;
	
	/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;
	
	/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;
	
	/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;
	
	/** Separation between bricks */
	private static final int BRICK_SEP = 4;
	
	/** Width of a brick */
	private static final int BRICK_WIDTH =
	 (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;
	
	/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;
	
	/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;
	
	/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;
	
	/** Number of turns */
	private static final int NTURNS = 3;
	
	private RandomGenerator rgen = RandomGenerator.getInstance(); 
	
	private double vx, vy; 
	
	private GOval ball;
	
	private GRect paddle;
	
	private GRect brick;
	
	public void run() {
		setup();
		waitForClick();
		moveBall();
	}
	
	private void setup(){
		setSize(WIDTH + BRICK_SEP, HEIGHT);
		generateBricks();
		createPaddle();
		createBall();
	}
	
	private void generateBricks(){
		for (int n = 0; n < NBRICK_ROWS; n++) {
			for (int i = 0; i < NBRICKS_PER_ROW; i++) {
				brick = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
				brick.setFilled(true);
				brick.setColor(getColor(n));
				int width = i * BRICK_WIDTH + ((i + 1) * BRICK_SEP);
				int height = BRICK_Y_OFFSET + n * (BRICK_SEP + BRICK_HEIGHT);
				add(brick, width, height);
			}
		}
	}
	
	private void createPaddle() {
		paddle = new GRect(0, HEIGHT - PADDLE_Y_OFFSET, PADDLE_WIDTH, PADDLE_HEIGHT);
		paddle.setFilled(true);
		add(paddle);
	}
	
	private void createBall() {
		ball = new GOval(WIDTH / 2, HEIGHT / 2, BALL_RADIUS, BALL_RADIUS);
		ball.setFilled(true);
		add(ball);
	}
	
	private void moveBall(){
		while (ball.getHeight() < getHeight()) {
			vy += 3.0;
			vx = rgen.nextDouble(1.0, 3.0); 
			if (rgen.nextBoolean(0.5)) vx = -vx;
			ball.move(vx, vy);
			checkForCollision();
			pause(50);
		}
	}
	
	private Color getColor(int id){
		switch (id) {
			case 0: case 1:
				return Color.RED;
			case 2: case 3:
				return Color.ORANGE;
			case 4: case 5:
				return Color.YELLOW;
			case 6: case 7:
				return Color.GREEN;
			case 8: case 9:
				return Color.CYAN;
			default:
				return Color.BLACK;
		}
	}
	
	private void checkForCollision(){
		if (ball.getY() > getHeight() - 2 * BALL_RADIUS) {
			vy = -vx * 0.9;
			double diff = ball.getY() - (getHeight() - 2 * BALL_RADIUS);
			ball.move(0, -2 * diff);
		}
	}
}