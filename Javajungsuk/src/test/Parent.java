package test;

public class Parent {
	String x = "�θ��� ����";
	String test = "Super";
}

class Child extends Parent {
	String x = "�ڽ��� ����";
	String test = "This";
	
	void method() {
		System.out.println("super:"+super.test);
		System.out.println("this:"+this.test);
	}
	
}

final class FinalParent { // ������ �� �� ���� Ŭ����
	final int MAX_SIZE = 10; // ���� ������ �� ���� �������(���)
}
