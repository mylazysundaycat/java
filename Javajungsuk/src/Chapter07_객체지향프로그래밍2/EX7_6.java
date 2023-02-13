package Chapter07_객체지향프로그래밍2;


public class EX7_6 {
	public static void main(String[] args) {
		Outer ot = new Outer();
		Outer.Inner in = ot.new Inner();
	}
}

class Outer {
	class Inner {
		int iv = 100;
	}
}
