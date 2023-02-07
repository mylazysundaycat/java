package test;

public class time {
	int hour;
	int minute;
	float second;
	
	public void setHour(int h) {
		if (0<h || h>23) {
			hour = h;
		}
	}
	
	public void showTime() {
		System.out.printf("%d:%d:%f",hour,minute,second);
	}
}

