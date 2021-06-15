package com.dell.datastructure.linkedlist.circularlinkedlist;

public class EmployeeCircularLinkedList {

	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;

	// get size
	public int getSize() {
		return size;
	}

	// is empty
	public boolean isEmpty() {
		return head == null;
	}

	// add to element
	public void addElement(Employee data) {
		// create a node
		EmployeeNode node = new EmployeeNode(data);
		// if list is empty
		if (isEmpty()) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
		}

		// append
		tail = node;
		// for circular linked list tail next node -> head
		tail.setNext(head);
		size++;
	}

	// remove element
	public EmployeeNode removeElement() {
		if (isEmpty()) {
			return null;
		}
		EmployeeNode removeNode = head;
		// change new head node
		head = head.getNext();
		size--;

		removeNode.setNext(null);
		tail.setNext(head);
		return removeNode;
	}

	// print list
	public void printList() {
		EmployeeNode current = head;
		if (current == null) {
			System.out.println("Circulat Linked list is empty");
		} else {

			System.out.println("Head =>");
			do {
				if (current != null) {
					System.out.print(current.getData());
					System.out.println(" = >");
					current = current.getNext();
				}
			} while (current != head);

		}

	}
}
