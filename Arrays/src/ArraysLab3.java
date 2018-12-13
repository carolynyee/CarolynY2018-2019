// Carolyn Yee
// Array Lab 3- practicing using arrays and making methods with them
// 11/19/2018

//import java.lang.reflect.Array;
//^is this needed? Why did I import this???

import java.util.Arrays;

public class ArraysLab3 {

	public static void main(String[] args) {
		int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
		int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
		int[] sumArr = sum(a1, a2);
		int appendNum = 200;
		int[] appendArr = append(a1, appendNum);
		int removeIdx = 5;
		int[] removeArr = remove(a2, removeIdx);
		int sumOfEvens = sumEven(appendArr);
		rotateRight(a1);
		System.out.println(Arrays.toString(sumArr));
		System.out.println(Arrays.toString(appendArr));
		System.out.println(Arrays.toString(removeArr));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));
	}
	
	//sum
	//return array of integers where every element is sum of elements at that index
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] sum = new int[arr1.length];
		
			for (int i = 0; i < arr1.length; i++ ) {
					sum[i] = arr1[i] + arr2[i];
				}
		return sum;
	}
	
	//append
	//return array of integers that is same as int[] arr with "num" added at the end
	public static int[] append(int[]arr, int num) {
		int[] append = new int[arr.length + 1];
		
			for (int i = 0; i < arr.length; i++) {
				append[i] = arr[i];
				}
		
			append[arr.length] = num;
		
		return append;
	}
	
	//remove
	//takes out the interger at index of idx, everything else stays same
	public static int[] remove(int[] arr, int idx) {
		int[] remove = new int[arr.length - 1];
		
			for (int i = 0; i < arr.length - 1; i++) {
				remove[i] = arr[i];
			}
		
				for (int i = idx; i < arr.length - 1; i++) {
					remove[i] = arr [i + 1];
				}
		
		return remove;	
	}
	
	//sumEven
	//returns sum of integers at even indices
	public static int sumEven(int[]arr) {
		int sum = 0;
		
			for (int x = 0; x <= arr.length - 1; x += 2) {
				sum = sum + arr[x];
			}
		
		return sum;
	}
	
	//rotateRight
	//all elements shift once to the right, last one moves to the front
	public static void rotateRight(int[] arr) {
		int temp = arr[arr.length - 1];
		
			for (int i = arr.length -1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
		
		arr[0] = temp;
	}
	
}


