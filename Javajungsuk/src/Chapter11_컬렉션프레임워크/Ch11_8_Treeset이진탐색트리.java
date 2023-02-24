package Chapter11_컬렉션프레임워크;

import java.util.Set;
import java.util.TreeSet;

public class Ch11_8_Treeset이진탐색트리 {
	public static void main(String[] args) {
		/*
		 이진탐색트리
		 : 부모노드 왼쪽에는 부모노드 값보다 작은 값의 자식노드를 오른쪽에는 큰 값의 
		 자식노드를 저장하는 이진트리이다.
		 : 왼쪽노드->부모노드->오른쪽노드
		 */
		
		Set set = new TreeSet();
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);
		//TreeSet은 저장할때 정렬을 해준다.
		
		
		TreeSet ts = new TreeSet();
		String from = "b";
		String to = "d";
		
		ts.add("abc");
		ts.add("beautiful");
		ts.add("car");
		ts.add("dance");
		ts.add("flower");
		ts.add("gun");
		ts.add("higher");
		
		System.out.println(ts);
		System.out.println(ts.subSet(from, to));
		System.out.println(ts.subSet(from, to+ "zzz")); //to범위까지 포함되게 하고싶은 경우
		
		TreeSet ts2 = new TreeSet();
		int[] score = {80,95,50,25,15};
		for(int i=0; i<score.length; i++)
			ts2.add(score[i]);
		System.out.println("50보다 작은값 : "+ts2.headSet(50));
		System.out.println("50보다 큰값 : "+ts2.tailSet(50));
	}
}
