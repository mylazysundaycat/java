package Chapter12_지네릭스;

import java.util.ArrayList;

public class Ch12_01_지네릭스 {
	public static void main(String[] args) {
		/**
		 지네릭스
		 : 저장할 객체의 타입을 지정해 주는 것
		 
		 지네릭스의 장점
		 1. 타입 안정성을 제공한다
		 2. 타입체크와 형변환을 생략할 수 있으므로 코드가 간결해 진다.
		 
		 ArrayList<T> : <>안에 있는 T를 타입변수라고 부른다.
		 **/
		
		/*
		 지네릭스의 용어
		
		 class Box<T> {}
		 
		 Box: 원시타입
		 T: 타입변수/타입 매개변수
		 Box<T>: 지네릭 클래스
		 */
		
		ArrayList<Product> pdList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		
		pdList.add(new Tv());
		pdList.add(new Audio());
		
		printAll(pdList);
		
		
		
	}
	
	static void printAll(ArrayList<Product> list) {
		for(Product p:list)
			System.out.println(p);
	}
}

class Product {}
class Tv extends Product {}
class Audio extends Product {}

