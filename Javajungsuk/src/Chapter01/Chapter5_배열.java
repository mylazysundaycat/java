package Chapter01;
import java.util.Arrays;

public class Chapter5_배열 {

	public static void main(String[] args) {
		
		/*
		배열의 요소: 생성된 배열의 각 저장공간
		배열이름[인덱스]의 형식으로 요소에 접근한다.
		배열.length : 배열의 길이를 알려줌 -> 상수값이라 변경 불가능8
		 */
		int[] num = new int[5]; // 배열길이가 5인 배열 생성
		int[] num2 = new int[] {50,60,70,80};
		int[] num3 = {10,20,30};
		
		for(int i=0; i<num.length; i++) {
			num[i]=i+1;
			System.out.println(num[i]);
		}
		
		for(int i=0; i<num3.length; i++) {
			System.out.println(num3[i]);
		}
		
		System.out.println(num3);
		System.out.println(Arrays.toString(num3));
		
		/*
		 배열의 전체 요소를 돌려받는 방법
		 Arrays.toString(num3)
		 */
		
		//137p 총합과 평균
		
		int[] num4 = {2,4,7,136,12,55,92};
		int sum = 0;
		
		for(int i=0; i<num4.length; i++) {
			sum += num4[i];
		}
		
		System.out.println("배열의합계:"+sum);
		System.out.println("배열의평균:"+sum/(float)num4.length);
	
		
		//137p 최대값과 최소값
		
		//나의 풀이: 최댓값과 최솟값을 따로 떼어서 비교할 수 있는 빈 공간을 만듬
		int maxNum = 0;

		for(int i=0; i<num4.length; i++) {
			if(maxNum<num4[i]) {
				maxNum = num4[i];
			}
		}
		
		int minNum = maxNum;
		
		for(int i=0; i<num4.length; i++) {
			if(minNum>num4[i]) {
				minNum = num4[i];
			}
		}
		
		System.out.println("최댓값:"+maxNum);
		System.out.println("최솟값:"+minNum);
		
		//해설지의 풀이: 배열의 첫번째 요소를 최댓값,최솟값으로 설정함
		int maxNum2 = num4[0];
		int minNum2 = num4[0];
		
		for(int i=0; i<num4.length; i++) {
			if(maxNum2<num4[i]) {
				maxNum2 = num4[i];
			}
		}
		
		System.out.println("최댓값:"+maxNum2);
		
		for(int i=0; i<num4.length; i++) {
			if(minNum2>num4[i]) {
				minNum2 = num4[i];
			}
		}
		
		System.out.println("최솟값:"+minNum2);
		
		
		//151p 예제 구현하기
		int[][] score = {
				{99,99,99},
				{80,70,60},
				{50,90,70},
				{70,45,55},
				{25,10,95}
		};
		int scoreSum = 0;
		float scoreAverage = 0;
		System.out.println("번호  국어  영어  수학  평균점수");
		System.out.println("=========================");
		
		for(int i=0; i<score.length; i++) {
			System.out.printf("%-5d",i+1);
			for(int j=0; j<score[i].length; j++) {
				scoreSum+=score[i][j];
				System.out.printf("%-5d",score[i][j]);
				if(j==score[i].length-1) {
					scoreAverage = scoreSum/score[i].length;
					System.out.printf("%-5f",scoreAverage);
					scoreSum=0;
 
				}
			}
		}
		
		
		

	}

}
