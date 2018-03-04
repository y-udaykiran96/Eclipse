package queue;

public class Queue {
	private int rear;
	private int front;
	private int total;
	private int size;
	private Object[] que;
	public Queue(){
		rear = 0;
		front = 0;
		total = 0;
		this.size = 5;
		que = new Object[this.size];
	}
	public Queue(int size){
		front = 0;
		rear = 0;
		total = 0;
		this.size = size;
		que = new Object[this.size];
	}
	
//	check for isEmpty
	public boolean isEmpty(){
		return (total == 0);
	}
	
//	check for isFull
	public boolean isFull(){
		return (total == this.size);
	}
	
//	adding into queue
	public boolean enque(Object item){
		if(!isFull()){
			total++;
			que[rear] = item;
			rear = (rear+1)%size;
			return true;
		} else return false;
	}
	
//	popping out from queue
	public Object deque(){
		Object item = que[front];
		total--;
		front = (front+1)%size;
		return item;
	}
	
//	display elements of queue
	public void showAll(){
		int f = front;
		if(total != 0){
			for(int i = 0; i < total ; i++){
				System.out.println(" "+que[f].toString());
				f = (f+1)%size;
			}
		}
	}
	
}
