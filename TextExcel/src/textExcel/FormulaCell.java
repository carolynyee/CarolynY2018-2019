//Carolyn Yee
//4/08/2019
//3rd period AP CompSci

package textExcel;

public class FormulaCell extends RealCell{

	private String original;
	private String[] formulaPieces;
	
	//constructor
	public FormulaCell(String text) {
		super(text);
		original = text;
	}
	
	//text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() {
		String answer = getDoubleValue() + "          ";
		return answer.substring(0,10);
	}
	
	//converts formula into answer	
	//takes the string, cuts off parentheses, splits on spaces
	//parses the leftover numbers into the answer depending on what operation it finds
	public double getDoubleValue() {
		
		String noParentheses = "";
		noParentheses = original.substring(2, original.length() - 2);
		formulaPieces = noParentheses.split(" ");
		
		double answer = Double.parseDouble(formulaPieces[0]);
		
		for (int i = 0; i < formulaPieces.length; i ++) {
			if (formulaPieces[i].contains("+")) {
				answer = answer + Double.parseDouble(formulaPieces[i + 1]);
			} else if (formulaPieces[i].contains("-")) {
				if (formulaPieces[i].length() < 2) {
				answer = answer - Double.parseDouble(formulaPieces[i + 1]);
				}
			} else if (formulaPieces[i].contains("/")) {
				answer = answer / Double.parseDouble(formulaPieces[i + 1]);
			} else if (formulaPieces[i].contains("*")){
				answer = answer * Double.parseDouble(formulaPieces[i + 1]);
			}
		}
		return answer;
	}
}
