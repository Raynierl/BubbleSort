package main;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {6, 17, 4, 19, 5, 14, 1, 7, 13, 18, 3, 15, 12, 10, 16, 11, 9, 2, 8, 20 };
		int n = 15; // This is the value to compare the numbers too
		// Setting up the double for loops to perform a bubble sort
		for(int i = 0; i<arr.length;i++) {
			for(int j =0; j < arr.length - i-1; j++) {
				// Doing Abs(arr[j] - 1) because if we did it without the "- n" then it would just compare the number to 0
				// and with the "- n" the number '10' minus 15 will be -5 which is the differnce between the 2 numbers
				// then we use Math.abs to compare that number to 0 which gives us the difference and we perform the same action on the
				// following index. comparing the abs to n the same way.
				// since we are touching every number we are comparing every number by its absolute value to n
				if(Math.abs(arr[j] - n) > Math.abs(arr[j+1] - n)) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		// Outputting the Array.
		System.out.println(Arrays.toString(arr));
	}

}
