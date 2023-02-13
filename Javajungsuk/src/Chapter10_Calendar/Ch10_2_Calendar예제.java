package Chapter10_Calendar;

import java.util.Calendar;

public class Ch10_2_Calendar���� {
	public static void main(String[] args) {
		//����
		Calendar cal = Calendar.getInstance(); 
		cal.set(2012, 1, 6);
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH)+1;
		
		//������
		Calendar cal2 = Calendar.getInstance(); 
		cal2.set(yy,mm,1);
		
		int START_DAY = 0;
		START_DAY = cal2.get(Calendar.DAY_OF_WEEK);
		System.out.println("������"+START_DAY); // 4���, �����Ͽ� ����
		
		
		//��������
		Calendar cal3 = Calendar.getInstance();
		cal3.set(yy,mm+1,1);
		cal3.add(Calendar.DATE,-1);
		int END_DAY = cal3.get(Calendar.DATE);
		System.out.println("��������"+END_DAY);
		

		
		
		
		
		System.out.printf("         %d�� %d��          \n",yy,mm);
		System.out.println("SUN MON TUE WEN THU FRI SAT");
		
		for(int i=1; i<START_DAY; i++) {
			System.out.print("    ");
		}
		for(int i=1, n=START_DAY ; i<END_DAY+1; i++, n++) {
			if(i<10) {
				System.out.print(i+"   ");
			} else { System.out.print(i+"  "); }
			
			if(n%7==0) {
				System.out.println();
			}
		}
		

		
	}
}
