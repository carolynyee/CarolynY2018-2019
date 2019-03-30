package textExcel;

public class RealCell implements Cell{
	private String valueText;
	//private double value
	
	//constructor
	public RealCell(String text) {
		valueText = text;
	}
	//text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() {
		String tempText = getDoubleValue() + "         ";
		return tempText.substring(0,10);
	}
	
	//text for individual cell inspection, not truncated or padded
	public String fullCellText() {
		return valueText;
	}
	
	//converts the calculated value of the cell as a double
	//acts as a getter for the double field "value"
	public double getDoubleValue() {
		return Double.parseDouble(valueText);
	}
	
	//getter for the string field/version of the value
	public String getValueText() {
		return valueText;
	}
	
}



