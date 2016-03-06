package state;

import java.util.HashMap;

public class ApplicationState {
	
	private HashMap<Integer, String> results;
	private int page;
	
	public ApplicationState() {
		this.page = 1;
		this.results = new HashMap<>();
	}
	
	public HashMap<Integer, String> getResults() {
		return results;
	}
	public void setResults(HashMap<Integer, String> results) {
		this.results = results;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
}
