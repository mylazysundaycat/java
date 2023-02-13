package Chapter07_객체지향프로그래밍2;



class Product {
	int price;
	int bonusPoint;
	Product() {}
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product {
	Tv() {}
	public String toString() {
		return "Tv";
	}
}


public class EX7_3 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}