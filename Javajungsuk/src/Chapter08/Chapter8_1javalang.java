package Chapter08;

public class Chapter8_1javalang {
	public static void main(String[] args) {
		testClass tc1 = new testClass();
		testClass tc2 = new testClass();
		
		
		System.out.println(tc1.equals(tc2)); //equals�޼���� �ּҰ����� ���Ѵ�.
		System.out.println(tc1==tc2);
		
		/*
		 equals()
		 Object Ŭ�����κ��� ��ӹ��� equals �޼���� �� ���� ���������� ���� ��ü�� �����ϰ� �ִ�����
		 �Ǵ��ϴ� ��ɹۿ��� �� ������.
		 */
		
	}
}



class testClass extends Object{
	testClass(){}
}
