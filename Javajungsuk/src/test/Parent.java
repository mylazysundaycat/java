package test;

public class Parent {
	String x = "�θ��� ����";
	String test = "Super";
}

interface MyInterface {
	default void method1() {
		System.out.println("method1 in MyInterface");
	}
	void method2();
}

class Child extends Parent implements MyInterface {
	
	String x = "�ڽ��� ����";
	String test = "This";
	
	void method() {
		System.out.println("super:"+super.test);
		System.out.println("this:"+this.test);
	}
	
	public void method2() {
		System.out.println("MyInterface�� �ִ� method2�� Child���� �籸��");
	}
	
}

final class FinalParent { // ������ �� �� ���� Ŭ����
	final int MAX_SIZE = 10; // ���� ������ �� ���� �������(���)
}
