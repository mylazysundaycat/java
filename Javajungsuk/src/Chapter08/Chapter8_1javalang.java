package Chapter08;

public class Chapter8_1javalang {
	public static void main(String[] args) {
		testClass tc1 = new testClass();
		testClass tc2 = new testClass();
		
		
		System.out.println(tc1.equals(tc2)); //equals메서드는 주소값으로 비교한다.
		System.out.println(tc1==tc2);
		
		/*
		 equals()
		 Object 클래스로부터 상속받은 equals 메서드는 두 개의 참조변수가 같은 객체를 참조하고 있는지를
		 판단하는 기능밖에는 할 수없다.
		 */
		
	}
}



class testClass extends Object{
	testClass(){}
}
