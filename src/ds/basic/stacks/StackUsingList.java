package ds.basic.stacks;

import java.util.ArrayList;

public class StackUsingList<E> extends ArrayList<E> {

	private static final long serialVersionUID = 1L;

	public E pop() {
		E e = get(size() - 1);
		remove(size() - 1);
		return e;
	}

	public void push(E e) {
		add(e);
	}

	public static void main(String[] args) {
		StackUsingList theStack = new StackUsingList();
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		theStack.push(50);
		while (!theStack.isEmpty()) {
			Object value = theStack.pop();
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.println("");
	}
}