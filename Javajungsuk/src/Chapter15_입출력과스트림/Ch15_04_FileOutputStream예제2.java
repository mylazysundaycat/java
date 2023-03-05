package Chapter15_입출력과스트림;

import java.io.*;

public class Ch15_04_FileOutputStream예제2 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);
			
			int data = 0;
			while((data=fis.read())!=-1) 
				fos.write(data);
			
			fis.close();
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
