package test;


public class Product {
	protected int price;
	protected int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}



class Tv extends Product {
	Tv() {super(10000);}
	@Override
	public String toString() {
		return "Tv";
	}
}



class Smartphone extends Product {
	Smartphone() {super(3000);}
	@Override
	public String toString() {
		return "Smartphone";
	}
}

class Headphone extends Product {
	Headphone() {super(1500);}
	@Override
	public String toString() {
		return "Headphone";
	}
}



class Buyer {
	private int money = 50000;
	private int bonusPoint = 0;
	private int num = 0;
	Product[] cart = new Product[10];
	
	void Buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 구매할 수 없습니다.");
			return;
		}
		
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
		cart[num] = p;
		num++;
		
		System.out.printf("%s의 가격은 %d입니다\n",p.toString() ,p.price);
		System.out.printf("잔액은 %d입니다.\n",money);
		System.out.printf("적립된 금액은 %d입니다.\n",bonusPoint);
	}
	
	void getCart() {
		System.out.print("고객님이 구매한 물건들은 ");
		for(int i=0; i<num; i++) {
			System.out.print(cart[i]+" ");
		}
		System.out.printf("으로 총 %d개입니다.",num);
	}
	
	
}