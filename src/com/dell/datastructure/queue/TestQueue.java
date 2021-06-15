package com.dell.datastructure.queue;

public class TestQueue {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(101, "Marry Smith", "Engineering", 223344);
		Employee employee2 = new Employee(102, "John Smith", "Engineering", 6776678);
		Employee employee3 = new Employee(103, "Tony Stark", "Test", 2342345);
		Employee employee4 = new Employee(104, "Will Smith", "Test", 25445644);
		Employee employee5 = new Employee(105, "Rohn Smith", "Dev", 7873344);
		
		ArrayQueue queue = new ArrayQueue(2);
		
		System.out.println("Queue size : "+queue.size());
		queue.add(employee1);
		queue.add(employee2);
		queue.add(employee3);
		queue.add(employee4);
		queue.add(employee5);
		
		System.out.println("Queue size : "+queue.size());
		queue.printQueue();
		
		System.out.println("Before remove : Front element "+queue.peek());
		System.out.println("Remove element "+queue.remove());
		System.out.println("After remvoe : Front element "+queue.peek());
		queue.printQueue();

	}

}
