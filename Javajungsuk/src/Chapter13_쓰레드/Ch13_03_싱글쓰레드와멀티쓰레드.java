package Chapter13_쓰레드;

public class Ch13_03_싱글쓰레드와멀티쓰레드 {
	static long startTime = 0;
	public static void main(String[] args) {
		ThreadEx3_1 th1 = new ThreadEx3_1();
		th1.start();
		startTime = System.currentTimeMillis();
		
		for(int i=0; i<300; i++) 
			System.out.printf("%s",new String("-"));
		
		System.out.println("소요시간1:"+(System.currentTimeMillis()-Ch13_03_싱글쓰레드와멀티쓰레드.startTime));
	}
}


class ThreadEx3_1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++)
			System.out.printf("%s",new String("|"));
		
		System.out.println("소요시간2:"+(System.currentTimeMillis()-Ch13_03_싱글쓰레드와멀티쓰레드.startTime));
	}
}