package com.dell.datastructure.linkedlist.singly;

public class SinglyLinkedListTest {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(101, "Marry Smith", "Engineering", 223344);
		Employee employee2 = new Employee(102, "John Smith", "Engineering", 6776678);
		Employee employee3 = new Employee(103, "Tony Stark", "Test", 2342345);
		Employee employee4 = new Employee(104, "Will Smith", "Test", 25445644);
		Employee employee5 = new Employee(105, "Rohn Smith", "Dev", 7873344);
		
		// create a employee singly linked list
		EmployeeSinglyLinkedList singlyLinked =  new EmployeeSinglyLinkedList();
		
		System.out.println("List is empty :" +singlyLinked.isEmpty());
		System.out.println("List Size :" +singlyLinked.getSize());
		
		singlyLinked.addToFront(employee5);
		singlyLinked.addToFront(employee1);
		singlyLinked.addToFront(employee2);
		singlyLinked.addToFront(employee3);
		singlyLinked.addToFront(employee4);	
		
		
		System.out.println("List is empty :" +singlyLinked.isEmpty());
		System.out.println("List Size :" +singlyLinked.getSize());
		
		singlyLinked.printList();
		
		singlyLinked.removeFromFront();	
		
		singlyLinked.printList();
		

	}

}
