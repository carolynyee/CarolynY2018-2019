package textExcel;

public class PercentCell extends RealCell{
	
	private String original;
	
	//constructor
	public PercentCell(String text) {
		super(text);		
	}
	
	
	public double getDoubleValue() {
		String temp = original.substring(0, original.length());
		double newNum = Double.parseDouble(temp);
		return newNum * 0.01;
	}
	
}
