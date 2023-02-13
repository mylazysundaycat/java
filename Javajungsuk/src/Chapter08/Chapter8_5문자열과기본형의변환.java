package Chapter08;

public class Chapter8_5문자열과기본형의변환 {
	public static void main(String[] args) {
		//숫자를 문자로 변환
		int i1 = 100;
		String s1 = i1 + ""; // 빈문자열""결합
		String s2 = String.valueOf(i1); // valueof() 이용
		
		//문자를 숫자로 변환
		int i2 = Integer.parseInt(s1.trim());
		int i3 = Integer.valueOf(s2.trim()); //trim()은 문자열 양 끝의 공백을 제거해줌
		
		String s3 = String.valueOf(15f);
		System.out.println(s3);
		
		
	}
}
