package test;

public class car {
	
	static {System.out.println("Ŭ���� �ʱ�ȭ ��");}
	{System.out.println("�ν��Ͻ� �ʱ�ȭ ��");}
	
	String color;
	String geartype;
	int price;
	
		car(){
			this("white", "auto", 4000000); // this�� ������ car(String c, String g, int p) ȣ��
		}
		
		car(String c, String g, int p) {
			this.color = c; // �ν��Ͻ� ������ ����Ű�� this ����ü
			this.geartype = g;
			this.price = p;
		}

}
