package com.nishant.array.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumber {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,3,9,9};
		duplicateNumber(arr);
		System.out.println();
		duplicateNumberWithMap(arr);
	}

	// O(n^2)
	private static void duplicateNumber(int[] arr) {
		System.out.print("In order of n^2 : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.print(" " + arr[i]);
				}
			}
		}
	}
	
	// O(n)
	private static void duplicateNumberWithMap(int[] arr) {
		System.out.print("In order of n : ");
		Map<Integer , Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				System.out.print(" " + arr[i]);
			}
			map.put(arr[i], i);
		}
	}
}
