package Chapter10_Calendar;

import java.util.Calendar;

public class Ch10_1_CalenderŬ���� {
	public static void main(String[] args) {
		// Calendar cal = new Calendar(); �Ұ�, �̴� �߻�Ŭ�����̱� �����̴�.
		/*
		Calendar cal = Calendar.getInstance();
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH)+1;
		int dd = cal.get(Calendar.DATE);
		System.out.printf("������ %d�� %d�� %d�� �Դϴ�.",yy,mm,dd);
		System.out.println();
		
		int th = cal.get(Calendar.HOUR);
		int tm = cal.get(Calendar.MINUTE);
		int ts = cal.get(Calendar.SECOND);
		System.out.printf("���� �ð��� %d�� %d�� %d�� �Դϴ�.",th,tm,ts);
		*/
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();

		c1.set(2021, 9, 16);

		System.out.println(c1.get(Calendar.DATE));
		
	}
}
