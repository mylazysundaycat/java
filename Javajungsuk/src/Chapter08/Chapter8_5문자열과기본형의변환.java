package Chapter08;

public class Chapter8_5���ڿ����⺻���Ǻ�ȯ {
	public static void main(String[] args) {
		//���ڸ� ���ڷ� ��ȯ
		int i1 = 100;
		String s1 = i1 + ""; // ���ڿ�""����
		String s2 = String.valueOf(i1); // valueof() �̿�
		
		//���ڸ� ���ڷ� ��ȯ
		int i2 = Integer.parseInt(s1.trim());
		int i3 = Integer.valueOf(s2.trim()); //trim()�� ���ڿ� �� ���� ������ ��������
		
		String s3 = String.valueOf(15f);
		System.out.println(s3);
		
		
	}
}
