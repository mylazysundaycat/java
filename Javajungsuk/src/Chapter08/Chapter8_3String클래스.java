package Chapter08;

public class Chapter8_3String클래스 {
	public static void main(String[] args) {
		
		/*
		 키워드 final
		 : '수정할 수 없는' 이라는 의미
		 변수: 상수가 됨
		 메서드: override가 제한됨
		 클래스: 상속 불가능한 클래스가 됨
		 */
		
		String str1 = "abc";
		String str2 = "abc";
		//같은 문자열 리터럴을 재사용함
		//str1과 str2의 주소도 같고(==) 문자열 내용도 같음 
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		//str3과 str4은 주소는 다르지만 문자열 내용은 같다.
		
		
}
}
