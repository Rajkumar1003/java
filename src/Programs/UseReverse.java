package Programs;

public class UseReverse {
	public static void main(String[] args) {
		String name = "rajkumar";
		String temp = "";
		for(int i=name.length()-1;i>=0;i--) {
			temp = temp+name.charAt(i);
		}
		System.out.println(temp);
	}

}
