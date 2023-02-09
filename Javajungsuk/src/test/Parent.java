package test;

public class Parent {
	String x = "부모의 인자";
	String test = "Super";
}

class Child extends Parent {
	String x = "자식의 인자";
	String test = "This";
	
	void method() {
		System.out.println("super:"+super.test);
		System.out.println("this:"+this.test);
	}
	
}

final class FinalParent { // 조상이 될 수 없는 클래스
	final int MAX_SIZE = 10; // 값을 변경할 수 없는 멤버변수(상수)
}
