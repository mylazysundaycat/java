package Chapter11_�÷��������ӿ�ũ;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ch11_9_HashMap��Ket��Value {
	public static void main(String[] args) {
		/**
		 HashMap
		 : Key�� Value�� ���� Object Ÿ������ �����Ѵ�. ��, (Object, Object)�� ���·� �����ϱ�
		 ������ ��� ��ü�� ������ �������� Key�� �ַ� String���� ����ϰ� �Ѵ�
		 **/
		/*
		HashMap map = new HashMap();
		map.put("Anybia","1234");
		map.put("Sindra", "1111");
		map.put("Sindra","1234");  //�������� �����
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id�� password�� �Է����ּ���");
			System.out.print("ID:");
			String id = sc.nextLine().trim();
			
			System.out.print("PASSWORD:");
			String password = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� ���̵�� �������� �ʽ��ϴ�. �ٽ� �Է��ϼ���");
				continue;
			}
			if(!(map.get(id)).equals(password)) {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���");
			} else {
				System.out.println("���̵�� ��й�ȣ�� ��ġ�մϴ�");
				break;
			}
		}
		*/
		
		HashMap LOL = new HashMap();
		
		LOL.put("�ִϺ��",100);
		LOL.put("ī����", 95);
		LOL.put("�����", 90);
		LOL.put("�Ҷ�", 85);
		
		Set set = LOL.entrySet();
		Iterator it =set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸�:"+e.getKey()+",����:"+e.getValue());
		}
		
		set = LOL.keySet();
		System.out.println("�����ڸ��:"+set);
		
		
		Collection values = LOL.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			int i = (int)it.next();
			total += i;
		}
		
		System.out.println("TOTAL:"+total);

 	}
}
