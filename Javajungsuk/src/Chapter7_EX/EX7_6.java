package Chapter7_EX;


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
