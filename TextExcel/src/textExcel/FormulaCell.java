//Carolyn Yee
//4/08/2019
//3rd period AP CompSci

package textExcel;

public class FormulaCell extends RealCell{

	private String original;
	String[] formulaPieces;
	Spreadsheet sheet;
	
	//constructor
	public FormulaCell(String text) {
		super(text);
		formulaPieces = text.split(" ");
		
	}
	
	public double getDoubleValue() {
		return Double.parseDouble(original);
	}
}