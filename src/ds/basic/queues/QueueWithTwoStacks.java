package ds.basic.queues;

import java.util.NoSuchElementException;

public class QueueWithTwoStacks {
	private Stack stack1; // back of queue
	private Stack stack2; // front of queue

	// create an empty queue
	public QueueWithTwoStacks() {
		stack1 = new Stack();
		stack2 = new Stack();
	}

	// move all items from stack1 to stack2
	private void moveStack1ToStack2() {
		while (!stack1.isEmpty())
			stack2.push(stack1.pop());
	}

	// is the queue empty?
	public boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}

	// return the number of items in the queue.
	public int size() {
		return stack1.size() + stack2.size();
	}

	// return the item least recently added to the queue.
	public int peek() {
		if (isEmpty())
			throw new NoSuchElementException("Queue underflow");
		if (stack2.isEmpty())
			moveStack1ToStack2();
		return stack2.peek();
	}

	// add the item to the queue
	public void enqueue(int item) {
		stack1.push(item);
	}

	// remove and return the item on the queue least recently added
	public Object dequeue() {
		if (isEmpty())
			throw new NoSuchElementException("Queue underflow");
		if (stack2.isEmpty())
			moveStack1ToStack2();
		return stack2.pop();
	}

	// a test client
	public static void main(String[] args) {
		QueueWithTwoStacks queueUsingStack = new QueueWithTwoStacks();
		queueUsingStack.enqueue(1);
		queueUsingStack.enqueue(2);
		queueUsingStack.enqueue(3);
		queueUsingStack.enqueue(4);
		queueUsingStack.enqueue(123);

		System.out.println("Input :: ");
//		queueUsingStack.stack.print();

		queueUsingStack.dequeue();
		System.out.println();
		System.out.println("Output :: after 1st deque");
//		queueUsingStack.stack.print();

		queueUsingStack.dequeue();
		System.out.println();
		System.out.println("Output :: after 2nd deque");
//		queueUsingStack.stack.print();

		queueUsingStack.enqueue(999);
		System.out.println();
		System.out.println("Output :: after 999 enque");
//		queueUsingStack.stack.print();
		
		
		
	}
}
