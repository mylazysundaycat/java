package Chapter11_�÷��������ӿ�ũ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ch11_3_Stack��Queue {
	public static void main(String[] args) {
		/*
		 ����(Stack)
		 : �������� ������ �����͸� ���� ���� ������ �Ǵ� LIFO(Last In First Out)������ �Ǿ�����
		 ArrayList
		 
		 ť(Queue)
		 : ó���� ������ �����͸� ���� ���� �����ԵǴ� FIFO(First In First Out)������ �Ǿ�����
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
