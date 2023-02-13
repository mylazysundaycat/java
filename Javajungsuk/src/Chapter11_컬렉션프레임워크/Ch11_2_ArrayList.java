package Chapter11_컬렉션프레임워크;

import java.util.ArrayList;

public class Ch11_2_ArrayList {
	public static void main(String[] args) {
		/*
		 ArrayList
		 : List 인터페이스를 구현하기 때문에 데이터의 저장 순서가 유지되고, 중복을 허용한다.
		 Vector의 구현원리와 기능적인 측면에서 동일하나 ArrayList는 더 개선되어 출시되었음.
		 */
		
		
		ArrayList list1 =new ArrayList(10);
		
		//size()
		System.out.println(list1.size()); // 저장된 객체의 개수를 반환, 아무것도 없으니 '0'반환
		
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
