import java.util.Scanner;

public class Chapter4_조건문 {
	public static void main(String[] args) {
	  int score = 0;
	  char grade= ' ', opt = '0';
	  
	  //학점계산기
	  /*
	  System.out.println("당신의 중간고사 점수를 입력하세요 : ");
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
	  
	  System.out.printf("당신의 학점은 %c%c입니다",grade,opt);
	  
	  */

		/*
		 반복문 for문의 구조
		 for (초기화; 조건식; 증감식){ }
		 
		 */	  
	  
	  //별 계단찍기
	  for(int i=1; i<=5; i++) {
		  for(int j=1; j<=i; j++) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	  
	  
	  
	  //같은 식을 for문과 while문으로 표현
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
