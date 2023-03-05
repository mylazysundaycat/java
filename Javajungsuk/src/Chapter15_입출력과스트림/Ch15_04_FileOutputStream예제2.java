package Chapter15_����°���Ʈ��;

import java.io.*;

public class Ch15_04_FileOutputStream����2 {
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
