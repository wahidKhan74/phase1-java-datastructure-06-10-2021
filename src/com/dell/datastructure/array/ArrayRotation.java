package com.dell.datastructure.array;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		
		int [] items  = { -15,20,24,50,26,78,90 };
		
		System.out.println("Before Rotation :");
		System.out.println(Arrays.toString(items));
		
//		rotateLeft(items,3);
//		rotateLeft(items,2);
		
		rotateRight(items,2);
		
		System.out.println("After Rotation :");
		System.out.println(Arrays.toString(items));
	}

	private static void rotateRight(int[] items, int cRotate) {
		
		if(cRotate > items.length )
			cRotate = cRotate % items.length;
		
		int[] temp = new int[items.length];
	
		//shift element into array
		for (int i = 0; i < cRotate; i++) {
			temp[i] = items[items.length-cRotate +i];
		}
		
		//shifting 
		int j=0;
		for (int i = cRotate; i < items.length; i++) {
			temp[i] = items[j];
			j++;
		}
		
		System.arraycopy(temp, 0, items, 0, items.length);
		
	}

	private static void rotateLeft(int[] items, int cRotate) {
		
		// create temp array
		int temp[] = new int[cRotate];
		
		// copy element into temp[] based on rotateCount
		for (int i = 0; i < cRotate; i++) {
			temp[i] = items[i];
		}
		
		// move /shift actual array element
		for (int i = cRotate; i < items.length; i++) {
			items[i-cRotate] = items[i];
		}
		
		// copy the temp element in actual array
		for (int i = 0; i < cRotate; i++) {
			items[i+items.length-cRotate]=temp[i];
		}
	}

}
