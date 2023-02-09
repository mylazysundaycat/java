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
			System.out.println("�ܾ��� �����Ͽ� ������ �� �����ϴ�.");
			return;
		}
		
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
		cart[num] = p;
		num++;
		
		System.out.printf("%s�� ������ %d�Դϴ�\n",p.toString() ,p.price);
		System.out.printf("�ܾ��� %d�Դϴ�.\n",money);
		System.out.printf("������ �ݾ��� %d�Դϴ�.\n",bonusPoint);
	}
	
	void getCart() {
		System.out.print("������ ������ ���ǵ��� ");
		for(int i=0; i<num; i++) {
			System.out.print(cart[i]+" ");
		}
		System.out.printf("���� �� %d���Դϴ�.",num);
	}
	
	
}