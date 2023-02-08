package test;

public class myPoint {
	int x;
	int y;
	
	myPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistanc(int a, int b) {
		double Distance = (double)Math.sqrt((this.x-a)*(this.x-a)+(this.y-b)*(this.y-b));
		return Distance;
	}
}
