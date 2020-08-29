package com.nishant.array.searching;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

//Best Case  : O(1)
//Worst Case : O(log2n).
public class BinarySearch {

	//private static Logger logger = Logger.getLogger("com.nishant.array.earching.BinarySearch");
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array...");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new SecureRandom().nextInt(100);
		}
		System.out.println("array is created with size: " + size  + " and limited to 100...");
		printArray(arr);
		System.out.println("Enter the number to be sarched...");
		int number = scanner.nextInt();
		
		/* boolean searched = binarySearch(arr , 
				number);*/
		Arrays.sort(arr);
		boolean searched = binarySearchRecurion(arr, number, 
				0, arr.length-1);
		if(!searched) {
			System.out.println("number is not prsent in array...");
		}else {
			System.out.println("number is present...");
		}
		scanner.close();
	}

	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	private static boolean binarySearch(int[] arr ,
			int number) {
		int mid = arr.length/2;
		//printArray(arr);
		if(number == arr[mid]) {
			return true;
		}else if(number < arr[mid]){
			for(int i = 0 ; i<mid;i++) {
				if(arr[i] == number) {
					return true;
				}
			}
		}else if(number > arr[mid]) {
			for(int i = mid+1 ; i<arr.length;i++) {
				if(arr[i] == number) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	private static boolean binarySearchRecurion(int[] arr , int number ,
			int start, int end) {
		if (end>=start){  
            int mid = start + (end - start)/2;  
            if (arr[mid] == number){  
            return true;  
            }  
            if (arr[mid] > number){  
            return binarySearchRecurion(arr, number , start, mid-1); 
            }else{  
            return binarySearchRecurion(arr, number ,mid+1, end); 
            }  
        }  
        return false; 
	}
}