package Chapter15_입출력과스트림;

public class Ch15_01_스트림의개념 {
	public static void main(String[] args) {
		/**
		 1. 입출력과 스트림
		 
		 스트림 (stream)
		 : 람다와 스트림에서 쓰이는 용어와 다른 개념이며
		 데이터를 운반할때 사용되는 연결통로이다.
		 
		 [1] 스트림은 물이 한쪽방향이 흐르는 것 처럼, 단방향 통신만 가능하기 떄문에
		 입력과 출력을 동시에 처리할 수 없다.
		 [2] 입력과 출력을 동시에 수행하기 위해선 입력을 위한 입력스트림, 출력을 위한 출력스트림
		 모두 2개의 스트림이 필요하다.
		 
		 
		 2. 바이트 기반 스트림
		 
		 스트림은 바이트 단위로 데이터를 전송하며 입출력 대상에 따라서 다음과 같은 입출력 스트림이 있다.
		 FileInputStream 파일
		 ByteArrayInputStream 메모리(byte배열)
		 PipedInputStream 프로세스(프로세스간의통신)
		 AudioInputStram 오디오장치
		 
		 
		 3. 보조 스트림
		 
		 스트림의 기능을 보완하기 위해 보조 스트림이 자바에서 제공되고 있다.
		 보조 스트림은 실제 데이터를 주고받는 스트림이 아니기 때문에 데이터를 입출력 할 수 없지만
		 스트림의 기능을 향상시키거나 새로운 기능을 추가할 수있다.
		 
		 보조 스트림은 말그대로 '보조 스트림'이기 때문에 
		 스트림을 먼저 생성한 다음에 이를 이용해야 한다.
		 
		 FilterInputStream 필터를 이용할 입출력 처리
		 BufferedInputStream 버퍼를 이용한 입출력 성능 향상
		 DataInputStream 기본형단위로 데이터 처리
		 
		 
		 4. 문자 기반 스트림 - Reader, Writer
		 
		 지금까지 알아본 스트림은 모두 바이트 기반의 스트림이었다.
		 입출력의 단위가 1byte라는 것이다.
		 
		 하지만 Java는 한 문자를 의미하는 char형이 2byte기 때문에, 바이트기반 스트림으로 문자를
		 처리하기엔 어려움이 있다.
		 
		 이 점을 보완하기 위해서 문자기반의 스트림이 제공된다.
		 
		 FileInputstream -> FileReader
		 ByteArrayInputStream -> CharArrayReader
		 PipedInputStream -> PipedReader
		 StringBufferInputStream -> StringReader
		 
		 
		 5. 바이트 기반 스트림과 문자 기반 스트림의 비교
		 
		 둘은 이름만 조금 다를뿐 활용법은 거의 같다

		 */
	}
}
