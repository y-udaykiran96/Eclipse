package SampleData;
import linkedlists.StdList;

public class StudentTest {

	public static void main(String[] args) {
//		test of linked list
		StdList s = new StdList();
		Student s1 = new Student("uday", "11", 3.5);
		Student s2 = new Student("kiran", "10", 3.5);
		Student s3 = new Student("reddy", "12", 3.3);
		
		s.insertStd(s1);
		s.insertStd(s2);
		s.insertStd(s3);
		
		s.deleteStudent("10");
		
		s.showAll();
//		System.out.println(s.haveRollno("01"));

	}

}
