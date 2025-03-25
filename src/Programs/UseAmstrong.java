package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UseAmstrong {
	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int sum = 0;
		while(num>0) {
			int value = num%10;
			sum = sum+(value*value*value);
			num = num/10;
		}
		if(sum==temp) {
			System.out.println("amstrong");
		}
		else {
			System.out.println("not a amstrong");
		}
		
		Integer arr[] = {10,87,65,43,12};
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					int temp1 = arr[i];
//					arr[i] = arr[j];
//					arr[j]=temp1;
//					
//				}
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
//		List<Integer> ar = new ArrayList<Integer>(Arrays.asList(arr));
//		List<Integer> aa = ar.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//		System.out.println(aa);
		
//		String name = "raJkumAr";
//		int count = 0;
//		for(int i=0;i<name.length();i++) {
//			if(name.charAt(i)!=' ') {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		System.out.println("****************");
		
//		String str = "Rajkum@#$&ar098765234567";
//		for(int i=0;i<str.length();i++) {
//			char ch = str.charAt(i);
//			if(Character.isLetter(ch)) {
//				System.out.println("Letters "+ch);
//			}
//			else if(Character.isDigit(ch)) {
//				System.out.println("numbers "+ch);
//			}
//			else {
//				System.out.println("Special char "+ch);
//			}
//		}
		
		
//		long num1 = 1234567890987789812l;
//		long count = 0;
//		while(num1>0) {
//			num1 = num1/10;
//			count++;
//		}
//		System.out.println(count);
		
		
		int[] arr1= {10,20,30,-87,-76,-54,0,0,-76,43,98,0,-32};
		float count = 0f;
		float count2 = 0f;
		float count3 = 0f;
		int count9 = 0;
		for(int j=0;j<arr1.length;j++) {
			count9++;
			if(arr1[j]>0) {
				count++;
			}
			else if(arr1[j]<0) {
				count2++;
			}
			else {
				count3++;
			}
		}
		System.out.println(count/arr1.length);
		System.out.println(count2/count9);
		System.out.println(count3/count9);
		
				
				
				
			
		}
	}


