
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot Bob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		Bob.setX(150);
		Bob.setY(600);
		// 2. Make the robot draw a star shape. Hint: 144.
		
		Bob.setSpeed(100000000);
		for (int i=0; i<100; i++) {
		
		for (int N=0; N<5; N++) {
		Bob.penDown();
		Bob.move(30);	
		Bob.turn(144);
		}
		Bob.penUp();
		Bob.move(30);
	
		
						
				
	}	


		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walkOfFame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
