package Chapter07_객체지향프로그래밍2;

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
	
	//shuffle기능
	void shuffle() {
		for(int i=0; i<cards.length*2; i++) {
			int x = (int)(Math.random()*20);
			int y = (int)(Math.random()*20);
			
			SutdaCard c = cards[x];
			cards[x] = cards[y];
			cards[y] = c;
		}
		System.out.println("섞기");

	}
	
	void pick(int index) {
		if(19<index || 0>index) {
			System.out.println("잘못된 숫자를 선택하셨습니다. 0에서 19사이를 입력하세요");
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
