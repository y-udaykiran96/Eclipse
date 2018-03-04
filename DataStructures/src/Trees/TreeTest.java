package Trees;

public class TreeTest {

	public static void main(String[] args) {
		BST b = new BST();
		b.insert(new Person("uday", 22));
		b.insert(new Person("kiran", 23));
		b.insert(new Person("reddy", 24));
		b.insert(new Person("Y", 25));
		b.showAll(b.findNode("reddy"));
		System.out.println(b.getData(b.findParent("k")));

	}

}
