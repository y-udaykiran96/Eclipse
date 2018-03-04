package stacks;

public class PersonStack {
	private int top;
	private int size;
	private Person[] stack;
	public PersonStack(){
		top = -1;
		size = 50;
		stack = new Person[50];
	}
	public PersonStack(int size){
		top = -1;
		this.size = size;
		stack = new Person[this.size];
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
	public boolean push(Person item){
		if(!isFull()){
			top++;
			stack[top] = item;
			return true;
		} else return false;
	}
	
//	popping out of stack
	public Person pop(){
		if(!isEmpty()){
			return stack[top--];
		}
		return null;
	}
}
