package com.nishant.array.sorting;

// O(n^2)
public class BrickSort {

	public static void main(String[] args) {
		int arr[] = {3, 2, 3, 8, 5, 6, 4, 1};
		oddevenSort(arr , arr.length);
		printArray(arr);
	}

	private static void oddevenSort(int[] arr, int length) {
		
		boolean isSorted = false;
		
		while(!isSorted) {
			int temp = 0;
		
			isSorted = true;
			for(int i=1;i<=length-2;i=i+2) {
				if(arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					isSorted = false;
				}
			}
		
			for(int i=0;i<=length-2;i=i+2) {
				if(arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					isSorted = false;
				}
			}
		}
	}

	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]  + " ");
		}
	}
}
