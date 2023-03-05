package Chapter15_����°���Ʈ��;

import java.io.*;
import java.util.Arrays;

public class Ch15_02_InputStream��OutputStream�ǿ���1 {
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;
		while((data = input.read())!=-1)
			output.write(data);
		
		outSrc = output.toByteArray();  //��Ʈ���� ������ byte�迭�� ��ȯ�Ѵ�.
		System.out.println("input�ҽ�:"+Arrays.toString(inSrc));
		System.out.println("output�ҽ�:"+Arrays.toString(outSrc));
		
		/**
		 ����Ʈ �迭�� ����ϴ� �ڿ��� �޸𸮹ۿ� �����Ƿ� �������÷��Ϳ� ���� �ڵ������� �ڿ��� ��ȯ�ϹǷ�
		 close()�� ��Ʈ���� ���� �ʾƵ� �ȴ�. read()�� write(int b)�� ����ϱ� ������
		 �� ���� 1byte�� �а� ���Ƿ� �۾�ȿ���� ��������.
		 */
		
	}
}
