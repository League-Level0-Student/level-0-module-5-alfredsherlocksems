package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
int dimes1 = Integer.parseInt(dimes);
	int cents = dimes1 * 10;
	JOptionPane.showMessageDialog(null, "You have " + cents + " cents");
	String inches = JOptionPane.showInputDialog("How tall are you in inches?");
	int inches1 = Integer.parseInt(inches);
	if (inches1 < 32) {
		JOptionPane.showMessageDialog(null, "Remember to eat your Wheaties!");
	}
	for (int i = 1; i < 33; i++) {
		if (i % 3 == 0) {
		System.out.println(i);	
		}
	} 
int ran = new Random().nextInt(20);
			System.out.println(ran);
			int ran1 = new Random().nextInt(10);
	System.out.println(ran1);
	int difference = ran - ran1;
	int difference1 = ran1 - ran;
	
	
	
	}

}
