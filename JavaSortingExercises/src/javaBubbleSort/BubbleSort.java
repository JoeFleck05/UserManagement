package javaBubbleSort;

import java.util.Arrays;

public class BubbleSort {
	
	void BubbleSort( int nums[]) {
		int n = nums.length;
		for(int i = 0 ; i < n - 1 ; i++){
			for (int j = 0 ; j < n-i-1 ; j++) {
				if (nums[j] > nums[j + 1]) {
					// swap temp and nums[i]
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
	}
	
	// Method to test code above
	public static void main(String args[]){
		BubbleSort ob = new BubbleSort();
		int nums[] = {-12,-6,0,6,12,24};
		System.out.println("Original Array");
		System.out.println(Arrays.toString(nums));
		ob.BubbleSort(nums);
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(nums));
	}

}
