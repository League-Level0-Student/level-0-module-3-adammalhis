//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;



public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot Bob=new Robot();
	
		for (int i=0;i<1000;i++) {

		//3. Ask the user what color they would like the robot to draw
	String Dod=JOptionPane.showInputDialog(null, "What coler do you want?");
		//5. Use an if/else statement to set the pen color that the user requested
	{
	
		if(Dod.equals("red")) {
		Bob.setPenColor(Color.red);
	}
       
	else if(Dod.equals("blue")) {
		Bob.setPenColor(Color.blue);
	}
	else if(Dod.equals("pink")) {
		Bob.setPenColor(Color.pink);
	}
	
	else if(Dod.equals("yellow")) {
		Bob.setPenColor(Color.yellow);
	}
	
	else if(Dod.equals("black")) {
		Bob.setPenColor(Color.BLACK);
		
	}
	else if(Dod.equals("orange")) {
		Bob.setPenColor(Color.orange);
	}
	else if(Dod.equals("green")) {
		Bob.setPenColor(Color.green);
	}
	//6. If the user doesn’t enter anything, choose a random color
	else {
		Bob.setRandomPenColor();
	}
	}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		Bob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		Bob.penDown();
		Bob.setSpeed(50);
		Bob.move(100);
		Bob.turn(90);
		Bob.move(100);
		Bob.turn(90);
		Bob.move(100);
		Bob.turn(90);
		Bob.move(100);
		}
	}
}
