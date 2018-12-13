package practiceScribbles;
import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String userInput = "";
		userInput = scan.nextLine();
//		System.out.println(userInput);
		
		//throw into method and return correct modifications
		String answer = reverseName(userInput);
		System.out.println(answer);
	}
	
	static String reverseName(String userInput) {
		
		
		String[] answer = userInput.split(" ");
		
		String output = "";
		
		for(int i = answer.length; i > 0; i--) {
			output += answer[i - 1] + " ";
		}
		
		return output;
	}
}
