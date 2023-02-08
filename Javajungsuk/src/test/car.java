package test;

public class car {
	
	static {System.out.println("클래스 초기화 블럭");}
	{System.out.println("인스턴스 초기화 블럭");}
	
	String color;
	String geartype;
	int price;
	
		car(){
			this("white", "auto", 4000000); // this로 생성자 car(String c, String g, int p) 호출
		}
		
		car(String c, String g, int p) {
			this.color = c; // 인스턴스 변수를 가리키는 this 그자체
			this.geartype = g;
			this.price = p;
		}

}
