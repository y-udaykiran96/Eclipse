package Searching;

public class SearchingTest {

	public static void main(String[] args) {
		String[] data = {"01", "02", "02", "03", "03", "04", "05", "07"};
		
/*		LinearSearch l = new LinearSearch(data);
		System.out.println(l.SearchList("02"));			// Linear Search Algorithm
*/		
		BinarySearch b = new BinarySearch(data);
		System.out.println(b.SearchList("02"));
		
//		System.out.println("01".compareTo("02"));
		
		

	}

}
