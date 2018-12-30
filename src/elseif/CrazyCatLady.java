//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String answer=JOptionPane.showInputDialog(null, "How many cats do you have?");
		// 2. Convert their answer into an int
int cats = Integer.parseInt (answer);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
	if (cats>2) {
		JOptionPane.showMessageDialog(null, "You are a crazy cat lady");
	}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
	else if (cats<3&&cats>0) {
playVideo("https://www.youtube.com/watch?v=dGFSjKuJfrI");
	
	}
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
	else {
		playVideo("https://www.youtube.com/watch?v=oj_yLBltPE8");
		
	}
	
	}
	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

