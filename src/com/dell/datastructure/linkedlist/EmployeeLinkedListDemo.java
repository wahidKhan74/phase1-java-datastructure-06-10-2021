package com.dell.datastructure.linkedlist;

import java.util.LinkedList;

public class EmployeeLinkedListDemo {

	public static void main(String[] args) {

		Employee employee1 = new Employee(101, "Marry Smith", "Engineering", 223344);
		Employee employee2 = new Employee(102, "John Smith", "Engineering", 6776678);
		Employee employee3 = new Employee(103, "Tony Stark", "Test", 2342345);
		Employee employee4 = new Employee(104, "Will Smith", "Test", 25445644);
		Employee employee5 = new Employee(105, "Rohn Smith", "Dev", 7873344);

		LinkedList<Employee> employees = new LinkedList<Employee>();

		// add employee
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);

		System.out.println(employees);

		// add element in start : head
		employees.addFirst(employee4);
		System.out.println(employees);

		// add element in last : tail
		employees.addLast(employee5);		
		System.out.println(employees);
		
		// remove elements
		employees.removeFirst();
		employees.removeLast();
		System.out.println(employees);
		

	}

}
