package textExcel;

public class FormulaCell extends RealCell{

	private String original;
	
	//constructor
	public FormulaCell(String text) {
		super(text);
	}
	
	public double getDoubleValue() {
		return Double.parseDouble(original);
	}
}