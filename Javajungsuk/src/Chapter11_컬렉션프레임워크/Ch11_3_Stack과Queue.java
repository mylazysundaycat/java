package Chapter11_컬렉션프레임워크;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ch11_3_Stack과Queue {
	public static void main(String[] args) {
		/*
		 스택(Stack)
		 : 마지막에 저장한 데이터를 가장 먼저 꺼내게 되는 LIFO(Last In First Out)구조로 되어있음
		 ArrayList
		 
		 큐(Queue)
		 : 처음에 저장한 데이터를 가장 먼저 꺼내게되는 FIFO(First In First Out)구조로 되어있음
		 LinkedList
		 */
		
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("1 Teemo");
		st.push("2 Ezreal");
		st.push("3 Gwen");

		q.offer("1");
		q.offer("2");
		q.offer("3");
		
		System.out.println("-------------Stack");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("-----------Queue");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	}
}
