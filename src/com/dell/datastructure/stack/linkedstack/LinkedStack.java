package com.dell.datastructure.stack.linkedstack;

import java.util.LinkedList;

public class LinkedStack {

	private LinkedList<Employee> stack;

	// create a stack
	public LinkedStack() {
		stack = new LinkedList<Employee>();
	}

	// is empty
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	// size
	public int size() {
		return stack.size();
	}

	// push :-> add element
	public void push(Employee data) {
		stack.push(data);
	}

	// pop :-> remove element
	public Employee pop() {
		return stack.pop();
	}

	// peek :-> print top element
	public Employee peek() {
		return stack.peek();
	}

	// print stack
	public void printStack() {
		System.out.println(" top => ");
		for(Employee emp: stack) {
			System.out.println(emp);
		}
	}

}
