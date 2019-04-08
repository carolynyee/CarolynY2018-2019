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
	
	public double getDoubleValue() {
		double temp = Double.parseDouble(original);
		return temp;
	}
	

	
}