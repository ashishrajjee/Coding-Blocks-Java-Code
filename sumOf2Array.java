package _9ArrayList;

import java.util.*;

public class sumOf2Array {

	public static void main(String[] args) {
		int arr1[] = {9, 8, 7, 5};
		int arr2[] = {9, 6, 7};
		System.out.println(sumOfTwoArrays(arr1, arr2));
		System.out.println(sumOfTwoArrays2(arr1, arr2));
		
		String str = "DDIDDIDD";
		System.out.println(str);
		
		int result[] = ddlquestion(str);
		
		for(int val : result)
			System.out.print(val + " ");
		
	}
	
	public static ArrayList<Integer> sumOfTwoArrays(int arr1[], int arr2[]){
		
		ArrayList<Integer> result = new ArrayList<>();
		
		int a1Last = arr1.length - 1;
		int a2Last = arr2.length - 1;
		int carry = 0;
		
		while(a1Last >= 0 && a2Last >= 0) {
			int ans = arr1[a1Last--] + arr2[a2Last--] + carry;
			result.add(0, ans % 10);
			carry = ans / 10;
		}
		while(a1Last >= 0) {
			int ans = arr1[a1Last--] + carry;
			result.add(0, ans % 10);
			carry = ans / 10;
		}
		while(a2Last >= 0) {
			int ans = arr2[a2Last--] + carry;
			result.add(0, ans % 10);
			carry = ans / 10;
		}
		
		if(carry > 0)
			result.add(0, carry);
		
		return result;
	}
	
	public static ArrayList<Integer> sumOfTwoArrays2(int arr1[], int arr2[]){
		
		ArrayList<Integer> result = new ArrayList<>();
		
		int a1Last = arr1.length - 1;
		int a2Last = arr2.length - 1;
		int carry = 0;
		
		while(a1Last >= 0 || a2Last >= 0) {
			
			int sum = carry;
			
			if(a1Last >= 0)
				sum += arr1[a1Last--];
			
			if(a2Last >= 0)
				sum += arr2[a2Last--];
			
			int lastValue = sum % 10;
			
			result.add(0, lastValue);
			
			carry = sum / 10;	
		}
		
		if(carry > 0)
			result.add(0, carry);
		
		return result;
	}

	public static int[] ddlquestion(String str) {
		
		int ans[] = new int[str.length() + 1];
		
		int val = 1;
		
		for(int i = 0; i <= str.length(); i++) {
			
			if(i == str.length() || str.charAt(i) == 'I') {
				
				ans[i] = val++;
				
				for(int j = i - 1; j >= 0 && str.charAt(j) != 'I'; j--) {
					
					ans[j] = val++;
				}
			}
		}
		return ans;
	}
}
