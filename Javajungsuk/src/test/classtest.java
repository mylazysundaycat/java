package test;

public class classtest {

	class InnerClass1 {
		int iv = 100;
		//static int iv = 100; ����! �̳�Ŭ������ ����ƽ ������ ������ �� ����.
		final static int CONST = 100; // final static�� ����̹Ƿ� ���
	}
	
	class InnerClass2 {
		int iv = 200;
		static int cv = 200; // ���� Ŭ���� �߿��� ����ƽ Ŭ������ ����ƽ ����� ���� �� �ִ�.
	}
	
	static class InnerClass3 {}
	
	
	
	void MyMethod1() {
		class LocalInnerClass {
			int iv = 300;
			final static int CV = 300;
		}
	}
	
	static void MyMethod2() {
		//InnerClass1 iv1 = new InnerClass1(); static �޼ҵ忡�� �ν��Ͻ������ �����Ҽ� ����.
		InnerClass3 iv3 = new InnerClass3();
	}
	
	
	
}
