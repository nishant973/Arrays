package com.nishant.array.sorting;

// O(n^2)
// Compare first element with next and so one in first go and put the max a last in first pass and goes on...
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] {64 ,25, 12, 22, 11};
		arr = bubbleSort(arr);
		bubbleSortRecursive(arr, arr.length);
		printArray(arr);

	}
	private static int[] bubbleSort(int[] arr) {
		int temp = 0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	private static void bubbleSortRecursive(int[] arr , int n) {
       
        for (int i=0; i<n-1; i++) 
            if (arr[i] > arr[i+1]) 
            { 
                int temp = arr[i]; 
                arr[i] = arr[i+1]; 
                arr[i+1] = temp; 
                bubbleSortRecursive(arr, n-1); 
            }  
         
	}

	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]  + " ");
		}
		System.out.println();
	}
}
