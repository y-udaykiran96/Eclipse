package linkedlists;


public class PersonLinkedList {
	private Node head;
	public PersonLinkedList(){
		head = new Node();
		head.data = null;
		head.link = null;
	}
	
	class Node {
		private Person data;
		private Node link;
	}
	
//	check for isEmpty
	public boolean isEmpty(){
		return (head.link == null);
	}
	
//	adding element into linked list
	public boolean insertItem(Person item){
/*//		insert at start
		Node n = new Node();
		n.data = item;
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
		n.data = item;
		n.link = null;
		nn.link = n;
		return true;
		
	}
	
//	displaying the list
	public void printList(){
		Node t = head.link;
//		Node t = head;			// to get starting default element
		while(t!=null){
			System.out.println(t.data.toString()+" ");
			t = t.link;
		}
//		System.out.println();
	}
	
//	Deletion of node
	public boolean DeleteItem(Person item){
		if(head.data == item){
			head = head.link;
			return true;
		} else{
			Node x = head;
			Node y = head.link;
			while(true){
				if(y == null || y.data == item){
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
	
/*//	sorting elements
	public void sortList(){							// Bubble sorting
		int c = 0;
		for(Node a = head.link; a.link!=null; a=a.link){
			for(Node b = head.link; b.link!=null; b=b.link){
//				if(b.data < b.link.data){			// for Decending order
				if(b.data > b.link.data){			// for Ascending order
					c = b.data;
					b.data = b.link.data;
					b.link.data = c;
				}
			}
		}
	}*/
}
