package Sorting;

public class BubbleSort {
	private String[] list;
	
	public BubbleSort(String[] list) {
		this.list = list;
	}
	
	
	public void Sort() {
		String tmp;
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<list.length-1; j++) {
				if(list[j].compareTo(list[j+1]) > 0) {
					tmp = list[j];
					list[j] = list[j+1];
					list[j+1] = tmp;
				}
			}
		}
//		SortingTest.data = list;
	}


	public String[] getList() {
		return list;
	}

}
