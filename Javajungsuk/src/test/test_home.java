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
		
		student s = new student("ȫ�浿",1,1,100,60,76);
		String str = s.info();
		
		System.out.println("�̸�:"+s.name);
		System.out.println("����:"+s.getTotal());
		System.out.println("���:"+s.getAverage());
		
		System.out.println(mymath.getDistance(1, 1, 2, 2));
		
		
		myPoint p = new myPoint(1, 1);
		System.out.println(p.getDistanc(2, 2));
		
		Parent pa = new Parent();
		Child c = new Child();
		System.out.println(pa.x);
		System.out.println(c.x);
		
		c.method();

	}


}