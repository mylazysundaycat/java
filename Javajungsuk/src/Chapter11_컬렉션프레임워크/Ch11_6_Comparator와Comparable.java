package Chapter11_컬렉션프레임워크;

import java.util.Arrays;
import java.util.Comparator;

public class Ch11_6_Comparator와Comparable {
	public static void main(String[] args) {
		String[] strArr = {"cat","Dog","lion","tiger"};
		
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(strArr));
		
		
		//내림차순
		/*
		 Collection은 기본적으로 Object를 상속한 클래스에 대해서
		 사용가능한 인터페이스 이므로 Object타입에 배열은 sort에 Comparator.reverseOrder()가
		 사용 가능하고
		 기본타입인 int, double, char, float 등은 사용이 불가하므로
		 Wrapper 클래스로 박싱해주어야 역순정렬도 가능하다
		 */
		Arrays.sort(strArr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(strArr));
	}
}
