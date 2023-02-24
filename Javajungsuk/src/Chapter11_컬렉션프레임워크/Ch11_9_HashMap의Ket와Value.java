package Chapter11_컬렉션프레임워크;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ch11_9_HashMap의Ket와Value {
	public static void main(String[] args) {
		/**
		 HashMap
		 : Key와 Value를 각각 Object 타입으로 저장한다. 즉, (Object, Object)의 형태로 저장하기
		 떄문에 어떠한 객체도 저장할 수있지만 Key는 주로 String으로 사용하곤 한다
		 **/
		/*
		HashMap map = new HashMap();
		map.put("Anybia","1234");
		map.put("Sindra", "1111");
		map.put("Sindra","1234");  //기존값은 사라짐
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요");
			System.out.print("ID:");
			String id = sc.nextLine().trim();
			
			System.out.print("PASSWORD:");
			String password = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 아이디는 존재하지 않습니다. 다시 입력하세요");
				continue;
			}
			if(!(map.get(id)).equals(password)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요");
			} else {
				System.out.println("아이디와 비밀번호가 일치합니다");
				break;
			}
		}
		*/
		
		HashMap LOL = new HashMap();
		
		LOL.put("애니비아",100);
		LOL.put("카르마", 95);
		LOL.put("이즈리얼", 90);
		LOL.put("닐라", 85);
		
		Set set = LOL.entrySet();
		Iterator it =set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름:"+e.getKey()+",점수:"+e.getValue());
		}
		
		set = LOL.keySet();
		System.out.println("참가자명단:"+set);
		
		
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
