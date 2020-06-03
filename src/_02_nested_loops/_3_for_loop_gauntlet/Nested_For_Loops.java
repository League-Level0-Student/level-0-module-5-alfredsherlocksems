package _02_nested_loops._3_for_loop_gauntlet;

public class Nested_For_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for (int i = 1; i < 3; i++) {
for (int j = 0; j < 3; j++) {
	System.out.println(i + " " + j);
}				
	}
	int a = 1;
	for (int i = 1; i < 4; i++) {
		for (int j = 1; j < 4; j++) {	
			System.out.print(a);	
		a++;
		}
		System.out.println();	
	}
	int b = 1;
	for (int i = 0; i < 10; i++) {
	for (int j = 0; j < 10; j++) {
		System.out.print(b + "/t");
		b++;
		}	
	System.out.println();	
	}	
	for (int i = 1; i < 7; i++) {
		for (int j = 0; j < i; j++) {
			System.out.print("*");
		}
		System.out.println();	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	}

}
