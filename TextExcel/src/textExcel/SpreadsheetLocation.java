//Carolyn Yee
//4/09/2019
//3rd period

package textExcel;

public class SpreadsheetLocation implements Location {
	
	private int row;
	private int column;
	
	//returns row of cell
    public int getRow() {
        return row;
    }
    
    //returns column of cell
    public int getCol() {
        return column;
    }
   
    //creates a cell at a certain location based on string input
    public SpreadsheetLocation(String cellName) {
    	cellName = cellName.toUpperCase();
    	column = cellName.charAt(0)-'A';
    	row = Integer.parseInt(cellName.substring(1))-1;    	
    }
}
