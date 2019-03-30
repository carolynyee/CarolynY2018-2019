package textExcel;

//Carolyn Yee, 3/4/2019, version1
public class EmptyCell implements Cell {

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

