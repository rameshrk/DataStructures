package ds.basic.queues;

public class QueueUsingStack {

	Stack stack = new Stack();

	public void enque(int data) {
		stack.push(data);
		stack.print();
	}

	public void deque() {
		reverse(stack);
//		stack.print();
	}

	public void reverse(Stack stack) {

		int temp = stack.pop();
		if (stack.isEmpty())
			return;
		reverse(stack);
		stack.push(temp);
		
	}

	public static void main(String[] args) {

		QueueUsingStack queueUsingStack = new QueueUsingStack();
		queueUsingStack.enque(1);
		queueUsingStack.enque(2);
		queueUsingStack.enque(3);
		queueUsingStack.enque(4);
		queueUsingStack.enque(123);

		System.out.println("Input :: ");
		queueUsingStack.stack.print();

		queueUsingStack.deque();
		System.out.println();
		System.out.println("Output :: after 1st deque");
		queueUsingStack.stack.print();

		queueUsingStack.deque();
		System.out.println();
		System.out.println("Output :: after 2nd deque");
		queueUsingStack.stack.print();

		queueUsingStack.enque(999);
		System.out.println();
		System.out.println("Output :: after 999 enque");
		queueUsingStack.stack.print();

	}

}

class Stack {

	private final int SIZE = 5;
	private int[] st;
	private int top;

	public Stack() {
		st = new int[SIZE]; // make array
		top = -1;
	}

	public void push(int j) { // put item on stack
		st[++top] = j;
	}

	public int pop() {// take item off stack
		return st[top--];
	}

	public int peek() {// peek at top of stack
		return st[top];
	}

	public boolean isEmpty() { // true if nothing on stack
		return (top == -1);
	}

	public void print() {
		for (int i = 0; i <= top; i++)
			System.out.print(" :: " + st[i]);
	}

}