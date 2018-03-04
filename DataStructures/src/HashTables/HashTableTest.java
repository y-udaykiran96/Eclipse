package HashTables;

import SampleData.Student;

public class HashTableTest {

	public static void main(String[] args) {
		HashTable h = new HashTable();
		
		Student s1 = new Student("uday", "11", 3.5);
		Student s2 = new Student("kiran", "10", 3.5);
		Student s3 = new Student("reddy", "12", 3.3);
		
		int s1key = h.toHashCode(s1.getRoll_no());
		int s2key = h.toHashCode(s2.getRoll_no());
		int s3key = h.toHashCode(s3.getRoll_no());
		
		h.insert(s1key, s1);
		h.insert(s2key, s2);
		h.insert(s3key, s3);
		
//		h.deleteStd(s2.getRoll_no());
		
//		h.showData();
		
//		Student s = h.fetchStdInfo(s2.getRoll_no());
//		System.out.println(s);
		
		System.out.println("s1:"+s1key+"\ts2:"+s2key+"\ts3:"+s3key);

	}

}
