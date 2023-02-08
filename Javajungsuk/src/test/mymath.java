package test;

public class mymath {
		static double getDistance(int x, int y, int x1, int y1) {
			double step = ((x-x1)*(x-x1)+(y-y1)*(y-y1));
			double distance = Math.sqrt(step);
			return distance;
			}
		
		
		
}
