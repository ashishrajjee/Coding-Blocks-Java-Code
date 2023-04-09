package _3Array;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayAll{
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
//		int [] arr5 = new int[5];
//		for(int val : arr5)
//			System.out.print(val);
//		int [] arr = input();
		//int arr [] = {1,5,9,7,3,4,8,2,6};//for linear search(findIndexOfValue)
		//int arr [] = {10,20,30,40,50,60};
//		int arr [] = {3, 0, 4, 1, 2};//for inverse
//		int arr [] = {1, 2, 3, 4, 5};//for barGraph
//		int arr [] = {10, 20, 30, 40};//for subArray
		//int arr [] = {5, 7, 9, 8, 2, 3, 4, 1, 6, 0};//for Pairsumin array
		//int arr [] = {0, 2, 3, -6, 1, 2, 3, -4, 5, -10, 6};//kadane Algorithm use for find maximum subArray sum
//		int arr [] = {8, -8, 9, -9, 10, -11, 12};//circularArrayMaxSubArrayFind
//		int arr [] = {5, 4, 3, 7, 6};//findNoOfTrangleInArray2
//		int arr [] = {1, 2, 3, 4, 5};//findNoOfTrangleInArray
//		int arr1 [] = {2, 3, 7, 8, 11, 12, 15, 16, 20};//maximumPathSum
//		int arr2 [] = {1, 5, 7, 9, 10, 15, 30, 34};//maximumPathSum
//		print(arr1);//maximumPathSum
//		print(arr2);//maximumPathSum
		int arr[] = {6, 1, 6, 5, 3, 2, 5, 0, 5, 6, 0};//printTripleteSumInArray
		//print(arr);
		//printTripleteSumInArray(arr, 5);
//		System.out.print("Maximum " + maxinArray(arr));
//		System.out.print("Minmum " + maninArray(arr));
		//System.out.println("Please Enter Value that you want index Number");
		//int findValue = s.nextInt();//find index in arr
		//int a  = findIndexOfValue(arr, findValue);
		//int a  = findIndexOfValue(arr, 3);
		//System.out.println("Element found at Index " + a);
//		System.out.println(binarySearch(arr, 3));
		//reverseArrayValue(arr);
		//print(arr);
		
//		rotateValuePrintList(arr, 4);
//		print(arr);
//		
//		rotateValue2(arr, 4);
//		print(arr);
		
//		int [] inverse = inverse(arr);
//		print(inverse);
//		barGraph(arr);
//		int arr [] = {5, 7, 9, 8, 2, 3, 4, 1, 6, 0};
//		countPairSumInArray(arr, 9);
//		printPairSumInArray(arr, 9);
//		moreDiffrenceInPairSumArray(arr, 9);
//		lessDiffrenceInPairSumArray(arr, 9);
//		printTripleteSumInArray(arr,5);
//		subArrayUsing3Loop(arr);
//		printSubArraySumUsing3Loop(arr);
//		printSubArraySumUsing2Loop(arr);
		System.out.println(maximumSubArraySumUsing2Loop(arr));	
//		int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
		System.out.println(kadaneAlgorithamfindMaxSubArraySum(arr));
//		System.out.println(kadaneAlgorithamSubArraySumIndexFind(arr));
//		System.out.println(circularArrayMaxSubArrayFind(arr));
//		System.out.println(findNoOfTrangleInArray(arr));
		//System.out.println(findNoOfTrangleInArray2(arr));
		//System.out.println(findNoOfTrangleInArray3(arr));
//		System.out.println("Maximum Path Sum is " + maximumPathSum(arr1, arr2));//maximumPathSum
		
//		String s = "I am ashish Raj";
//		String[] g =s.split(" ");
//		
//		for(String a : g) {
//			System.out.println(a);
//		}
		
//		List<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		int d = 3;
//		System.out.println(list);
//		List<Integer> arr2 = leftRotate(d, list);
//		System.out.println(arr2);
//		
//		int[] ans = leftRotate2(d, list);
//		for(int i = 0; i < ans.length; i++) {
//			System.out.print(ans[i] + " ");
//		}
//		
//		System.out.println();
//		int[] ansswer = leftRotate3(d, arr);
//		for(int i = 0; i < ansswer.length; i++) {
//			System.out.print(ansswer[i] + " ");
//		}
		
	}
	
	public static int[] input() {
		
		int n = s.nextInt();
		
		int [] arr = new int[n];
		
		for(int i = 0; i <arr.length; i++)
			arr[i] = s.nextInt();
		
		return arr;
	}
	
	public static void print(int arr[]) {
		for(int value : arr)
			System.out.print(value + " ");
		System.out.println();
		System.out.println();
	}
	
	public static int maxinArray(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int value : arr) {
			if(value > max)
				max = value;
		}
		return max;
	}
	
	public static int maninArray(int arr[]) {
		int min = Integer.MAX_VALUE;
		for(int value : arr) {
			if(value < min)
				min = value;
		}
		return min;
	}
	
	public static int findIndexOfValue(int arr[], int value) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == value)
				return i;
		}
		return - 1;
	}
	
	public static int binarySearch(int arr[], int value) {
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = (start + end) / 2;
			if(arr[mid] == value)
				return mid;
			else if(arr[mid] < value)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return -1;
	}
	
	public static void reverseArrayValue(int arr []) {
		int start = 0;
		int end = arr.length - 1;
		while(start < end) {
			int temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
	}
	
	public static void rotateValueUsingReverse(int arr [], int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
	}
	
	public static void rotateValue(int arr [], int rotate) {
		
		rotate = rotate % arr.length;
		
		for(int i = 0; i < rotate; i++) {
			
			int temp = arr[arr.length - 1];
			
			for(int j = arr.length - 1; j > 0; j--) {
//				int temp = arr[j];
				arr[j] = arr[j - 1];
//				arr[0] = temp;
			}
			
			arr[0] = temp;
		}
	}
	
	public static void rotateValue2(int arr [], int rotate) {
		rotate = rotate % arr.length;
		rotateValueUsingReverse(arr, 0, arr.length - rotate - 1); //form starting to rotation start
		rotateValueUsingReverse(arr, arr.length - rotate, arr.length - 1);//form rotation start to arr.length
		reverseArrayValue(arr);//reverse all
	}
	
	public static int[] inverse(int arr[]) {
		int result[] = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++)
			result[arr[i]] = i;
		
		return result;
	}
	
	public static void barGraph(int arr[]) {
		
		int rows = maxinArray(arr);
		int columns = arr.length;
		
		for(int ro = 1; ro <= rows; ro++) {
			
			for(int cols = 0; cols < columns; cols++) {
				
				if(ro <= rows - arr[cols])
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void subArrayUsing3Loop(int arr[]) {
		for(int start = 0; start < arr.length; start++) {
			for(int end = start; end < arr.length; end++) {
				for(int print = start; print <= end; print++) {
					System.out.print(arr[print] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public static void printSubArraySumUsing3Loop(int arr[]) {
		for(int start = 0; start < arr.length; start++) {
			for(int end = start; end < arr.length; end++) {
				int sum = 0;
				for(int print = start; print <= end; print++) {
					if(print != end)
						System.out.print("(" + arr[print] + ") + ");
					else
						System.out.print("(" + arr[print] + ")");
					sum = sum + arr[print];
				}
				System.out.println(" = " + sum);
			}
			System.out.println();
		}
	}
	
	public static void printSubArraySumUsing2Loop(int arr[]) {
		for(int start = 0; start < arr.length; start++) {
			int sum = 0;
			for(int end = start; end < arr.length; end++) {
				System.out.print(arr[end] + " ");
				sum = sum + arr[end];
				System.out.println(" = " + sum);
			}
			System.out.println();
		}
	}
	
	public static void printMaximumSubArraySumUsing2Loop(int arr[]) {
		
		int max = 0;
		for(int start = 0; start < arr.length; start++) {
			int sum = 0;
			for(int end = start; end < arr.length; end++) {
				sum = sum + arr[end];
				if(sum > max)
					max = sum;
			}
			//System.out.println(max);
			//max = Integer.MIN_VALUE;
		}
		System.out.println(max);
	}
	
	public static int maximumSubArraySumUsing2Loop(int arr[]) {
		
		int max = 0;
		for(int start = 0; start < arr.length; start++) {
			int sum = 0;
			for(int end = start; end < arr.length; end++) {
				sum = sum + arr[end];
				if(sum > max)
					max = sum;
			}
		}
		return max;
	}
	
	public static void countPairSumInArray(int arr[], int num) {
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length - 1;
		int count = 0;
		while(start < end) {
			if(num == arr[start++] + arr[end--])
				count++;
			else if(num > arr[start] + arr[end])
				start++;
			else
				end--;
		}
		System.out.println(count);
	}
	
	public static void printPairSumInArray(int arr[], int num) {
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length - 1;
		while(start < end) {
			if(num == arr[start] + arr[end]) {
				System.out.println(arr[start] +" "+ arr[end]);
				start++;
				end--;

			}
			else if(num > arr[start] + arr[end])
				start++;
			else
				end--;
		}
	}
	
	public static void moreDiffrenceInPairSumArray(int arr[], int num) {
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length - 1;
		while(start < end) {
			if(num == arr[start] + arr[end]) {
				System.out.println(arr[start] +" "+ arr[end]);
				start++;
				end--;
				break;
			}
			else if(num > arr[start] + arr[end])
				start++;
			else
				end--;
		}
	}
	
	public static void lessDiffrenceInPairSumArray(int arr[], int num) {
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length - 1;
		int left = Integer.MIN_VALUE , right = Integer.MIN_VALUE;
		while(start < end) {
			if(num == arr[start] + arr[end]) {
				left = arr[start];
				right = arr[end];
				start++;
				end--;
			}
			else if(num > arr[start] + arr[end])
				start++;
			else
				end--;
		}
		System.out.print(left + " " + right);
	}
	
	public static void printTripleteSumInArray(int arr[], int num) {
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			int start = i + 1;
			int end = arr.length - 1;
			//int number = num - arr[i];//if on this line then change in while num to number
			while(start < end) {
				//if(number == arr[start] + arr[end]) {// also on this line
				if(num - arr[i] == arr[start] + arr[end]) {//comment this line then on upper line
					System.out.println(arr[i] + " " + arr[start] +" "+ arr[end]);
					//start++;
					end--;

				}
				//else if(number > arr[start] + arr[end])
				else if(num - arr[i] > arr[start] + arr[end])//comment this line then on this upper line
					start++;
				else
					end--;
			}
		}
	}
	
	public static int maxIn2Value(int a, int b) {
		return (a >= b) ? a : b;
	}
	
	public static int kadaneAlgorithamfindMaxSubArraySum(int arr[]) {
		int sum = 0;
		int maxSum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			sum = maxIn2Value(sum + arr[i], arr[i]);
			
			maxSum = maxIn2Value(sum, maxSum);
//			if(sum > maxSum)
//				maxSum = sum;
		}
		return maxSum;
	}
	
	public static int kadaneAlgorithamSubArraySumIndexFind(int arr[]) {
		int sum = 0;
		int []index = new int[arr.length];
		index[0] = 0;
		int maxSum = Integer.MIN_VALUE;
		int lastindex = 0;
		int startindex = 0;
		for(int i = 1; i < arr.length; i++) {
			
			if(sum + arr[i] >= arr[i])
				index[i] = index[i- 1];
			else
				index[i] = i;
			sum = maxIn2Value(sum + arr[i], arr[i]);
			if(sum > maxSum) {
				maxSum = sum;
				lastindex = i;
				startindex = index[lastindex];
			}
		}
		for(int indexnumber : index) {
			System.out.print(indexnumber + " ");
		}
		System.out.println();
		System.out.println(startindex + " " + lastindex);
		return maxSum;
	}
	
	public static int circularArrayMaxSubArrayFind(int arr[]) {
		
		int contributingElementNotWrappingMaximumSum =  kadaneAlgorithamfindMaxSubArraySum(arr);
		
		int totalsum = 0;
		for(int i = 0; i < arr.length; i++) {
			totalsum += arr[i];
			arr[i] = -arr[i];
		}
		int nonContributingElementNotWrappingMaximumSum =  kadaneAlgorithamfindMaxSubArraySum(arr);
		
		int contributingElementWrappingMaximumSum = totalsum + nonContributingElementNotWrappingMaximumSum;
		
		return Math.max(contributingElementNotWrappingMaximumSum, contributingElementWrappingMaximumSum);
	}
	
	public static int findNoOfTrangleInArray(int arr[]) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				for(int k = j + 1; k < arr.length; k++) {
					if(arr[i] + arr[j] > arr[k] && arr[i] + arr[k] > arr[j] && arr[j] + arr[k] > arr[i]) {
						System.out.println(arr[i] +" " + arr[j] + " " + arr[k]);
						count++;
					}
				}
			}
		}
		return count;
	}
	
	public static int findNoOfTrangleInArray2(int arr[]) {
		Arrays.sort(arr);
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				for(int k = j + 1; k < arr.length; k++) {
					if(arr[i] + arr[j] > arr[k]) {
						System.out.println(arr[i] +" " + arr[j] + " " + arr[k]);
						count++;
					}
				}
			}
		}
		return count;
	}
	
	public static int findNoOfTrangleInArray3(int arr[]) {
		Arrays.sort(arr);
		int count = 0;
		for(int last = arr.length - 1; last >= 0; last--) {
			int left = 0;
			int right = last - 1;
			while(left < right) {
				if(arr[left] + arr[right] > arr[last]) {
					count += right - left;
					/*
					for printing
					for(int i = left; i <= right - left; i++)
						System.out.println(arr[i] + " " + arr[right] + " " + arr[last]);
					*/
					right--;
				}
				else {
					left++;
				}

			}
		}
		return count;
	}
	
	public static int maximumPathSum(int arr1[], int arr2[]) {
		int max = 0;
		int i = 0;
		int j = 0;
		int arr1Sum = 0;
		int arr2Sum = 0;
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				arr1Sum += arr1[i];
				i++;
			}
			else if(arr1[i] > arr2[j]) {
				arr2Sum += arr2[j];
				j++;
			}
			else {
				//max += + arr1[i] + maxIn2Value(arr1Sum, arr2Sum);//if on this then comment below
				max += maxIn2Value(arr1Sum, arr2Sum);//comment
				if(arr1[i] == arr2[j])//comment
					max += arr1[i];//comment
				//arr1Sum += arr1[i];
				//arr2Sum += arr2[j];
				//System.out.println(arr1Sum +" "+ arr2Sum + " = " + "Max is " + maxIn2Value(arr1Sum, arr2Sum) + "\n");
				i++;
				j++;
				arr1Sum = 0;
				arr2Sum = 0;
				
			}
		}
		while(i < arr1.length) {
			arr1Sum += arr1[i];
			i++;
		}
		while(j < arr2.length) {
			arr2Sum += arr2[j];
			j++;
		}
		max += maxIn2Value(arr1Sum, arr2Sum);
		System.out.println(arr1Sum +" "+ arr2Sum + " = " + "Max is " + maxIn2Value(arr1Sum, arr2Sum) + "\n");
		
		return max;
	}
	
	
	public static void rotateValuePrintList(int arr [], int rotate) {
		
		rotate = rotate % arr.length;
		
		for(int i = 0; i < rotate; i++) {
			
//			int temp = arr[0];
			
			for(int j = 0; j < arr.length - 1; j++) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
			
//			arr[arr.length - 1] = temp;
		}
	}
	
	
	public static List<Integer> leftRotate(int d, List<Integer> arr){
		
		List<Integer> ans = new ArrayList<>();
		
		for(int i = d; i < arr.size(); i++) {
			ans.add(arr.get(i));
		}
		for(int i = 0; i < d; i++) {
			ans.add(arr.get(i));
		}
		
		return ans;
	}
	
	
	public static int[] leftRotate2(int d, List<Integer> list){
		 
//		d = d % list.size();
		
		int[] result = new int[list.size()];
		
		int i4Array = 0;
		int j4list = d;
		
		while(i4Array < list.size() - d) {
			result[i4Array++] = list.get(j4list++);
		}
		j4list = 0;
		while(i4Array < list.size()) {
			result[i4Array++] = list.get(j4list++);
		}
		
		return result;
	}
	
	public static int[] leftRotate3(int d, int[] list){
		 
//		d = d % list.size();
		
		int[] result = new int[list.length];
		
		int arrayIndex = 0;
		int listIndex = d;
		
		while(arrayIndex < list.length - d) {
			result[arrayIndex++] = list[listIndex++];
		}
		listIndex = 0;
		while(arrayIndex < list.length) {
			result[arrayIndex++] = list[listIndex++];
		}
		
		return result;
	}
	
	
	
	
	
	
}
