package textExcel;

import java.util.Spliterator;
import java.util.*;

// Update this file with your own code.

public class Spreadsheet implements Grid {
	private Cell[][] sheet;
	private int columns;
	private int rows;
	
	//needs constructor
		public Spreadsheet() {
			//initialize to a 20 =20 1iist;a
			columns = 12;
			rows = 20;
			sheet = new Cell[rows][columns];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
				sheet[i][j] = new EmptyCell();
				}
			}
			
		}

	@Override
	public String processCommand(String command) {
		String[] splitCommand = command.split(" ", 3);
		
		if (command.length() < 5) {
			SpreadsheetLocation loc = new SpreadsheetLocation(command);
			return getCell(loc).fullCellText();
			//do cell inspection
		} else if (splitCommand.length == 1 ) {
			//would execute clear 
				clear();
		} else if (splitCommand.length == 3) { 
			
			SpreadsheetLocation loc = new SpreadsheetLocation(splitCommand[0]);
			String stringValue = splitCommand[2];

			if (splitCommand[2].contains("\"")){ //string value
				sheet[loc.getRow()][loc.getCol()] = new TextCell(stringValue);

			} else if (splitCommand[2].contains("(")) { //formula cell
				sheet[loc.getRow()][loc.getCol()] = new FormulaCell(stringValue);

			}else if (splitCommand[2].contains("%")) { //percent cell
				sheet[loc.getRow()][loc.getCol()] = new PercentCell(stringValue);
			}else { //value cell
				sheet[loc.getRow()][loc.getCol()] = new ValueCell(stringValue);
			}
		} else { 
			//clear at specific location
			SpreadsheetLocation loc = new SpreadsheetLocation(splitCommand[1]);
			sheet[loc.getRow()][loc.getCol()] = new EmptyCell();
		}
		return getGridText();
	}
	
	public void clear() {
		getGridText();
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sheet[i][j]= new EmptyCell();
			}
		}
	}

	@Override
	public int getRows() {
		return rows;
	}

	@Override
	public int getCols()
	{
		return columns;
	}

	@Override
	public Cell getCell(Location loc) {
		int row = loc.getRow();
		int col = loc.getCol();

		return sheet[row][col];
	}
	 public Cell getCell(int row, int column) {
	    	return sheet[row][column];
	    }
	    
	@Override
	public String getGridText() {
		String spacesAndBar = "   |";
		for (char letter = 'A'; letter <= 'L'; letter++) {
			spacesAndBar += letter + "         |";
		}
		spacesAndBar += "\n";
		for (int row = 1; row <= rows ; row++) {
			if (row < 10) {
				spacesAndBar += row + "  |";
			} else {
				spacesAndBar += row + " |";
			}
			for (int col = 0; col < columns; col++) {
				spacesAndBar += getCell(row - 1, col).abbreviatedCellText();
				spacesAndBar += "|";
			}
			spacesAndBar += "\n";	
		}
		
		return spacesAndBar;
	}

}
