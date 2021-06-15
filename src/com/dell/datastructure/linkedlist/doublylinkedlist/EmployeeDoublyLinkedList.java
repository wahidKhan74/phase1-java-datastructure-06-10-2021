package com.dell.datastructure.linkedlist.doublylinkedlist;

public class EmployeeDoublyLinkedList {
	
	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;
	
	//get size
	public int getSize() {
		return size;
	}
	// is empty
	public boolean isEmpty() {
		return head == null;
	}
	
	// add element to front
	public void addToFront(Employee data) {
		// create a node
		EmployeeNode node = new EmployeeNode(data);
		if(isEmpty()) {
			tail = node;
		} else {
			head.setPrevious(node);
			node.setNext(head);
		}		
		head = node;
		size++;		
	}
	
	// add element to end
	public void addToEnd(Employee data) {
		// create a node
		EmployeeNode node = new EmployeeNode(data);
		if(isEmpty()) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
		size++;
	}
	
	// remove element from front
	public EmployeeNode removeFromFront() {
		
		if(isEmpty()) {
			return null;
		}
		EmployeeNode removedNode = head;
		if(head.getNext()==null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}
		
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	
	// remove element from end
	public EmployeeNode removeFromEnd() {
		
		if(isEmpty()) {
			return null;
		}
		EmployeeNode removedNode = tail;
		if(tail.getPrevious() == null) {
			head=null;
		}else {
			tail.getPrevious().setNext(null);
		}	
		
		tail = tail.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	
	// print list
	public void printList() {
		EmployeeNode current = head;
		System.out.println("Head =>");
		while(current != null) {
			System.out.print(current.getData());
			System.out.println(" < = >");
			current = current.getNext();
		}
		System.out.println(" <= Tail");
	}
}
