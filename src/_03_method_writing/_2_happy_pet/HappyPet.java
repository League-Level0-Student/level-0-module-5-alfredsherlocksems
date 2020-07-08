package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What kind of animal would you like?");
String name = JOptionPane.showInputDialog("What's your pet's name?");	

// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you like to do to make your pet happy?!", "Making your Pet Happy", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Play with your pet", "Clean up your pet's poo", "Go outside and explore with your pet" }, null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
     static void Response1a(String pet, String name) {
	JOptionPane.showMessageDialog(null, "Your " + pet + ", " + name + ", is happy and energized. Their happiness level has increased.");
happinessLevel +=1;
     }
     static void Response1b(String pet, String name) {
    	 JOptionPane.showMessageDialog(null, "Your " + pet + ", " + name + ", is frustrated. You put barely any effort to play with them. Their happiness level has decreased.");	
     happinessLevel -=3;
     }
     static void Response1c(String pet, String name) {
    	 JOptionPane.showMessageDialog(null, "Your " + pet + ", " + name + ", really enjoyed playing with you, and was grateful that you played with them for a long time.Their happiness level has increased.");
	happinessLevel +=2;
     }
     static void Response2a(String pet, String name) {
    	 JOptionPane.showMessageDialog(null, "Your " + pet + ", " + name + ", is happy that all their poo is all cleaned up and that it doesn't smell as bad. Their happiness level has increased.");
happinessLevel +=3;
     } 
     static void Response2b(String pet, String name) {
    	 JOptionPane.showMessageDialog(null, "Your " + pet + ", " + name + ", doesn't like that you didn't clean the poo very well and that there is some left. Their happiness level has decreased.");
happinessLevel --;
  }
     static void Response2c(String pet, String name) {
    	 JOptionPane.showMessageDialog(null, "Your " + pet + ", " + name + ", isn't happy that it took you 3 days to clean their poo. Their happiness level has decreased.");
	happinessLevel -=2;
}
  static void Response3a(String pet, String name) {
	  JOptionPane.showMessageDialog(null, "Your " + pet + ", " + name + ", is very happy because you found a really nice clearing where you and them had a splendid time!!! Their happiness level has increased.");
happinessLevel +=4;
} 
static void Response3b(String pet, String name) {
	JOptionPane.showMessageDialog(null, "Your " + pet + ", " + name + ", is upset because you instantly managed to hurt yourself and had a scratch on your foot so you went back home with them. They also didn't like seeing you upset about getting the scratch. Their happiness level has decreased.");
happinessLevel -=3;
} 
static void Response3c(String pet, String name) {
	JOptionPane.showMessageDialog(null, "Your " + pet + ", " + name + ", enjoyed themselves but you explored for a short amount of time. Their happiness level is the same.");

}




}
     
     
     
     