package stacks;

public class IntStack {
	private int top;
	private int size;
	private int[] stack;
	public IntStack(){
		top = -1;
		size = 50;
		stack = new int[50];
	}
	public IntStack(int size){
		top = -1;
		this.size = size;
		stack = new int[this.size];
	}
	
//	check for isEmpty
	public boolean isEmpty(){
		return (top == -1);
	}
	
//	check for isFull
	public boolean isFull(){
		return (top == stack.length-1);
	}
	
//	pushing into stack
	public boolean push(int item){
		if(!isFull()){
			top++;
			stack[top] = item;
			return true;
		} else return false;
	}
	
//	popping out of stack
	public int pop(){
		if(!isEmpty()){
			return stack[top--];
		}
		return 0;
	}
}
