package Chapter08;

public class Chapter8_6StringBuffer {
	public static void main(String[] args) {
		/*
		 String�� �޸� StringBuffer�� ������ ������ �� �ִ�.
		 append������ ���ο� ��ü�� �����°� �ƴ϶�, ���� �ּҰ��� ���� ��ü�� ������ �߰��ϱ� �����̴�.
		 */
		
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = sb.append("de"); //append�� �ڽ��� �ּҰ��� ��ȯ�ϹǷ� sb �ּҸ� sb2���Ե� ��
		
		/*
		 equals()
		 String Ŭ�������� �������̵尡 �Ǿ��־ ���ڿ��� ������ ��������
		 StringBuffer Ŭ�������� �������̵尡 �Ǿ����� �ʾƼ� �ּڰ��� ���ѰͰ� ���������� �Ǿ��ִ�.
		 �ݸ鿡 StringBuffer Ŭ�������� toString()�� StringŸ������ �������̵� �Ǿ��־� �̸� ����� �ÿ�
		 ���ڿ��� ��ȯ�Ѵ�.
		 */
		
		String s1 = new String("A");
		String s2 = new String("A");
		System.out.println(s1==s2);  //false, ���ڿ� ��ü�� ���Ϸ��� equals()����� ��
		
		/*
		 StringBuffer = StringBuilder
		 */
		
	}
}
