package Chapter13_������;

import javax.swing.JOptionPane;

public class Ch13_04_��������IO���ŷ���� {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("�ƹ��ų� �Է��غ���");
		System.out.println("�Է��Ͻ� ����:"+input+"�Դϴ�");
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}
}
