package textExcel;

//*******************************************************
// DO NOT MODIFY THIS FILE!!!
//*******************************************************

public interface Cell {
	
	// text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText();
	
	// text for individual cell inspection, not truncated or padded
	public String fullCellText();
}
