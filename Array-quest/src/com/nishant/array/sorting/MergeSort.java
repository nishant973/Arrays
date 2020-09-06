package com.nishant.array.sorting;

// O(nlogn)
// Divide And Conquer ---> Divide array recursively and then merge 
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 12, 11, 13, 5, 6, 90 , 17 , 70 , 98 , 102 , 45 };
		mergeSort(arr , arr.length);
		printArray(arr);
	}

	private static void mergeSort(int[] arr, int length) {
		 if (length < 2){
		        return;
		 }
		 
		int mid = length/2;
		
		int[] left = new int[mid];
		int[] right = new int[length-mid];
		
		for(int i=0;i<mid;i++) {
			left[i] = arr[i];
		}for(int j=mid;j<length;j++) {
			right[j - mid] = arr[j];
		}
		
		mergeSort(left, mid);
		mergeSort(right, length - mid);
		
		merge(arr , left , right , mid , length - mid);
	}

	private static void merge(int[] arr, int[] leftArr, 
			int[] rightArr , int left, int right) {
		int i = 0 , j = 0 , k = 0;
		while(i < left && j <  right) {
			if(leftArr[i] <= rightArr[j]) {
				arr[k++] = leftArr[i++];
			}else {
				arr[k++] = rightArr[j++];
			}
		}
			while(i < left) {
				arr[k++] = leftArr[i++];
			} while (j < right) {
		        arr[k++] = rightArr[j++];
		    }
	}
	
	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]  + " ");
		}
		System.out.println();
	}

}
