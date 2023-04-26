package Logical_programs;

import java.util.Arrays;

public class sum_of_array {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int sum =0;
		
		for(int i=0; i<=arr.length-1; i++)
		{
			sum = sum+arr[i];
		}
		System.out.println("sum of array is " + sum);
		
		System.out.println("--sort array in ascending order--");
		Arrays.sort(arr);
		
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("--sort array in descending order--");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
	}

}
