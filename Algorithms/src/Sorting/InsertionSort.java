package Sorting;

public class InsertionSort {
private String[] list;
	
	public InsertionSort(String[] list) {
		this.list = list;
	}
	
	public void Sort() {
		int i=0,j=0;
		for(i=0; i<list.length; i++) {
			String tmp = list[i];
			for(j=i; j>0 && (list[j-1].compareTo(tmp)>0); j--) {
				list[j] = list[j-1];
			}
			list[j] = tmp;
		}
		
		
//		SortingTest.data = list;
	}

	public String[] getList() {
		return list;
	}

}
