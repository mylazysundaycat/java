package Chapter15_입출력과스트림;
import java.io.*;
public class Ch15_06_BufferInputStream과BufferOutputStream예제1 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("Integer.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
			for(int i='1'; i<='9'; i++) {
				bos.write(i);
			}
			bos.close();
			/*
			 fos.close();를 할경우에 사이즈 5만큼의 크기만 출력된다.
			 그러나 bos.close(); 즉 버퍼를 통해 종료하면 flush가 내부적으로
			 호출되어 모든 자료를 출력하고 종료되게 됨
			 */
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
