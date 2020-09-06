package com.nishant.array.sorting;

// O(n^2)
// Pick key and compare with predecessor until find min and put at first and goes on...
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 12, 11, 13, 5, 6 };
		arr = insertionSort(arr);
		insertionSortRecursive(arr , arr.length);
		printArray(arr);
	}
	
	private static int[] insertionSort(int[] arr) {
		for(int i=1;i<arr.length;++i) {
			 int key = arr[i];
			 int j = i-1;
			 while(j >=0 && arr[j] > key) {
				 arr[j+1] = arr[j];
				 j = j-1;
			 }
			 arr[j+1] = key;
	        } 
		return arr;
	}
	
	private static void insertionSortRecursive(int[] arr , int size) {
		 if (size <= 1) {
			 return;
		 }
	     insertionSortRecursive( arr, size-1 ); 
	     int last = arr[size-1]; 
	     int j = size-2; 
	        while (j >= 0 && arr[j] > last) 
	        { 
	            arr[j+1] = arr[j]; 
	            j--; 
	        } 
	        arr[j+1] = last; 
	}

	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]  + " ");
		}
		System.out.println();
	}
}
