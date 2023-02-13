package Chapter08;

public class Chapter8_2equals�������̵� {
	public static void main(String[] args) {
		
		// equal�� �ּҰ� �ƴ� ��ü�� ����� ������ ���ϵ��� ����, �������̵�
		
		testPerson tp1 = new testPerson(10);
		testPerson tp2 = new testPerson(10);
		
		System.out.println(tp1.equals(tp2));
		
		String name = tp1.getClass().getName();
		System.out.println(name);
	}

}

class testPerson {
	int age;
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof testPerson) {
			return age == ((testPerson)obj).age;
		}
		return false;
	}
	
	testPerson(int age) {this.age = age;}
}



