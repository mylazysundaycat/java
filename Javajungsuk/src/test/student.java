package test;

public class student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	String average;
	
	student(){}
	student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		String info = name + "," + ban + "," + no + "," + kor + "," + eng + "," + math;
		return info;
	}
	
	int getTotal() {
		this.total = kor+eng+math;
		return this.total;
	}
	
	float getAverage() {
		this.average = String.format("%.1f", this.total/3f);
		float getAverage = Float.parseFloat(this.average);
		return getAverage;
	}
}
