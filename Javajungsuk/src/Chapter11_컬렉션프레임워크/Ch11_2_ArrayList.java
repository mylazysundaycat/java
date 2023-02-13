package Chapter11_�÷��������ӿ�ũ;

import java.util.ArrayList;

public class Ch11_2_ArrayList {
	public static void main(String[] args) {
		/*
		 ArrayList
		 : List �������̽��� �����ϱ� ������ �������� ���� ������ �����ǰ�, �ߺ��� ����Ѵ�.
		 Vector�� ���������� ������� ���鿡�� �����ϳ� ArrayList�� �� �����Ǿ� ��õǾ���.
		 */
		
		
		ArrayList list1 =new ArrayList(10);
		
		//size()
		System.out.println(list1.size()); // ����� ��ü�� ������ ��ȯ, �ƹ��͵� ������ '0'��ȯ
		
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(3));
		list1.add(new Integer(2));
		list1.add(new Integer(1));
		
		ArrayList list2 = new ArrayList(list1.subList(0, 3));
		System.out.println(list1);
		System.out.println(list2);

		
		list1.add("B");
		list1.add("Legend never Die");
		System.out.println(list1);
		
		for(int i=0; i<list2.size(); i++) {
			if(list1.contains(list2.get(i))) {
				list1.remove(list2.get(i));
			}
		}
		
		System.out.println(list1);
		
	}
}
