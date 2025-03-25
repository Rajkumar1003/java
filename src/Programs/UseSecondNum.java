package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UseSecondNum {
	public static void main(String[] args) {
//		Integer arr[] = {10,89,67,54};
//		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(arr));
//		List<Integer> ar = a.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).collect(Collectors.toList());
//		System.out.println(ar);
		
		int arr[] = {145,78,98,65};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
//		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[arr.length-2]);
//		}
	}

}
