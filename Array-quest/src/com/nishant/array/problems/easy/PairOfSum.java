package com.nishant.array.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class PairOfSum {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 5 , 4};
		int input = 7;
		pairOfSumMap(arr , input);
	}

	// O(n^2)
	private static void pairOfSum(int[] arr, int input) {
		System.out.print("Pairs are : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(input == arr[i] + arr[j]) {
					System.out.println(arr[i] + " , " + arr[j]);
				}
			}
		}
	}
	
	// O(n)
	private static void pairOfSumMap(int[] arr , int input) {
		Map<Integer , Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int complement = input - arr[i];
			if(map.containsKey(complement) && complement == map.get(complement)) {
				System.out.println(complement + " , " + arr[i]);
			}
			map.put(arr[i], arr[i]);
		}
	}

}
