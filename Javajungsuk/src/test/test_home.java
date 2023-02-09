package test;

public class test_home {

	public static void main(String[] args) {
		/*
		time t = new time();
		t.hour = 24;
		t.minute = 15;
		t.second = 4.2f;
		
		t.showTime();
		
		mymath m = new mymath();
		double result = m.add(5L, 3L);
		System.out.println("\n" + result);
		
		car c1 = new car();
		car c2 = new car();
		*/
		
		/*
		student s = new student("È«±æµ¿",1,1,100,60,76);
		String str = s.info();
		
		System.out.println("ÀÌ¸§:"+s.name);
		System.out.println("ÃÑÁ¡:"+s.getTotal());
		System.out.println("Æò±Õ:"+s.getAverage());
		
		System.out.println(mymath.getDistance(1, 1, 2, 2));
		
		
		myPoint p = new myPoint(1, 1);
		System.out.println(p.getDistanc(2, 2));
		
		Parent pa = new Parent();
		Child c = new Child();
		System.out.println(pa.x);
		System.out.println(c.x);
		
		c.method();
		*/
		
		/*
		time t = new time();
		t.setHour(24);
		System.out.println(t.getHour());
		*/
		
		/*
		Tv t1 = new Tv();
		Smartphone s1 = new Smartphone();
		Headphone h1 = new Headphone();
		
		Buyer b1 = new Buyer();
		b1.Buy(t1);
		b1.Buy(s1);
		b1.Buy(h1);
		b1.getCart();
		*/
		
		/*
		Anivia a = new Anivia();
		a.move(40, 200);
		
		Teemo t = new Teemo();
		t.move(22, 77);
		t.BlindingDart();
		*/
		
		Champion[] c = new Champion[3];
		c[0] = new Anivia();
		c[1] = new Ezreal();
		c[2] = new Teemo();
		
		for(int i=0; i<c.length; i++) {
			c[i].move(270, 156);
		}
		
		Child child = new Child();
		child.method1();
		child.method2();
		
	}


}
