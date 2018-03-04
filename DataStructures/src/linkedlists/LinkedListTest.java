package linkedlists;

public class LinkedListTest {

	public static void main(String[] args) {
//		adding integer into linkedlist
		/*IntLinkedList il = new IntLinkedList();*/		IntDlinkedList il = new IntDlinkedList();
		System.out.println(il.isEmpty());
		il.insertItem(2);
		il.insertItem(5);
		il.insertItem(4);
		il.insertItem(3);
		il.printList();
//		il.DeleteItem(3);
//		il.sortList();
		il.printList();
		
/*//		adding person objects into linkedlist
		PersonLinkedList pl = new PersonLinkedList();
		Person p1 = new Person("uday", 23);
		Person p2 = new Person("kiran", 24);
		Person p3 = new Person("reddy", 25);
		pl.insertItem(p1);
		pl.insertItem(p2);
		pl.insertItem(p3);
		pl.DeleteItem(p2);
		pl.printList();
*/	
/*//		adding objects to linkedlist
		LinkedList l = new LinkedList();
		Person p1 = new Person("uday", 23);
		Person p2 = new Person("kiran", 24);
		Person p3 = new Person("reddy", 25);
		l.insertItem(p1);
		l.insertItem(p2);
		l.insertItem(p3);
		l.DeleteItem(p2);
		l.printList();
*/		
		
	}

}
