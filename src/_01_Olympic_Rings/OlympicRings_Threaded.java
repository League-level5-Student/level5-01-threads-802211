package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot one = new Robot(200, 200);
		Robot two = new Robot(300, 400);
		Robot three = new Robot(400, 200);
		Robot four = new Robot(500, 400);
		Robot five = new Robot(600, 200);

		one.setSpeed(10);
		two.setSpeed(10);
		three.setSpeed(10);
		four.setSpeed(10);
		five.setSpeed(10);

		one.penDown();
		two.penDown();
		three.penDown();
		four.penDown();
		five.penDown();

		one.setPenColor(Color.blue);
		two.setPenColor(Color.yellow);
		three.setPenColor(Color.black);
		four.setPenColor(Color.GREEN);
		five.setPenColor(Color.RED);

		one.setPenWidth(25);
		two.setPenWidth(25);
		three.setPenWidth(25);
		four.setPenWidth(25);
		five.setPenWidth(25);

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 90; i++) {
				one.turn(4);
				one.move(10);
			}
		});
		t1.start();

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 90; i++) {
				two.turn(4);
				two.move(10);
			}
		});
		t2.start();

		Thread t3 = new Thread(() -> {
			for (int i = 0; i < 90; i++) {
				three.turn(4);
				three.move(10);
			}
		});
		t3.start();

		Thread t4 = new Thread(() -> {
			for (int i = 0; i < 90; i++) {
				four.turn(4);
				four.move(10);
			}
		});
		t4.start();

		Thread t5 = new Thread(() -> {
			for (int i = 0; i < 90; i++) {
				five.turn(4);
				five.move(10);
			}
		});
		t5.start();
}}

