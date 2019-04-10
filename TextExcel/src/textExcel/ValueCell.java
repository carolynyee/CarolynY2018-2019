//Carolyn Yee
//4/08/2019
//3rd period AP CompSci

package textExcel;

public class ValueCell extends RealCell{
	
	private String original;
	
	//constructor
	public ValueCell(String text) {
		super(text);
		original = text;
	}
	
	//returns the original string as a double
	public double getDoubleValue() {
		return Double.parseDouble(original);
	}
	
}