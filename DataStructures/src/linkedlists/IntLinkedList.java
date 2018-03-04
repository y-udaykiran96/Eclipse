package linkedlists;


public class IntLinkedList {
	private Node head;
	public IntLinkedList(){
		head = new Node();
		head.value = 0;
		head.link = null;
	}
	
	class Node {
		private int value;
		private Node link;
	}
	
//	check for isEmpty
	public boolean isEmpty(){
		return (head.link == null);
	}
	
//	adding element into linked list
	public boolean insertItem(int item){
/*//		insert at start
		Node n = new Node();
		n.value = item;
		n.link = head;
		head = n;
		return true;
*/	
//		insert at the end
		Node n = new Node();
		Node nn = head;
		while(nn.link != null){
			nn = nn.link;
		}
		n.value = item;
		n.link = null;
		nn.link = n;
		return true;
		
	}
	
//	displaying the list
	public void printList(){
		Node t = head.link;
//		Node t = head;			// to get starting default element
		while(t!=null){
			System.out.print(t.value+" ");
			t = t.link;
		}
		System.out.println();
	}
	
//	Deletion of node
	public boolean DeleteItem(int item){
		if(head.value == item){
			head = head.link;
			return true;
		} else{
			Node x = head;
			Node y = head.link;
			while(true){
				if(y == null || y.value == item){
					break;
				} else{
					x = y;
					y = y.link;
				}
			}
			if(y!=null){
				x.link = y.link;
				return true;
			} else return false;
		}
	}
	
//	sorting elements
	public void sortList(){							// Bubble sorting
		int c = 0;
		for(Node a = head.link; a.link!=null; a=a.link){
			for(Node b = head.link; b.link!=null; b=b.link){
//				if(b.value < b.link.value){			// for Decending order
				if(b.value > b.link.value){			// for Ascending order
					c = b.value;
					b.value = b.link.value;
					b.link.value = c;
				}
			}
		}
	}
}
