package Chapter15_입출력과스트림;

import java.io.*;
import java.util.Arrays;
public class Ch15_02_InputStream과OutputStream의예제3 {
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];

		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		System.out.println("Input Source:"+Arrays.toString(inSrc));
		
		try {
			while(input.available()>0) { // available() : 읽어올 수 있는 데이터의 크기를 반환한다
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
