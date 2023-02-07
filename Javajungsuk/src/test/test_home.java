package test;

public class test_home {

	public static void main(String[] args) {
		time t = new time();
		t.hour = 24;
		t.minute = 15;
		t.second = 4.2f;
		
		t.showTime();
		
		mymath m = new mymath();
		double result = m.add(5L, 3L);
		System.out.println("\n" + result);

	}

}
