import java.util.Scanner;

public class Chapter4_���ǹ� {
	public static void main(String[] args) {
	  int score = 0;
	  char grade= ' ', opt = '0';
	  
	  //��������
	  /*
	  System.out.println("����� �߰���� ������ �Է��ϼ��� : ");
	  Scanner sc = new Scanner(System.in);
	  score = sc.nextInt();
	  
	  if(score >= 90) {
		  grade = 'A';
		  if(score >= 98) {
			  opt = '+';
		  } else if(score <= 94) {
			  opt = '-';
		  }
	  }
	  else if(score >= 80) {
		  grade = 'B';
		  if(score >= 88) {
			  opt = '+';
		  } else if(score <= 84) {
			  opt = '-';
		  }
	  }
	  else if(score >= 70) {
		  grade = 'C';
		  if(score >= 78) {
			  opt = '+';
		  } else if(score <= 74) {
			  opt = '-';
		  }		  
	  }
	  else {
		  grade = 'D';
	  }
	  
	  System.out.printf("����� ������ %c%c�Դϴ�",grade,opt);
	  
	  */

		/*
		 �ݺ��� for���� ����
		 for (�ʱ�ȭ; ���ǽ�; ������){ }
		 
		 */	  
	  
	  //�� ������
	  for(int i=1; i<=5; i++) {
		  for(int j=1; j<=i; j++) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	  
	  
	  
	  //���� ���� for���� while������ ǥ��
	  for(int i=1; i<=10; i++) {
		  System.out.println(i);
	  }
	  
	  
	  int i = 1;
	  while(i<=10) {
		  System.out.println(i);
		  i++;
	  }
	  
	  //
	  
	  
	  
	}
}
