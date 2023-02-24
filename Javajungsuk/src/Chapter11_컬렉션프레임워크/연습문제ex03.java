package Chapter11_컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class 연습문제ex03 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("Anibia",3,1,100,100,100));
		list.add(new Student("Ez",4,2,90,80,70));
		list.add(new Student("Lu",5,3,70,70,100));
		list.add(new Student("Br",5,4,60,64,20));
		
		Collections.sort(list);
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		
	}
}

class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return (int)((getTotal()/3f)*10+0.5)/10f;
	}
	
	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}
	
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student tmp = (Student)o;
			return name.compareTo(tmp.name);
		}else {
			return -1;
		}
	}
}
