import java.util.ArrayList;

public class Spreadsheet {
	private ArrayList<Cell> cells = new ArrayList<Cell>();
	
	
	public String get(String cell) {
		for(Cell c: cells) {
			if(cell.equals(c.getId()))
				return c.getValue();
		}
		return null;
	}
	
	public void set(String cell, String value) {
		cells.add(new Cell(cell, value));
	}
	
	public String evaluate(String cell) {
		String value = get(cell);
		char c = value.charAt(0);
		
		if(Character.isDigit(c) || c =='-')
			for(char ch: value.toCharArray()){
				if(!Character.isDigit(ch))
					return "#Error";
				else
					return value;
			}
		return null;
	}
	
}
