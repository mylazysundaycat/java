package Chapter08;

public class Chapter8_3StringŬ���� {
	public static void main(String[] args) {
		
		/*
		 Ű���� final
		 : '������ �� ����' �̶�� �ǹ�
		 ����: ����� ��
		 �޼���: override�� ���ѵ�
		 Ŭ����: ��� �Ұ����� Ŭ������ ��
		 */
		
		String str1 = "abc";
		String str2 = "abc";
		//���� ���ڿ� ���ͷ��� ������
		//str1�� str2�� �ּҵ� ����(==) ���ڿ� ���뵵 ���� 
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		//str3�� str4�� �ּҴ� �ٸ����� ���ڿ� ������ ����.
		
		
}
}
