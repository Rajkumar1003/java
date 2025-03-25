package Programs;

public class UsePrime {
	public static void main(String[] args) {
//		int num = 11;
//		boolean a = true;
//		for(int i=2;i<num;i++) {
//			
//			if(num%i==0) {
//				a = false;
//			}
//		}
//		if(a==true) {
//			System.out.println("prime");
//			
//		}
//		else {
//			System.out.println("not a prime");
//		}
		
		int num = 11;
		for(int i=2;i<=num;i++) {
			boolean a = true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					a = false;
				}
			}
			if(a==true) {
				System.out.println(i+" prime");
			}
			else {
				System.out.println(i+" not a prime");
			}
		}
	}

}
