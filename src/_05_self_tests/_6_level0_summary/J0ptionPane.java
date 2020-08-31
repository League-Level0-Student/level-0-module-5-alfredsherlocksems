package _05_self_tests._6_level0_summary;

import javax.swing.JOptionPane;

public class J0ptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	JOptionPane.showMessageDialog(null, "Awesome!");
	String q = JOptionPane.showInputDialog("If you would like, type in a number and find out what the answer would be when you times it by 2.3!");
	Double q1 = Double.parseDouble(q);
	double q2 = q1 * 2.3;
	JOptionPane.showMessageDialog(null,q + " multiplied by 2.3 = " + q2 + "!");
	
	
	
	
	
	
	
	
	
	
	
	}

}
