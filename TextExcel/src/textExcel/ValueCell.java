package textExcel;

public class ValueCell extends RealCell{
	private String original;
	
	//constructor
	public ValueCell(String text) {
		super(text);
	}
	
	public double getDoubleValue() {
		
		if (original.contains(".")) {
			String[] noDecimal = original.split(".", 3);
			double whole = Double.parseDouble(noDecimal[0]);
			double decimal = Double.parseDouble(noDecimal[2]);
			return (whole + decimal);
		} else {
			return Double.parseDouble(original);
		}
	}

	
}