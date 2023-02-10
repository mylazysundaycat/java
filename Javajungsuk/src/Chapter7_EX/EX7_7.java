package Chapter7_EX;

public class EX7_7 {
	public static void main(String[] args) {
		Outer2 ot2 = new Outer2();
		Outer2.Inner in2 = ot2.new Inner();
		System.out.println(in2.iv);
	}
}

class Outer2 {
	class Inner {
		int iv = 200;
	}
}