package ds.basic.queues;

import java.util.*;

class ListNode {
	public Object element;
	public ListNode next;

	// constructors
	public ListNode(Object Elem) {
		element = Elem;
	}

	public ListNode(ListNode n, Object Ele) {
		element = Ele;
		next = n;
	}

};

public class QueueUsingLinkedList<E> {
	public ListNode front;
	public ListNode back;

	/*
	 * public LLQueue() { front=back=null; }
	 */
	// Test if the queue is logically empty, return true if empty else false
	public boolean isEmpty() {

		return front == null;
	}

	// Insert a new item in to queue;
	public void enqueue(Object x) {
		ListNode n = new ListNode(x);
		if (isEmpty())
			back = front = n;
		else
			back = back.next = n;
		System.out.println("Inserting " + x);

	}

	// Retun and remove the lest recently inserted item from the queue

	public Object dequeue() throws Exception {
		if (isEmpty())
			throw new Exception("Queue is empty");
		Object val = front.element;
		front = front.next;
		System.out.println("Removing " + val);

		return val;
	}

	// get the least recently inserted element from the queue;

	public Object getFront() throws Exception {
		if (isEmpty())
			throw new Exception("Queue is empty");
		else

			return front.element;
	}

	// Make queue empty

	public void makeEmpty() {
		back = front = null;
	}

	// display all the itmes in the queue
	public void display() {
		if (!isEmpty()) {

			ListNode current = front;
			while (current != null) {
				System.out.println(current.element);
				current = current.next;
			}
		}
		System.out.println("\nQueue is empty\n");
	}

	public static void main(String[] args) throws Exception {
		QueueUsingLinkedList tnq = new QueueUsingLinkedList();
		tnq.enqueue(1);
		tnq.enqueue(2);
		tnq.enqueue(3);
		tnq.enqueue(4);

		if (!tnq.isEmpty())
			tnq.dequeue();
		if (!tnq.isEmpty())
			tnq.dequeue();
		if (!tnq.isEmpty())
			tnq.dequeue();
		if (!tnq.isEmpty())
			tnq.dequeue();
		else
			System.out.println("Queue is empty, cannot remove element");
	}

}
