package Chapter12_���׸���;

import java.util.ArrayList;
import java.util.Iterator;

public class Ch12_02_Iterator {
	public static void main(String[] args) {
		ArrayList<Student> sl = new ArrayList<Student>();
		sl.add(new Student("����", 1, 1));
		sl.add(new Student("�ƺ�", 2, 2));
		sl.add(new Student("��", 3, 3));
		
		Iterator<Student> it = sl.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.name);
		}
		
	}
}

class Student {
	String name = "";
	int ban;
	int no;
	
	Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
	}
}
