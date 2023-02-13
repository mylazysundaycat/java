package Chapter08;

public class Chapter8_6StringBuffer {
	public static void main(String[] args) {
		/*
		 String과 달리 StringBuffer는 내용을 변경할 수 있다.
		 append했을때 새로운 객체를 만들어내는게 아니라, 기존 주소값을 가진 객체에 내용을 추가하기 때문이다.
		 */
		
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = sb.append("de"); //append는 자신의 주소값을 반환하므로 sb 주소를 sb2에게도 줌
		
		/*
		 equals()
		 String 클래스에는 오버라이드가 되어있어서 문자열의 내용을 비교하지만
		 StringBuffer 클래스에는 오버라이드가 되어있지 않아서 주솟값을 비교한것과 마찬가지로 되어있다.
		 반면에 StringBuffer 클래스에는 toString()이 String타입으로 오버라이딩 되어있어 이를 사용할 시에
		 문자열을 반환한다.
		 */
		
		String s1 = new String("A");
		String s2 = new String("A");
		System.out.println(s1==s2);  //false, 문자열 자체를 비교하려면 equals()사용할 것
		
		/*
		 StringBuffer = StringBuilder
		 */
		
	}
}
