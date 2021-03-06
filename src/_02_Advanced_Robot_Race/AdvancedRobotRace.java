package _02_Advanced_Robot_Race;
import java.lang.reflect.Array;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.


		//1. make a main method
		public static void main(String[] args) {
			
			//2. create an array of 5 robots.
			Robot[] a = new Robot[5];
			//3. use a for loop to initialize the robots.
			for(int i = 0; i<a.length; i++) {
				a[i] = new Robot();
				a[i].setX(800-i*125);
				a[i].setY(400);
			}
				//4. make each robot start at the bottom of the screen, side by side, facing up
		
			//5. use another for loop to iterate through the array and make each robot move 
		    //   a random amount less than 50.
	   
			//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	  Boolean top = false;
	    	while(top == false) {
	    		
	    		for(int x = 0; x<a.length; x++) {
	    			if(a[x].getY() <= 0) {
	    				top = true;
	    				int robotNum = 5-x;
	    				JOptionPane.showMessageDialog(null, "robot #" + robotNum + " is the winner");
	    			}
	    		} 
	    		
	    		int r = new Random().nextInt(50);
	    		int r1 = new Random().nextInt(50);
	    		int r2 = new Random().nextInt(50);
	    		int r3 = new Random().nextInt(50);
	    		int r4 = new Random().nextInt(50);
	    		
	    		Thread t = new Thread(()->a[0].move(r));
	    		Thread t1 = new Thread(()->a[1].move(r1));
	    		Thread t2 = new Thread(()->a[2].move(r2));
	    		Thread t3 = new Thread(()->a[3].move(r3));
	    		Thread t4 = new Thread(()->a[4].move(r4));
	    		
	    		t.start();
	    		t1.start();
	    		t2.start();
	    		t3.start();
	    		t4.start();
	    	
	    	
	    	}
			//7. declare that robot the winner and throw it a party!
	    	
			//8. try different races with different amounts of robots.
	    	
		    //9. make the robots race around a circular track.
		}
		
	}


