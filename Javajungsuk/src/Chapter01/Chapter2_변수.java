package Chapter01;
import java.util.Scanner;

public class Chapter2_변수 {
	public static void main(String[] args) {
		/*
		 변수: 하나의 값을 저장할 수 있는 저장공간 
		 변수타입 변수이름;

		 상수: 상수는 변수와 달리 한번 저장되면 다른 값으로 변경할 수 없다.
		 변수타입 앞에 final을 붙여주면 됨
		 여기서 final은 '키워드'
		 */
		
		final int MAX_SPEED = 10;  //상수 MAX_SPEED 리터럴 10
		
		/*
		 리터럴 타입의 접두사와 접미사
		 */	
		int Num8 = 010; //8진수 10 '0'을 접두사로 붙임
		int Num16 = 0x10; //16진수 10 '0x'를 접두사로 붙임
		
		float pi = 3.14f; //'f'를 접미사로 붙임. 생략불가
		double rate = 1.618d; //'d'를 접미사로 붙임. 생략가능
		
		/*
		문자 리터럴과 문자열 리터럴
		*/
		char ch = 'Y'; //문자 하나를 감싼 것, 문자 리터럴
		String name = "YJ"; //두 문자 이상을 감싼 것, 문자열 리터럴
		
		/*
		 1. 자료형
		 값의 종류에 따라서 값이 저장될 공간의 크기와 저장 형식을 정의한 것
		 자료형 = 기본형 + 참조형
		 2. 기본형
		 변수의 실제 값(data) 저장
		 3. 참조형
		 어떤 값이 저장되어 있는 주소를 값으로 가짐
		  
		 자바는 c언어와 달리 참조형 변수 간의 연산을 할 수 없으므로 실제 연산은
		 모두 기본형으로만 가능
		 */
		
		/* 
		 * 지시자
		 */
		
		int age = 14;
		System.out.printf("age:%d%n", age); // %n -> 엔터키
		System.out.printf("age:%d%n", 25);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 자리 정수를 하나 입력하세요");
		String input = scanner.nextLine();
		
		//System.out.println(input);
		
		/*
		 1bit -> 0과 1을 가지는 2진수의 기본단위 (2가지)
		 8bit = 1byte (2의8승 가지)
		 
		 1byte : -2^7 ~ +2^7-1 (2의8승 가지)
		 int : -2^31 ~ +2^31-1 (2의32승 가지)
		 */		
		
	}
}
