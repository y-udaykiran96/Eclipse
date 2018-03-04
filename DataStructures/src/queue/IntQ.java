package queue;

public class IntQ {
	private int rear;
	private int front;
	private int total;
	private int size;
	private int[] que;
	public IntQ(){
		rear = 0;
		front = 0;
		total = 0;
		this.size = 5;
		que = new int[this.size];
	}
	public IntQ(int size){
		front = 0;
		rear = 0;
		total = 0;
		this.size = size;
		que = new int[this.size];
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
	public boolean enque(int item){
		if(!isFull()){
			total++;
			que[rear] = item;
			rear = (rear+1)%size;
			return true;
		} else return false;
	}
	
//	popping out from queue
	public int deque(){
		int item = que[front];
		total--;
		front = (front+1)%size;
		return item;
	}
	
//	display elements of queue
	public void showAll(){
		int f = front;
		if(total != 0){
			for(int i = 0; i < total ; i++){
				System.out.println(" "+que[f]);
				f = (f+1)%size;
			}
		}
	}
	
}
