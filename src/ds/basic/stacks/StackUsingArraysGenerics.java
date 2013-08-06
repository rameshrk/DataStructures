package ds.basic.stacks;

import java.util.Arrays;

public class StackUsingArraysGenerics<E> {
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private Object elements[];

	public StackUsingArraysGenerics() {
		elements = new Object[DEFAULT_CAPACITY];
	}

	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public void push(E e) {
		if (size == elements.length) {
			ensureCapacity();
		}
		elements[size++] = e;
	}

	@SuppressWarnings("unchecked")
	public E pop() {
		E e = (E) elements[--size];
		elements[size] = null;
		return e;
	}

	private void ensureCapacity() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}
	
	
	public static void main(String[] args) {
		StackUsingArraysGenerics theStack = new StackUsingArraysGenerics();
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