package Chapter01;

public class Chapter3_연산자 {

	public static void main(String[] args) {
		
		/*
	     형변환
		 : 서로 다른 타입간의 대입이나 연산을 할 때 먼저 형변환으로 타입을 일치시켜야 한다.
		 : 표현범위가 좁은 타입에서 넓은 타입으로 변할땐 값의 손실이 없으므로
		 캐스팅 표현을 하지 않아도, 값의 손실이 없어 자동형변환이 넓은 타입으로
		 이뤄짐
		 byte->short->int->long->float->double
		 
		 산술변환의 규칙
		 1) 두 피연산자의 타입을 같게 일치시킨다 (보다 큰 타입으로 일치)
		 2) 피연산자의 타입이 int보다 작으면 int로 변환시킨다
		 : CPU가 데이터를 처리하는 단위가 4byte이기 때문에 int보다 작은
		 타입의 연산이 시행될때 남는 공간이 발생하여 언더플로우 혹은 오버플로우가
		 발생할 수 있기 때문이다.
		 
		 비교연산자(==)
		 두 피연산자의 값이 같은지 또는 다른지를 비교하는 연산자이다.
		 리턴값으로는 true 와 false만을 돌려준다.
		 
		 문자열의 비교연산자(equals())
		 두 문자열을 비교할땐 '=='대신에 메소드 equals()를 이용해야한다.
		 
		 대입연산자(=)
		 수학에서는 같다 라는 표시이지만, 자바에서는 오른쪽 리터럴 값을
		 왼쪽 변수에 저장할때 사용한다.
		 */	
		
		String a1 = "abc";
		
		System.out.println(a1.equals("abcd"));
		System.out.println(a1.equals("abc"));
		
		/*
		 논리연산자
		 ||(or) 피연산자 한쪽만 true여도 결과값을 true로 받는다.
		 &&(and) 피연산자 모두가 true여야 결과값을 true로 받는다.
		 */
		
		/*
		 조건연산자 
		 조건식? 식1 : 식2
		 참일시에 식1을 반환, 거짓일시에 식2를 반환함
		 */
		
		
		//예제 풀어보기
		int x =2;
		int y =5;
		char c = 'A';
		
		System.out.println(y += 10 - x++);
		System.out.println('C'-c);
		
		int num = 456;
		System.out.println(num-num%100);
		
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples%sizeOfBucket == 0) ? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket+1;
		System.out.println(numOfBucket);
		
		int num2 = 10; 
		System.out.println((num2 > 0) ? "양수입니다" : ((num2 == 0) ? "0입니다" : "음수입니다"));
			}

}
