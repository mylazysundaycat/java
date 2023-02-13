package Chapter10_Calendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ch10_4_SimpleDateFormat {
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(today));
		
		SimpleDateFormat df2, df3;
		
		df2 = new SimpleDateFormat("yy년 MM월 dd일");
		df3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(df2.format(today));
		System.out.println(df3.format(today));
		
		
		
		
		/*---------------------------------------*/
		
		
		
		//날짜 텍스트열 형식을 바꿔줌
		
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		DateFormat df4 = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df5 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df4.parse(input);
			System.out.println(df5.format(d));
		} catch(Exception e) {}
		
	}
}
