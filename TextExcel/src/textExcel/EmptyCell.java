//Carolyn Yee
//3/04/2019
//version 1

package textExcel;

public class EmptyCell implements Cell {

	//needs a constructor, but actually doesn't do anything
	public EmptyCell() {
	}
	
	// text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() {
		//needs to return 10 characters, will need to add or subtract spaces
		//too many --> substring
		//always add 10, then use substring to just take the first 10
		return "          ";
	}
	
	// text for individual cell inspection, not truncated or padded
	public String fullCellText() {
		return "";
	}
}

