package com.nishant.array.sorting;

// O(n^2)
// select min from all elements  and put at first index at first go  and goes on...
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[] {64 ,25, 12, 22, 11};
		arr = selectionSort(arr);
		printArray(arr);
	}

	private static int[] selectionSort(int[] arr) {
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]  + " ");
		}
		System.out.println();
	}
}
