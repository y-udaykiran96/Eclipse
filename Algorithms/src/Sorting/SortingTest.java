package Sorting;

public class SortingTest {

	public static String[] data = {"07", "05", "02", "03", "04", "03", "02", "01"};
	public static void main(String[] args) {
		
		/*BubbleSort b = new BubbleSort(data);
		b.Sort();
		for(String s: b.getList()){
			System.out.print(s+" ");
		}*/
		
		SelectionSort ss = new SelectionSort(data);
		ss.Sort();
		for(String s: ss.getList()){
			System.out.print(s+" ");
		}

	}

}
