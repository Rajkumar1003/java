package Programs;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;

public class UsePalindrome {
	public static void main(String[] args) {
//		String name = "madam";
//		String temp = "";
//		for(int i=name.length()-1;i>=0;i--) { 
//			temp = temp+name.charAt(i);
//		}
//		if(name.equals(temp)) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not a palindrome");
//		}
		String name = " ";
		String[] arr = name.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		for(int i=100;i<=200;i++) {
			if(a+c==b) {
				System.out.println(i);
			}
		
//		int a = 50;
//		int b = 50;
//		if(a+b==100)
//			System.out.println("equals");
//		else
//			System.out.println("not equals");
			
		
//		Integer arr[] = {24,76,54,98};
//		List<Integer> ar = new ArrayList<Integer>(Arrays.asList(arr));
//		List<Integer> sh = ar.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).collect(Collectors.toList());
//		System.out.println("The Second Largerst Number is="+sh);
			
		}
	}
}


