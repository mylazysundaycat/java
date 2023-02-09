package test;

public class Parent {
	String x = "부모의 인자";
	String test = "Super";
}

interface MyInterface {
	default void method1() {
		System.out.println("method1 in MyInterface");
	}
	void method2();
}

class Child extends Parent implements MyInterface {
	
	String x = "자식의 인자";
	String test = "This";
	
	void method() {
		System.out.println("super:"+super.test);
		System.out.println("this:"+this.test);
	}
	
	public void method2() {
		System.out.println("MyInterface에 있는 method2를 Child에서 재구성");
	}
	
}

final class FinalParent { // 조상이 될 수 없는 클래스
	final int MAX_SIZE = 10; // 값을 변경할 수 없는 멤버변수(상수)
}
