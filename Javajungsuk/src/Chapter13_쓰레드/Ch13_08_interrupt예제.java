package Chapter13_쓰레드;

import javax.swing.JOptionPane;

public class Ch13_08_interrupt예제 {
	public static void main(String[] args) {
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		String input = JOptionPane.showInputDialog("아무값이나 입력하셈");
		System.out.println("입력한건<"+input+">임");
		th1.interrupt();
		System.out.println("isInterrupted():"+th1.isInterrupted());
	}
}

class ThreadEx9_1 extends Thread {
	public void run() {
		int i = 123;
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0; x<2500000000L; x++); //왜 시간지연이 안됨..?...+
		}
		System.out.println("카운트가 종료되었습니다.");
	}
}
