package Chapter15_����°���Ʈ��;

import java.io.*;
import java.util.Arrays;

public class Ch15_02_InputStream��OutputStream�ǿ���2 {
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[10];
		
		//ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		//input.read(temp,0,temp.length);
		output.write(inSrc,5,5);
		
		outSrc = output.toByteArray();
		
		//System.out.println("input source:"+Arrays.toString(inSrc));
		//System.out.println("temp:"+Arrays.toString(temp));
		System.out.println("Output source:"+Arrays.toString(outSrc));
	}
}
