package Trees;

public class BST {		// Binary Search Tree
	private Node root;
	public BST(){
		
	}
	public class Node{
		private Node left;		// left child
		private Person data;	// parent
		private Node right;		// right child
		
	}
	
	public Person getData(Node n){
		return n.data;
	}
	
	public boolean insert(Person item){
		Node n = new Node();
		n.data = item;
		n.left = null;
		n.right = null;
		if(root == null){
			root = n;
			return true;
		}
		Node p = root;
		Node c = root;
		while(c != null){
			p = c;
			if(item.getName().compareTo(c.data.getName()) < 0){
				c = c.left;
			} else{
				c = c.right;
			}
		}
		if(item.getName().compareTo(p.data.getName()) < 0){
			p.left = n;
		} else{
			p.right = n;
		}
		
		return true;
	}
	
	public void showAll(Node n){
		Node p = n;
		if(p != null){
			System.out.println(" "+p.data);
			showAll(p.left);
			showAll(p.right);
		}
	}
	
	
	
	public Node findNode(String key){
		Node c = root;
		while(c != null) {
			if(key.compareTo(c.data.getName()) == 0) {
				break;
			} if(key.compareTo(c.data.getName()) < 0) {
				c = c.left;
			} else {
				c = c.right;
			}
		}
		return c;
	}
	
	public Node findParent(String key) {
		Node p = root;
		Node c = root;
		do {
			if(key.compareTo(c.data.getName()) == 0) {
				break;
			}
			p = c;
			if(key.compareTo(c.data.getName()) < 0) {
				c = c.left;
			} else {
				c = c.right;
			}
		} while(c != null);
//		System.out.println(">>"+p.data);
		if(c != null) {
			return p;
		} else{
			return null;
		}
	}
	

}
