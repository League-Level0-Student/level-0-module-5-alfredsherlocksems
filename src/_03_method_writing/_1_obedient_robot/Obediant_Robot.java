package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

class Obediant_Robot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String q1 = JOptionPane.showInputDialog("What shape would you like to be drawn? A square, circle, or a triangle?");
	String q2 = JOptionPane.showInputDialog("What color would you like? (Red, Blue, or Green.)");
	if (q1 == "square") {
		
	}
	}
static void drawSquare() {
	Robot rob = new Robot();
	rob.penDown();
			rob.setSpeed(20);
			for (int i = 0; i < 4; i++) {
		rob.move(300);
		rob.turn(90);
			}	
}
static void drawTriangle() {
	Robot bob = new Robot();
	bob.penDown();
			bob.setSpeed(20);

bob.turn(45);
	bob.move(300);
bob.turn(90);
    bob.move(300);
bob.turn(135);
	bob.move(400);
}
static void drawCircle() {
	Robot Dave = new Robot();
	Dave.penDown();
			Dave.setSpeed(100);
for (int i = 0; i < 360; i++) {
	Dave.move(2);
	Dave.turn(1);	
}
}
}


