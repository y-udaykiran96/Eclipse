package Searching;

public class BinarySearch {
	private String[] list;
	public String location = "";
	public int occurs;
	public BinarySearch(String[] list) {
		this.list = list;
	}
	
	public String SearchList(String s) {
//		Sorting should be done before searching
		int low = 0;
		int high = list.length - 1;
		int left=0,right=0;
		int key = 0;
		while(low <= high){
			key = (low+high)/2;
			if(s.compareTo(list[key]) < 0) {
				high = key-1;
			} else if(s.compareTo(list[key]) > 0) {
				low = key+1;
			} else break;
		}
		for(int i=key-1;i>=low;i--) {
			if(s.equals(list[i])) {
				location += Integer.toString(i+1)+", ";
				left+=1;
			} else break;
		}
		location += Integer.toString(key+1)+", ";
		for(int i=key+1;i<=high;i++) {
			if(s.equals(list[i])) {
				location += Integer.toString(i+1)+", ";
				right+=1;
			} else break;
		}
		occurs = left+right+1;
		return ("location:"+location+"\noccurences:"+occurs);
	}

}
