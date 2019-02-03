package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
String AreYouHappy=JOptionPane.showInputDialog(null, "Are You Happy?");

if (AreYouHappy.equals("yes")) {
	JOptionPane.showMessageDialog(null, "Then Keep doing whatever your doing.");
}





else if (AreYouHappy.equals("no")) {
	String DoYouWantToBeHappy=JOptionPane.showInputDialog("Do you want to be happy?");

 if (DoYouWantToBeHappy.equals("yes")) {
	JOptionPane.showMessageDialog(null, "Then change something");
}
 else if (DoYouWantToBeHappy.equals("no")) {
	 JOptionPane.showMessageDialog(null, "Keep Doing Whatever your doing.");
	 
 }
}	
	
	
	
	
	
	
	

}
}