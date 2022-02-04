package practiceProjects;

import java.util.Arrays;
import java.util.Scanner;

class Rotate {
    public static void main(String[] args) {
    	int[] arr = {1,2,3,4,5,6,7};
    	rotateArrayNTimes(arr, 5);
    	System.out.println(Arrays.toString(arr));
    }
    
    public static void rotateArrayNTimes(int[] nums, int rotations) {
    	
    	int[] temp = new int[nums.length];
    	
    	for (int i = 0; i < rotations; i++) {
    		temp[0] = nums[nums.length - 1];
    		for (int j = 1; j <= temp.length - 1; j++) 
    			temp[j] = nums[j - 1];
    		System.arraycopy(temp, 0, nums, 0, nums.length);
		}
    	
    }
}

