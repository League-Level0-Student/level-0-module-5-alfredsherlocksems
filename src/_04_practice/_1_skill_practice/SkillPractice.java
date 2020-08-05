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
	if (ran > ran1) {
		JOptionPane.showMessageDialog(null, "The difference between " + ran + " and  " + ran1 + " is " + difference + ".");
	}
	if (ran < ran1) {
		JOptionPane.showMessageDialog(null, "The difference between " + ran1 + " and  " + ran + " is " + difference1 + ".");
	}
	String city = JOptionPane.showInputDialog("What city do  you live in?");
	String san = "San Diego";
	if (city.equals(san)) {
	JOptionPane.showMessageDialog(null, "You live in America's finest city!");
	}
	else {
		JOptionPane.showMessageDialog(null, "If you want move to San Diego!");
	}
	String car = JOptionPane.showInputDialog("How many cars does your family have?");
	int cars = Integer.parseInt(car);
	if (cars == 0) {
		JOptionPane.showMessageDialog(null, "I bet you use public transportation!");
	}
	else if (cars == 1) {
		String cartype = JOptionPane.showInputDialog("What's the model/type?");
		JOptionPane.showMessageDialog(null, "Cool, you have a " + cartype + "!");
	}
	else if (cars > 1){
		int wheels = cars  * 4;
JOptionPane.showMessageDialog(null, "The cars have " + wheels + " wheels in total.");
 	}
	String school = JOptionPane.showInputDialog("What's the name of your school?");
		JOptionPane.showMessageDialog(null, "Your school, " + school + ", is a fantastic school!");	
	}

}







