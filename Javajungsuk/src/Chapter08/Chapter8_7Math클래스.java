package Chapter08;

public class Chapter8_7MathŬ���� {
	public static void main(String[] args) {
		// �Ҽ��� n��° �ڸ����� �ݿø��� ���� ��� ��
		// 10�� n�������� ���� ��, round()�� ����, �ٽ� 10�� n�������� �����ش�.
		
		float testNum = 1039.789291f;
		float resultNum = (Math.round(testNum*100f))/100f;
		System.out.println(resultNum);
		
	}
}
