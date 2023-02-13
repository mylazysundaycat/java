package Chapter07_객체지향프로그래밍2;

public class EX7_8 {
	public static void main(String[] args) {
		Outer3 ot3 = new Outer3();
		Outer3.Inner inner = ot3.new Inner();
		
		inner.method1();
	}
}


class Outer3 {
	int value = 10;
	
	class Inner {
		int value = 20;
		void method1() {
			
			int value = 30;
			
			Outer3 ot3 = new Outer3();
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(ot3.value);
			
		}
	}
}