package Chapter01;

public class Chapter3_������ {

	public static void main(String[] args) {
		
		/*
	     ����ȯ
		 : ���� �ٸ� Ÿ�԰��� �����̳� ������ �� �� ���� ����ȯ���� Ÿ���� ��ġ���Ѿ� �Ѵ�.
		 : ǥ�������� ���� Ÿ�Կ��� ���� Ÿ������ ���Ҷ� ���� �ս��� �����Ƿ�
		 ĳ���� ǥ���� ���� �ʾƵ�, ���� �ս��� ���� �ڵ�����ȯ�� ���� Ÿ������
		 �̷���
		 byte->short->int->long->float->double
		 
		 �����ȯ�� ��Ģ
		 1) �� �ǿ������� Ÿ���� ���� ��ġ��Ų�� (���� ū Ÿ������ ��ġ)
		 2) �ǿ������� Ÿ���� int���� ������ int�� ��ȯ��Ų��
		 : CPU�� �����͸� ó���ϴ� ������ 4byte�̱� ������ int���� ����
		 Ÿ���� ������ ����ɶ� ���� ������ �߻��Ͽ� ����÷ο� Ȥ�� �����÷ο찡
		 �߻��� �� �ֱ� �����̴�.
		 
		 �񱳿�����(==)
		 �� �ǿ������� ���� ������ �Ǵ� �ٸ����� ���ϴ� �������̴�.
		 ���ϰ����δ� true �� false���� �����ش�.
		 
		 ���ڿ��� �񱳿�����(equals())
		 �� ���ڿ��� ���Ҷ� '=='��ſ� �޼ҵ� equals()�� �̿��ؾ��Ѵ�.
		 
		 ���Կ�����(=)
		 ���п����� ���� ��� ǥ��������, �ڹٿ����� ������ ���ͷ� ����
		 ���� ������ �����Ҷ� ����Ѵ�.
		 */	
		
		String a1 = "abc";
		
		System.out.println(a1.equals("abcd"));
		System.out.println(a1.equals("abc"));
		
		/*
		 ��������
		 ||(or) �ǿ����� ���ʸ� true���� ������� true�� �޴´�.
		 &&(and) �ǿ����� ��ΰ� true���� ������� true�� �޴´�.
		 */
		
		/*
		 ���ǿ����� 
		 ���ǽ�? ��1 : ��2
		 ���Ͻÿ� ��1�� ��ȯ, �����Ͻÿ� ��2�� ��ȯ��
		 */
		
		
		//���� Ǯ���
		int x =2;
		int y =5;
		char c = 'A';
		
		System.out.println(y += 10 - x++);
		System.out.println('C'-c);
		
		int num = 456;
		System.out.println(num-num%100);
		
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples%sizeOfBucket == 0) ? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket+1;
		System.out.println(numOfBucket);
		
		int num2 = 10; 
		System.out.println((num2 > 0) ? "����Դϴ�" : ((num2 == 0) ? "0�Դϴ�" : "�����Դϴ�"));
			}

}
