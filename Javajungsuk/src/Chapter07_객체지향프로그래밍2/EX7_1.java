package Chapter07_��ü�������α׷���2;

public class EX7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		for (int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i]+",");
		}
		
		deck.shuffle();
		
		for (int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i]+",");
		}
		
		System.out.println();
		
		deck.pick(0);
		deck.pick(4);
		deck.pick(20);
		
		System.out.println(deck.pick());
		
	}
}





class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0; i < cards.length; i++) {
			int num = i%10+1;
			boolean isKwang = (i<10)&&(num==1||num==3||num==8);
			cards[i] = new SutdaCard(num,isKwang);
		}
		
	}
	
	//shuffle���
	void shuffle() {
		for(int i=0; i<cards.length*2; i++) {
			int x = (int)(Math.random()*20);
			int y = (int)(Math.random()*20);
			
			SutdaCard c = cards[x];
			cards[x] = cards[y];
			cards[y] = c;
		}
		System.out.println("����");

	}
	
	void pick(int index) {
		if(19<index || 0>index) {
			System.out.println("�߸��� ���ڸ� �����ϼ̽��ϴ�. 0���� 19���̸� �Է��ϼ���");
			return;
		}
		System.out.println(cards[index]);
		
	}
	
	SutdaCard pick() {
		int randomNum = (int)(Math.random()*20);
		return cards[randomNum];
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang?"K":" ");
	}
	
}
