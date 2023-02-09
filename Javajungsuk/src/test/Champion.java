package test;

abstract class Champion {
	int x, y; // 현재위치
	abstract void move (int x, int y); // 상속받을 클래스들마다 구현부가 다름
	void stop() { System.out.println("stop");}
}

class Anivia extends Champion {
	//int x, y;
	void move(int x, int y) {
		System.out.println("날개로 날아다녀요");
		System.out.printf("현 위치는 %d,%d\n",x,y);
	}
	//void stop() {}
	void Crystallize() {
		System.out.println("벽 세우기");
	}
}

class Teemo extends Champion {
	//int x, y;
	void move(int x, int y) {
		System.out.println("통통 튀어다녀요");
		System.out.printf("현 위치는 %d,%d\n",x,y);
	}
	//void stop() {}
	void BlindingDart() {
		System.out.println("실명 공격");
	}
}

class Ezreal extends Champion {
	//int x, y;
	void move(int x, int y) {
		System.out.println("걸어다녀요");
		System.out.printf("현 위치는 %d,%d\n",x,y);
	}
	//void stop() {}
	void MysticShot() {
		System.out.println("방향감을 잃고 비틀거리는 Q스킬");
	}
}