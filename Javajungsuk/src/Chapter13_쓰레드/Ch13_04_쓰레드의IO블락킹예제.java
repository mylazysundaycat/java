package Chapter13_쓰레드;

import javax.swing.JOptionPane;

public class Ch13_04_쓰레드의IO블락킹예제 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("아무거나 입력해보렴");
		System.out.println("입력하신 값은:"+input+"입니다");
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}
}
