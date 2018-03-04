package linkedlists;


public class IntDlinkedList {
	private Node head;
	public IntDlinkedList(){
		head = new Node();
		head.value = 0;
		head.next = null;
		head.prev = null;
	}
	
	class Node {
		private int value;
		@SuppressWarnings("unused")
		private Node prev;
		private Node next;
	}
	
//	check for isEmpty
	public boolean isEmpty(){
		return (head.next == null);
	}
	
//	adding element into linked list
	public boolean insertItem(int item){
		Node n = new Node();
/*//		insert node at start
		n.value = item;
		n.prev = null;
		head.prev = n;
		n.next = head;
		head = n;*/
		Node nn = head;
		while(nn.next != null){
			nn = nn.next;
		}
		n.value = item;
		n.prev = nn;
		n.next = null;
		nn.next = n;
		return true;
		
	}
	
//	displaying the list
	public void printList(){
//		Node t = head.next;
		Node t = head;			// to get starting default element
		while(t!=null){
			System.out.print(t.value+" ");
			t = t.next;
		}
		System.out.println();
	}
	
//	Deletion of node
	public boolean DeleteItem(int item){
		if(head.value == item){
			head = head.next;
			return true;
		} else{
			Node x = head;
			Node y = head.next;
			while(true){
				if(y == null || y.value == item){
					break;
				} else{
					x = y;
					y = y.next;
				}
			}
			if(y!=null){
				x.next = y.next;
				return true;
			} else return false;
		}
	}
	
/*//	sorting elements
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
*/	
	

}
