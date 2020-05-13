package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class algorithms_prime_or_not_work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String num = JOptionPane.showInputDialog("Please type a number.");
	int num1 = Integer.parseInt(num);
boolean isPrime = true;
	for (int i = 2; i < num1; i++) {
if (num1 % i == 0) {	
isPrime = false;
break;
}
}
if (isPrime) {	
	JOptionPane.showMessageDialog(null, "It's prime!");
}
else {
	JOptionPane.showMessageDialog(null, "It's composite!");
}
	
	
	
	}

}
