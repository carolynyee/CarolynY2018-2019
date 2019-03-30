package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location {
	private int row;
	private int column;
	
    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getCol() {
        return column;
    }
   
    public SpreadsheetLocation(String cellName) {
    	
    	cellName = cellName.toUpperCase();
    	column = cellName.charAt(0)-'A';
    	row = Integer.parseInt(cellName.substring(1))-1;  
    //	System.out.println("row: "+row);
    	//System.out.println("col: " + column);
    	
    }

	

}
