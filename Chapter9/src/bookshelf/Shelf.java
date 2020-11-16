package bookshelf;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getSelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
