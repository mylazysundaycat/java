package test;

abstract class Champion {
	int x, y; // ������ġ
	abstract void move (int x, int y); // ��ӹ��� Ŭ�����鸶�� �����ΰ� �ٸ�
	void stop() { System.out.println("stop");}
}

class Anivia extends Champion {
	//int x, y;
	void move(int x, int y) {
		System.out.println("������ ���ƴٳ��");
		System.out.printf("�� ��ġ�� %d,%d\n",x,y);
	}
	//void stop() {}
	void Crystallize() {
		System.out.println("�� �����");
	}
}

class Teemo extends Champion {
	//int x, y;
	void move(int x, int y) {
		System.out.println("���� Ƣ��ٳ��");
		System.out.printf("�� ��ġ�� %d,%d\n",x,y);
	}
	//void stop() {}
	void BlindingDart() {
		System.out.println("�Ǹ� ����");
	}
}

class Ezreal extends Champion {
	//int x, y;
	void move(int x, int y) {
		System.out.println("�ɾ�ٳ��");
		System.out.printf("�� ��ġ�� %d,%d\n",x,y);
	}
	//void stop() {}
	void MysticShot() {
		System.out.println("���Ⱘ�� �Ұ� ��Ʋ�Ÿ��� Q��ų");
	}
}