package Chapter11_컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Iterator;

public class Ch11_4_Iterator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("n");
		list.add("e");
		list.add("w");
		list.add("world");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
