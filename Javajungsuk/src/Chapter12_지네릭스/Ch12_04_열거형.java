package Chapter12_지네릭스;

public class Ch12_04_열거형 {
	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class , "EAST");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		System.out.println("d1==d2 ->"+(d1==d2));
		System.out.println("d1==d3 ->"+(d1==d3));
		
		
	}
}

enum Direction {EAST, SOUTH, WEST, NORTH}

enum Direction2 {
	EAST(1,">"), SOUTH(2,"V"), WEST(3,"<"), NORTH(4,"^");
	
	private static final Direction2[] DIR_ARR = Direction2.values();
	private final int value;
	private final String symbol;
	
	Direction2(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
	}
	
	public int getValue() {return value;}
	public String getSymbol() {return symbol;}
	
	public static Direction2 of(int dir) {
		if(dir<1||dir>4) {
			throw new IllegalArgumentException("Invalud value:"+dir);
		} else {
			return DIR_ARR[dir-1];
		}
	}
	
	
	public Direction2 rotate (int num) {
		num = num%4;
		if(num<0) num +=4;
		return DIR_ARR[(value-1+num)%4];
	}
	
	public String toString() {
		return name()+getSymbol();
	}
}