package Chapter11_�÷��������ӿ�ũ;

import java.util.Scanner;
import java.util.Stack;

public class Ch11_3_Stack��Queue2 {
	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("Usage:java Ch11_3_Stack��Queue2 EXPRESSION");
			System.out.println("Example:java Ch11_3_Stack��Queue2 ((2+3)*1)+3");
			System.exit(0);
		}
		
		Stack st = new Stack();
		String expression = args[0];
		
		System.out.println("expression:"+expression);
	}
}
