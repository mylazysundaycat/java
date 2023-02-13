package Chapter11_�÷��������ӿ�ũ;

import java.util.Arrays;
import java.util.Comparator;

public class Ch11_6_Comparator��Comparable {
	public static void main(String[] args) {
		String[] strArr = {"cat","Dog","lion","tiger"};
		
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(strArr));
		
		
		//��������
		/*
		 Collection�� �⺻������ Object�� ����� Ŭ������ ���ؼ�
		 ��밡���� �������̽� �̹Ƿ� ObjectŸ�Կ� �迭�� sort�� Comparator.reverseOrder()��
		 ��� �����ϰ�
		 �⺻Ÿ���� int, double, char, float ���� ����� �Ұ��ϹǷ�
		 Wrapper Ŭ������ �ڽ����־�� �������ĵ� �����ϴ�
		 */
		Arrays.sort(strArr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(strArr));
	}
}
