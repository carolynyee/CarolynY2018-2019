//Carolyn Yee
//4/08/2019
//3rd period AP CompSci

package textExcel;

public class PercentCell extends RealCell{
	
	private String original;
	
	//constructor
	public PercentCell(String text) {
		super(text);
		original = text;

	}
	
	//returns the percent as a decimal
	public double getDoubleValue() {
		String temp = original.substring(0, original.length());
		double newNum = Double.parseDouble(temp);
		return newNum * 0.01;
	}
	
	//text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() {
		if(original.contains(".")) {
			String temp = original;
			temp = original.substring(0, original.indexOf("."));
			temp = temp + "%" + "          ";
			return temp.substring(0,10);	
		} else {
			String tempText = original + "         ";
			return tempText.substring(0,10);
		}
	}
	
	//returns the "double" but made into string form
	public String fullCellText() {
		String temp = original.substring(0, original.length() - 1);
		double newNum = Double.parseDouble(temp);
		newNum = newNum * 0.01;
		return "" + newNum;
	}
	
}
