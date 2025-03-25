package Programs;

public class UseNumberPalindrome {
	public static void main(String[] args) {
		int num = 414;
		int temp = num;
		int sum = 0;
		while(num>0) {
			int value = num%10;
			sum = (sum*10)+value;
			num = num/10;
		}
		if(sum==temp) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
