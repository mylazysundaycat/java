package Chapter08;

public class Chapter8_8Wrapper클래스 {
	public static void main(String[] args) {
		/*
		 객체지향개념에서 모든 것은 객체로 다뤄져야 하지만, 자바에선 8개의 기본형을 객체로
		 다루지 않아 이것이 자바가 완전한 객체지향언어가 아니라는 얘기를 듣는 이유이다.
		 따라서 기본형도 어쩔 수 없이 객체로 다뤄야 할때 래퍼클래스를 사용한다.
		 
		 boolean Boolean
		 char Character
		 byte Byte
		 short Short
		 int Integer
		 long Long
		 float Float
		 double Double
		 */
		
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i==i2);
		System.out.println(i.equals(i2)); //equals가 오버라이딩 되어있어 객체값 자체를 비교함
		
		
		/*
		 오토박싱: 기본형 값을 래퍼클래스의 객체로 자동변환 해주는것을 오토박싱이라고 한다.
		 언박싱: 래퍼클래스의 객체를 기본형 값으로 자동변환 해주는 것을 언박싱이라고 한다.
		 */
	}
}
