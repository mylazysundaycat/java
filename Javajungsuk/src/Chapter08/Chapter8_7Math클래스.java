package Chapter08;

public class Chapter8_7Math클래스 {
	public static void main(String[] args) {
		// 소수점 n번째 자리에서 반올림한 값을 얻는 법
		// 10의 n제곱으로 곱한 후, round()를 쓰고, 다시 10의 n제곱으로 나눠준다.
		
		float testNum = 1039.789291f;
		float resultNum = (Math.round(testNum*100f))/100f;
		System.out.println(resultNum);
		
	}
}
