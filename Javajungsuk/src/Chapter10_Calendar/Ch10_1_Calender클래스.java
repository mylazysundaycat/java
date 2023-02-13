package Chapter10_Calendar;

import java.util.Calendar;

public class Ch10_1_Calender클래스 {
	public static void main(String[] args) {
		// Calendar cal = new Calendar(); 불가, 이는 추상클래스이기 때문이다.
		/*
		Calendar cal = Calendar.getInstance();
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH)+1;
		int dd = cal.get(Calendar.DATE);
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.",yy,mm,dd);
		System.out.println();
		
		int th = cal.get(Calendar.HOUR);
		int tm = cal.get(Calendar.MINUTE);
		int ts = cal.get(Calendar.SECOND);
		System.out.printf("현재 시각은 %d시 %d분 %d초 입니다.",th,tm,ts);
		*/
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();

		c1.set(2021, 9, 16);

		System.out.println(c1.get(Calendar.DATE));
		
	}
}
