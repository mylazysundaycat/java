package Chapter01;
import java.util.Arrays;

public class Chapter5_�迭 {

	public static void main(String[] args) {
		
		/*
		�迭�� ���: ������ �迭�� �� �������
		�迭�̸�[�ε���]�� �������� ��ҿ� �����Ѵ�.
		�迭.length : �迭�� ���̸� �˷��� -> ������̶� ���� �Ұ���8
		 */
		int[] num = new int[5]; // �迭���̰� 5�� �迭 ����
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
		 �迭�� ��ü ��Ҹ� �����޴� ���
		 Arrays.toString(num3)
		 */
		
		//137p ���հ� ���
		
		int[] num4 = {2,4,7,136,12,55,92};
		int sum = 0;
		
		for(int i=0; i<num4.length; i++) {
			sum += num4[i];
		}
		
		System.out.println("�迭���հ�:"+sum);
		System.out.println("�迭�����:"+sum/(float)num4.length);
	
		
		//137p �ִ밪�� �ּҰ�
		
		//���� Ǯ��: �ִ񰪰� �ּڰ��� ���� ��� ���� �� �ִ� �� ������ ����
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
		
		System.out.println("�ִ�:"+maxNum);
		System.out.println("�ּڰ�:"+minNum);
		
		//�ؼ����� Ǯ��: �迭�� ù��° ��Ҹ� �ִ�,�ּڰ����� ������
		int maxNum2 = num4[0];
		int minNum2 = num4[0];
		
		for(int i=0; i<num4.length; i++) {
			if(maxNum2<num4[i]) {
				maxNum2 = num4[i];
			}
		}
		
		System.out.println("�ִ�:"+maxNum2);
		
		for(int i=0; i<num4.length; i++) {
			if(minNum2>num4[i]) {
				minNum2 = num4[i];
			}
		}
		
		System.out.println("�ּڰ�:"+minNum2);
		
		
		//151p ���� �����ϱ�
		int[][] score = {
				{99,99,99},
				{80,70,60},
				{50,90,70},
				{70,45,55},
				{25,10,95}
		};
		int scoreSum = 0;
		float scoreAverage = 0;
		System.out.println("��ȣ  ����  ����  ����  �������");
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
