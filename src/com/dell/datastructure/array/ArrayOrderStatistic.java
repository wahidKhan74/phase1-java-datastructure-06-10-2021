package com.dell.datastructure.array;

import java.util.Arrays;

public class ArrayOrderStatistic {

	public static void main(String[] args) {

		int[] items = { -15, 20, 24, 50, 26, 78, 90 };

		int pos = 3;

		int res = findKthSmallest(items, pos);
		System.out.println(" The "+pos + " smallest element is "+res);

		int res2 = findKthLargest(items, pos);
		System.out.println(" The "+pos + " largest element is "+res2);
	}

	private static int findKthLargest(int[] items, int pos) {

		// sort array in ascending
		Arrays.sort(items);

		// return kth largest
		return items[items.length - pos];

	}

	private static int findKthSmallest(int[] items, int pos) {
		
		// sort array in ascending
		Arrays.sort(items);

		// return kth smallest
		return items[pos - 1];

	}

}
