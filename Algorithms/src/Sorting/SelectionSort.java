package Sorting;

public class SelectionSort {
	private String[] list;
	
	public SelectionSort(String[] list) {
		this.list = list;
	}
	
	public void Sort() {
		String tmp,min;
		int k=0;
		for(int i=0; i<list.length-1 ; i++) {
			min = list[i];k=i;
			for(int j=i+1; j<list.length ; j++) {
				if(list[j].compareTo(min) < 0) {
					k = j;
				}
			}
			tmp = list[i];
			list[i] = list[k];
			list[k] = tmp;
		}
		SortingTest.data = list;
	}

	public String[] getList() {
		return list;
	}

}
