package test;

public class classtest {

	class InnerClass1 {
		int iv = 100;
		//static int iv = 100; 에러! 이너클래스엔 스태틱 변수를 선언할 수 없다.
		final static int CONST = 100; // final static은 상수이므로 허용
	}
	
	class InnerClass2 {
		int iv = 200;
		static int cv = 200; // 내부 클래스 중에서 스태틱 클래스만 스태틱 멤버를 가질 수 있다.
	}
	
	static class InnerClass3 {}
	
	
	
	void MyMethod1() {
		class LocalInnerClass {
			int iv = 300;
			final static int CV = 300;
		}
	}
	
	static void MyMethod2() {
		//InnerClass1 iv1 = new InnerClass1(); static 메소드에서 인스턴스멤버에 접근할수 없다.
		InnerClass3 iv3 = new InnerClass3();
	}
	
	
	
}
