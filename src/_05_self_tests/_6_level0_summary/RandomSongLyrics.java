package _05_self_tests._6_level0_summary;

import java.util.Random;

import javax.swing.JOptionPane;

public class RandomSongLyrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random ran = new Random();
	JOptionPane.showMessageDialog(null, "Hello. Today you will create song lyrics to a chorus. You will choose some words, but the rest will be written for you. Enjoy!");
		int x = ran.nextInt(5);
		
		if (x == 1) {
			String excercise = JOptionPane.showInputDialog("Type in a verb that's a excercise! (Past tense)");
		String descibe = JOptionPane.showInputDialog("Type in an adjective describing the excercise you typed.");
		String floor = JOptionPane.showInputDialog("Type in a word that describes what the floor feels like.");
			JOptionPane.showMessageDialog(null, "Here's the chorus: ");
		}
		else if (x==2) {
			
		}
	else if (x==3) {
			
		}
	else if (x==4) {
	
}
	else if (x==5) {
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
