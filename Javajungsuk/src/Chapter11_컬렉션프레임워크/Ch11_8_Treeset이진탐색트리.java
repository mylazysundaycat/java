package Chapter11_�÷��������ӿ�ũ;

import java.util.Set;
import java.util.TreeSet;

public class Ch11_8_Treeset����Ž��Ʈ�� {
	public static void main(String[] args) {
		/*
		 ����Ž��Ʈ��
		 : �θ��� ���ʿ��� �θ��� ������ ���� ���� �ڽĳ�带 �����ʿ��� ū ���� 
		 �ڽĳ�带 �����ϴ� ����Ʈ���̴�.
		 : ���ʳ��->�θ���->�����ʳ��
		 */
		
		Set set = new TreeSet();
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);
		//TreeSet�� �����Ҷ� ������ ���ش�.
		
		
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
		System.out.println(ts.subSet(from, to+ "zzz")); //to�������� ���Եǰ� �ϰ���� ���
		
		TreeSet ts2 = new TreeSet();
		int[] score = {80,95,50,25,15};
		for(int i=0; i<score.length; i++)
			ts2.add(score[i]);
		System.out.println("50���� ������ : "+ts2.headSet(50));
		System.out.println("50���� ū�� : "+ts2.tailSet(50));
	}
}
