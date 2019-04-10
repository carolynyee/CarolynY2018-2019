//Carolyn Yee
//4/08/2019
//3rd period AP CompSci

package textExcel;

public class TextCell implements Cell{
	
	String original;
	
	// method to remove the parentheses from the original text
	public TextCell(String text) {
		original = text.substring(1, text.length() - 1);
	}
	
	//method to return the orignal text but will only be 10 characters long
	public String abbreviatedCellText() {
	//needs to return 10 characters, will need to add or subtract spaces
	//too many --> substring
	//always add 10, then use substring to just take the first 10
		String temp = original + "          ";
		return temp.substring(0, 10);
	}

	// method to return the original text but with quotes
	public String fullCellText() {
		return ( "\"" + original + "\"");
	}
	
}
