package com.dell.datastructure.linkedlist.circularlinkedlist;

public class TestCircularLinkedList {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(101, "Marry Smith", "Engineering", 223344);
		Employee employee2 = new Employee(102, "John Smith", "Engineering", 6776678);
		Employee employee3 = new Employee(103, "Tony Stark", "Test", 2342345);
		Employee employee4 = new Employee(104, "Will Smith", "Test", 25445644);
		Employee employee5 = new Employee(105, "Rohn Smith", "Dev", 7873344);
		
		EmployeeCircularLinkedList list = new EmployeeCircularLinkedList();
		
		System.out.println("List size :: "+list.getSize());
		System.out.println("List is empty :: "+list.isEmpty());
		
		list.addElement(employee1);
		list.addElement(employee2);
		list.addElement(employee3);
		list.addElement(employee4);
		
		System.out.println("List size :: "+list.getSize());
		System.out.println("List is empty :: "+list.isEmpty());
		
		list.printList();
		
		list.removeElement();
		
		list.printList();
		

	}

}
