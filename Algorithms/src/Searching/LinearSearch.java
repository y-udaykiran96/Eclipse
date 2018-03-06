package Searching;

public class LinearSearch {
	private String[] list;
	public String location = "";
	public int occurs;
	public LinearSearch(String[] list) {
		this.list = list;
	}
	
	public String SearchList(String s) {
		boolean contains = false;
		for(int i=0;i<list.length;i++) {
			if(s.equals(list[i])) {
				contains = true;
				location = location + Integer.toString(i+1)+", ";
				occurs += 1;
			}
		}
		if(contains) return ("location:"+location+"\noccurences:"+occurs);
		else return ("Invalid item");
	}
	
	
	

}
