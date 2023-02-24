package Chapter12_���׸���;

import java.util.ArrayList;

public class Ch12_01_���׸��� {
	public static void main(String[] args) {
		/**
		 ���׸���
		 : ������ ��ü�� Ÿ���� ������ �ִ� ��
		 
		 ���׸����� ����
		 1. Ÿ�� �������� �����Ѵ�
		 2. Ÿ��üũ�� ����ȯ�� ������ �� �����Ƿ� �ڵ尡 ������ ����.
		 
		 ArrayList<T> : <>�ȿ� �ִ� T�� Ÿ�Ժ������ �θ���.
		 **/
		
		/*
		 ���׸����� ���
		
		 class Box<T> {}
		 
		 Box: ����Ÿ��
		 T: Ÿ�Ժ���/Ÿ�� �Ű�����
		 Box<T>: ���׸� Ŭ����
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

