//Carolyn Yee
//4/08/2019
//3rd period AP CompSci

package textExcel;

public class TextCell implements Cell{
	String original;
	
	public TextCell(String text) {
		original = text.substring(1, text.length()-1);
	}

	@Override
	public String abbreviatedCellText() {
	//needs to return 10 characters, will need to add or subtract spaces
	//too many --> substring
	//always add 10, then use substring to just take the first 10
		String temp = original + "          ";
		return temp.substring(0, 10);
	}

	@Override
	public String fullCellText() {
		return ( "\"" + original + "\"");
	}
}
