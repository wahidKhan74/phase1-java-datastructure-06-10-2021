package com.dell.datastructure.linkedlist.singly;

public class EmployeeSinglyLinkedList {
	
	// node
	private EmployeeNode head;
	private int size;
	
	// operations
	
	// size
	public int getSize() {
		return size;
	}
	
	// isEmpty
	public boolean isEmpty() {
		return head == null;
	}
	
	// add element
	public void addToFront(Employee data) {
		// create a node
		EmployeeNode node =new EmployeeNode(data);
		// set next node 
		node.setNext(head);
		// set head as new node
		head = node;
		size++;		
	}
	
	// remove element
	public EmployeeNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		EmployeeNode removedNode = head;
		// set next node in list as head
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	
	//print list
	public void printList() {
		EmployeeNode current = head;
		System.out.println("Head  -> ");
		while(current !=null) {
			System.out.print(current.getData());
			System.out.println("=>");
			current = current.getNext();
		}
		System.out.println("null");
	}
	
}
