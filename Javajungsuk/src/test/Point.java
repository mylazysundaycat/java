package test;

public class Point {
	int x;
	int y;
	String getLocation() {
		return "x:"+x+" y:"+y;
	}
}

class Point3D extends Point { // 상속
	int z;
	String getLocation() { // 클래스 오버라이딩
		return "x:"+x+" y:"+y+" z:"+z;
	}
}
