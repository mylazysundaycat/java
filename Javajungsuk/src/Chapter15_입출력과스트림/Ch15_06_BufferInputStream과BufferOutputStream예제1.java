package Chapter15_����°���Ʈ��;
import java.io.*;
public class Ch15_06_BufferInputStream��BufferOutputStream����1 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("Integer.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
			for(int i='1'; i<='9'; i++) {
				bos.write(i);
			}
			bos.close();
			/*
			 fos.close();�� �Ұ�쿡 ������ 5��ŭ�� ũ�⸸ ��µȴ�.
			 �׷��� bos.close(); �� ���۸� ���� �����ϸ� flush�� ����������
			 ȣ��Ǿ� ��� �ڷḦ ����ϰ� ����ǰ� ��
			 */
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
