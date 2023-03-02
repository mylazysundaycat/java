package Chapter13_������;

public class Ch13_07_sleep���� {
	public static void main(String[] args) {
		ThraedEx8_1 th1 = new ThraedEx8_1();
		ThraedEx8_2 th2 = new ThraedEx8_2();
		th1.start();
		th2.start();
		try {
			th1.sleep(2000);
		} catch(InterruptedException e) {}
		
		System.out.println("<<main����>>");
	}
}

class ThraedEx8_1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) System.out.println("$");
		System.out.println("<<th1����>>");
	}
}

class ThraedEx8_2 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) System.out.println("@");
		System.out.println("<<th2����>>");
	}
}
