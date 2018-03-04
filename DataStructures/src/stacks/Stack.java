package stacks;

public class Stack {
	private int top;
	private int size;
	private Object[] stack;
	public Stack(){
		top = -1;
		size = 50;
		stack = new Object[50];
	}
	public Stack(int size){
		top = -1;
		this.size = size;
		stack = new Object[this.size];
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
	public boolean push(Object item){
		if(!isFull()){
			top++;
			stack[top] = item;
			return true;
		} else return false;
	}
	
//	popping out of stack
	public Object pop(){
		if(!isEmpty()){
			return stack[top--];
		}
		return null;
	}
	
}
