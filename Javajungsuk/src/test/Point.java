package test;

public class Point {
	int x;
	int y;
	String getLocation() {
		return "x:"+x+" y:"+y;
	}
}

class Point3D extends Point { // ���
	int z;
	String getLocation() { // Ŭ���� �������̵�
		return "x:"+x+" y:"+y+" z:"+z;
	}
}
