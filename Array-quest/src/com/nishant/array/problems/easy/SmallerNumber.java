package com.nishant.array.problems.easy;

public class SmallerNumber {

	public static void main(String[] args) {
		int[] arr = {7,7,7,7};
		int[] newArr = new int[arr.length];
		newArr  = smallerNumbersThanCurrent(arr , 0 , newArr);
		printArray(newArr);
	}

	private static int[] smallerNumbersThanCurrent(int[] arr , int key , int[] newArr) {
		int max = arr[key] ,  count = 0;;
		
			for(int i=0;i<arr.length;i++) {
				if(arr[i] < max) {
					count++;
				}
			}
		newArr[key] = count;
		key++;
		if(key < arr.length){
			smallerNumbersThanCurrent(arr , key , newArr);
		}
		return newArr;
	}

	private static void printArray(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]  + " ");
		}
		System.out.print("]");
	}
}
