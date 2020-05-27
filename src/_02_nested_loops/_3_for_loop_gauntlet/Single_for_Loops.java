package _02_nested_loops._3_for_loop_gauntlet;

public class Single_for_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

for (int i = 0; i < 101; i++) {
	System.out.println(i);
}
for (int i = 101; i > -1; i--) {
	System.out.println(i);
}		
	for (int i = 1; i < 101; i++) {
		if (i % 2 == 0) {
		System.out.println(i);
	}
	}
	for (int i = 0; i < 100; i++) {
		if (i % 2 == 1) {
			System.out.println(i);
		}
	}
	for (int i = 1; i < 501; i++) {
		if (i % 2 == 0) {
			System.out.println(i + " is even");
	}
		else {
				System.out.println(i + " is odd");
		}
	}
	for (int i = 0; i < 778; i++) {
		if (i % 7 == 0) {
			System.out.println(i);
		}
	}
 int num = -1;
 for (int i = 2008; i < 2021; i++) {
		num++;
	 System.out.println("In " + i + " is was " + num + " years old.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
