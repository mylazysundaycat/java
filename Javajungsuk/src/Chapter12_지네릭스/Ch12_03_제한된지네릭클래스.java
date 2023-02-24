package Chapter12_���׸���;

import java.util.ArrayList;

public class Ch12_03_���ѵ����׸�Ŭ���� {
	public static void main(String[] args) {
		
	}
}

interface Eatable {}

class Fruit implements Eatable {
	public String toString() {return "Fruit!";}
}

class Apple extends Fruit {
	public String toString() {return "Apple";}
}

class Grape extends Fruit {
	public String toString() {return "Grape";}
}

class Toy {
	public String toString() {return "Toy";}
}

class FruitBox<T extends Fruit&Eatable> extends Box<T>{}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}