package Chapter13_������;

import javax.swing.JOptionPane;

public class Ch13_08_interrupt���� {
	public static void main(String[] args) {
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ�");
		System.out.println("�Է��Ѱ�<"+input+">��");
		th1.interrupt();
		System.out.println("isInterrupted():"+th1.isInterrupted());
	}
}

class ThreadEx9_1 extends Thread {
	public void run() {
		int i = 123;
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0; x<2500000000L; x++); //�� �ð������� �ȵ�..?...+
		}
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
}
