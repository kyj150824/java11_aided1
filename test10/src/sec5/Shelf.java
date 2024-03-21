package sec5;

import java.util.ArrayList;

public class Shelf {
	// ArrayList<String> => "kkt" "park" "kim "lee"
	protected ArrayList<String> shelf;
	public Shelf(){
		shelf = new ArrayList<String>();
		
	}
	public ArrayList<String> getShelf() {
		return shelf;
	}
	public void setShelf(ArrayList<String> shelf) {
		this.shelf = shelf;
	}
	public int getCount() {
		return shelf.size();
	}
}
	
