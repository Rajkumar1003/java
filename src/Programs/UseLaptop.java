package Programs;

public class UseLaptop {
	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
		l1.brand = "Lenevo";
		l1.price = 50000;
		l1.discountPercentage = 75;
		l1.color = "blue";
		l1.isTouch = true;
		
		Laptop l2 = new Laptop();
		l2.brand = "Redmi";
		l2.price = 45000;
		l2.discountPercentage = 80;
		l2.color = "white";
		l2.isTouch = false;
		
		int netPrice = l1.price+(l1.price*l1.discountPercentage/100);
		System.out.println(l1.brand+" "+l1.price+" "+l1.discountPercentage+" "+l1.color+" "+l1.isTouch+" "+netPrice);
		
	}

}
class Laptop {
	String brand;
	int price;
	int discountPercentage;
	String color;
	boolean isTouch;
}