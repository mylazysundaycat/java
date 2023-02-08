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
