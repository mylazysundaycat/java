import java.util.Scanner;

public class Chapter4_조건문 {
	public static void main(String[] args) {
	  int score = 0;
	  char grade= ' ', opt = '0';
	  
	  //학점계산기
	  /*
	  System.out.println("당신의 중간고사 점수를 입력하세요 : ");
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
	  
	  // 116p 예제 풀어보기
	  
	  int a = 5;
	  while(a--!=0) {
		  System.out.println(a);
	  }
	  
	  int b = 5;
	  while(b!=0) {
		  b--;
		  System.out.println(b);
	  }
	  
	  //117p 예제 풀어보기
	  //각 자리수의 합을 알려주는 프로그램을 만들어보자.
	  
	  /*
	  int result = 0;
	  
	  System.out.println("숫자를 입력하시오 : ");
	  Scanner sc = new Scanner(System.in);
	  String input  = sc.nextLine();
	  int num = Integer.parseInt(input);
	  
	  
	  while(num!=0) {
		  result += num%10;
		  num = (num - num%10)/10; // num/10 을 넣어도 몫이여서 같은값이 된다.
	  }
	  
	  System.out.printf("각 자리수의 합입니다:%d", result);
	  */
	  
	  
		/* 
		 * do- while문 
		 * 기존의 while문은 조건식에 따라 {}블럭이 실행될지 안될지를 결정한다면 do-while문은 조건식과는 관계없이
		 * 선행된 {}블럭을 1번은 실행하고나서 조건식을 통해 그 다음에 {}블럭이 실행될지 안될지를 평가한다.
		 */
	  
	  //p118 랜덤한 숫자를 입력해서 맞추는 프로그램 만들어보기
	  

	  Scanner sc2 = new Scanner(System.in);
	  int correctNum = (int)(Math.random()*100)+1; // 1<= x <101 의 정수값 랜덤배정
	  int num2 = 0;
	  
	  do {
		  System.out.println("숫자를 맞춰보세요 : ");
		  String input2 = sc2.nextLine();
		  num2 = Integer.parseInt(input2);
		  
		  if(num2==correctNum) {
			  System.out.println("정답입니다! 게임을 마칩니다! ");
		  }
		  else if(num2>correctNum){
			  System.out.println("정답 숫자는 더 작을겁니다.");
		  }
		  else if(num2<correctNum) {
			  System.out.println("정답 숫자는 더 클겁니다.");
		  }
	  } while (correctNum!=num2);


	  /*
	   break
	   자신이 포함된 가장 가까운 반복문(for, while)에서 강제로 벗어나게 해준다
	   
	   continue
	   반목문 전체를 벗어나지 않게 하고 해당 명령문을 만나면 다음 반복으로 수행하게 해준다.
	   
	   for(;;) << 한무 반복문인듯
	   */
	  
	  
	}
}
