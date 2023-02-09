package test;

public class time {
	private int hour;
	private int minute;
	private float second;
	
	public int getHour() {return this.hour;}
	public void setHour(int h) {
		if (0<h && h<23) {
			this.hour = h;
		}
		return;
	}
	
}

