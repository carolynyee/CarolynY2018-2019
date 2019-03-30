//Carolyn Yee
//AP CompSci 3rd period
//Version 1
//3/29/2019

package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel {
	
	public static void main(String[] args) {
	    // Add your command loop here
		Scanner userinput = new Scanner(System.in);
		System.out.print("Please input a command: ");
		String input = userinput.nextLine();
		Spreadsheet spst = new Spreadsheet();
	

		while(!input.equals("quit")) {
	
	
			System.out.println(spst.processCommand(input));
			
			System.out.print("Please input a command: ");
			
			input = userinput.nextLine();
		}

	}

}
