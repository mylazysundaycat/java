package Chapter15_����°���Ʈ��;

import java.io.*;
import java.util.Scanner;

public class Ch15_04_FileInputStream����1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(args[0]);
		Scanner sc = new Scanner(System.in);
		int data = 0;
		while((data=fis.read())!=-1) {
			char c = (char)data;
			System.out.println(c);
		}
	}
}
