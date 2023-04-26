package Logical_programs;

import java.util.Arrays;

public class compair_array {
	public static void main(String[] args) {
		int arr1[] = {1,2,3};
		int arr2[] = {4,5,6};
		int arr3[] = {1,2,3};
		System.out.println(Arrays.equals(arr1, arr2));//false
		System.out.println(Arrays.equals(arr1, arr3));//true
		
		System.out.println(Arrays.deepEquals(args, args));//used to compaire two multidimensional arrys
	}

}
