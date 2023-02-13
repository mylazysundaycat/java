package Chapter11_�÷��������ӿ�ũ;

import java.util.HashSet;
import java.util.Objects;

public class Ch11_7_HashSet���� {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		/*
		 HashSet�� add�޼���� ���ο� ��Ҹ� �߰��ϱ� ���� ������ ����� ��ҿ� ���� ������
		 �Ǻ��ϱ� ���� �߰��Ϸ��� ����� equals()�� hashCode()�� ȣ���ϱ� ������
		 ��ó�� equals�Ӹ� �ƴ϶� hashCode�� ������ �°� �������̵� �ؾߵȴ�.
		 */
		
		System.out.println(set);
	}
}

class Person {
	String name;
	int age;
	
	Person () {}
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {return name+":"+age;}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		Person p = (Person)obj;
		return name.equals(p.name)&&age==p.age; 
	}
	
	public int hashCode() {
		return Objects.hash(name, age);
	}
}