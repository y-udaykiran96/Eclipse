package queue;

public class PersonQ {
	private int rear;
	private int front;
	private int total;
	private int size;
	private Person[] que;
	public PersonQ(){
		rear = 0;
		front = 0;
		total = 0;
		this.size = 5;
		que = new Person[this.size];
	}
	public PersonQ(int size){
		front = 0;
		rear = 0;
		total = 0;
		this.size = size;
		que = new Person[this.size];
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
	public boolean enque(Person item){
		if(!isFull()){
			total++;
			que[rear] = item;
			rear = (rear+1)%size;
			return true;
		} else return false;
	}
	
//	popping out from queue
	public Person deque(){
		Person item = que[front];
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
