import java.util.Scanner;

public class Chapter4_���ǹ� {
	public static void main(String[] args) {
	  int score = 0;
	  char grade= ' ', opt = '0';
	  
	  //��������
	  /*
	  System.out.println("����� �߰���� ������ �Է��ϼ��� : ");
	  // Scanner sc = new Scanner(System.in);
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
	  
	  // 116p ���� Ǯ���
	  
	  int a = 5;
	  while(a--!=0) {
		  System.out.println(a);
	  }
	  
	  int b = 5;
	  while(b!=0) {
		  b--;
		  System.out.println(b);
	  }
	  
	  //117p ���� Ǯ���
	  //�� �ڸ����� ���� �˷��ִ� ���α׷��� ������.
	  
	  /*
	  int result = 0;
	  
	  System.out.println("���ڸ� �Է��Ͻÿ� : ");
	  Scanner sc = new Scanner(System.in);
	  String input  = sc.nextLine();
	  int num = Integer.parseInt(input);
	  
	  
	  while(num!=0) {
		  result += num%10;
		  num = (num - num%10)/10; // num/10 �� �־ ���̿��� �������� �ȴ�.
	  }
	  
	  System.out.printf("�� �ڸ����� ���Դϴ�:%d", result);
	  */
	  
	  
		/* 
		 * do- while�� 
		 * ������ while���� ���ǽĿ� ���� {}���� ������� �ȵ����� �����Ѵٸ� do-while���� ���ǽİ��� �������
		 * ����� {}���� 1���� �����ϰ��� ���ǽ��� ���� �� ������ {}���� ������� �ȵ����� ���Ѵ�.
		 */
	  
	  //p118 ������ ���ڸ� �Է��ؼ� ���ߴ� ���α׷� ������
	  

	  Scanner sc2 = new Scanner(System.in);
	  int correctNum = (int)(Math.random()*100)+1; // 1<= x <101 �� ������ ��������
	  int num2 = 0;
	  
	  do {
		  System.out.println("���ڸ� ���纸���� : ");
		  String input2 = sc2.nextLine();
		  num2 = Integer.parseInt(input2);
		  
		  if(num2==correctNum) {
			  System.out.println("�����Դϴ�! ������ ��Ĩ�ϴ�! ");
		  }
		  else if(num2>correctNum){
			  System.out.println("���� ���ڴ� �� �����̴ϴ�.");
		  }
		  else if(num2<correctNum) {
			  System.out.println("���� ���ڴ� �� Ŭ�̴ϴ�.");
		  }
	  } while (correctNum!=num2);


	  /*
	   break
	   �ڽ��� ���Ե� ���� ����� �ݺ���(for, while)���� ������ ����� ���ش�
	   
	   continue
	   �ݸ� ��ü�� ����� �ʰ� �ϰ� �ش� ��ɹ��� ������ ���� �ݺ����� �����ϰ� ���ش�.
	   
	   for(;;) << �ѹ� �ݺ����ε�
	   */
	  
	  
	}
}
