package com.nishant.array.problems;

// find largest contiguous sum sub array
public class LargestSumSubArr {

	public static void main(String[] args) {
		int[] arr = new int[]{-2,-3,4,-1,-2,1,5,-3};
		int max = maxSubArraySum(arr);
		System.out.println("max number is : " + max);
		System.out.println("max number is : " + String.valueOf(kadaneAlgo(arr)));
	}

	// O(n)
	// The idea is to store only ve number
	private static int kadaneAlgo(int[] arr) {
		int max = Integer.MIN_VALUE, sum = 0; 
		  
        for (int i = 0; i < arr.length; i++) 
        { 
            sum = sum + arr[i]; 
            if (max < sum) 
                max = sum; 
            if (sum < 0) 
                sum = 0; 
        } 
        return max;
	}

	// O(n^2)
	private static int maxSubArraySum(int[] arr) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = 0;
			sum = sum + arr[i];
			for(int j = i+1;j<arr.length;j++) {
				sum = sum + arr[j];
				if(sum > max) {
					max = sum;
				}
			}
		}
		return max;
	}

}