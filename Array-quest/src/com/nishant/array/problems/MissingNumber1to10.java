package com.nishant.array.problems;

import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumber1to10 {

	public static void main(String[] args) {
		System.out.println("Missing number with Mathematical function : " + String.
				valueOf(missingNumber()));
		int[] arr = new int[]{1,2,3,4,6,7,9,10};
		int len = 10;
		missingNumberJ(arr , len);
	}

	private static void missingNumberJ(int[] arr , int len) {		
		BitSet bitSet = new BitSet();
		for(int i=0;i<arr.length;i++) {
			bitSet.set(arr[i]);
		}
		System.out.print("Missing number With Java function are : ");
		for(int i=1;i<10;i++) {
			if(bitSet.get(i) == false) {
			System.out.print(i  + " ");
			}
		}
	}

	private static int missingNumber() {
		List<Integer> list = Arrays.asList(1,2,3,4,6,7,8,9,10);
		Integer sumOfArray = list.stream().collect(Collectors.
				summingInt(Integer::intValue));
		int missingNumber = (10 * (101))/2 - sumOfArray;
		return missingNumber;
	}
	
	
}