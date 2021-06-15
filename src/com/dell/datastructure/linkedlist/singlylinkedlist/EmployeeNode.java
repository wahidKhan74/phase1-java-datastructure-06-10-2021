package com.dell.datastructure.linkedlist.singlylinkedlist;

public class EmployeeNode {
	
	private Employee data ;
	private EmployeeNode next;
	
	// create a node
	EmployeeNode(Employee data) {
		this.data = data;
	}

	// get & sets methods
	public Employee getData() {
		return data;
	}

	public void setData(Employee data) {
		this.data = data;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "EmployeeNode [data=" + data + ", next=" + next + "]";
	}	
	
}
