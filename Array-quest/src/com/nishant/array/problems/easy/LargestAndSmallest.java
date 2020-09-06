package com.nishant.array.problems.easy;

//O(n)
public class LargestAndSmallest {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,4465,90,65,-3 , -213 , -980,65,34};
		printLAndS(arr);
	}

	private static void printLAndS(int[] arr) {
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > min) {
				min = arr[i]; 
			}
			if(arr[i] < max) {
				max = arr[i]; 
			}
		}
		System.out.println("largest element in array : " + min);
		System.out.println("smallest element in array : " + max);
	}

}
