package Chapter15_입출력과스트림;

import java.io.*;
import java.util.Arrays;

public class Ch15_02_InputStream과OutputStream의예제1 {
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;
		while((data = input.read())!=-1)
			output.write(data);
		
		outSrc = output.toByteArray();  //스트림의 내용을 byte배열로 변환한다.
		System.out.println("input소스:"+Arrays.toString(inSrc));
		System.out.println("output소스:"+Arrays.toString(outSrc));
		
		/**
		 바이트 배열은 사용하는 자원이 메모리밖에 없으므로 가비지컬렉터에 의해 자동적으로 자원을 반환하므로
		 close()로 스트림을 닫지 않아도 된다. read()와 write(int b)를 사용하기 때문에
		 한 번에 1byte만 읽고 쓰므로 작업효율이 떨어진다.
		 */
		
	}
}
