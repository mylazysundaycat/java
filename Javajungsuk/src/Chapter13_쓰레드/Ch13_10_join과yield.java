package Chapter13_������;

public class Ch13_10_join��yield {
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadEx11_1 th1 = new ThreadEx11_1();
		ThreadEx11_2 th2 = new ThreadEx11_2();
		th1.start();
		th2.start();
		
		startTime = System.currentTimeMillis();
		
		try {
			th1.join(); //main �����尡 th1�۾��� ���������� ��ٸ�
			th2.join(); //main �����尡 th2�۾��� ���������� ��ٸ�
		} catch(InterruptedException e) {}
		
		System.out.println("�ҿ�ð�:"+(System.currentTimeMillis()-Ch13_10_join��yield.startTime));
	}
}

class ThreadEx11_1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println(new String("-"));
		}
	}
}

class ThreadEx11_2 extends Thread {
	public void run() {
		for (int i=0; i<300; i++) {
			System.out.println(new String("@"));
		}
	}
}



