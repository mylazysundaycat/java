package Chapter15_����°���Ʈ��;

import java.io.*;
import java.util.Arrays;
public class Ch15_02_InputStream��OutputStream�ǿ���3 {
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];

		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		System.out.println("Input Source:"+Arrays.toString(inSrc));
		
		try {
			while(input.available()>0) { // available() : �о�� �� �ִ� �������� ũ�⸦ ��ȯ�Ѵ�
				int len = input.read(temp);
				System.out.println("len:"+len);
				output.write(temp,0,len);
				
				outSrc = output.toByteArray();
				printArrays(temp,outSrc);
			} 
		} catch(IOException e) {}

	}
	
	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp:"+Arrays.toString(temp));
		System.out.println("Output Source:"+Arrays.toString(outSrc));
	}
}
