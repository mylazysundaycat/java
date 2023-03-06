package Chapter15_입출력과스트림;

public class Ch15_06_BufferInputStream과BufferOutputStream {
	public static void main(String[] args) {
		/**
		 BufferInputStream/BufferOutputStream
		 : 스트림의 입출력 효율을 높이기 위해서 버퍼를 사용하는 보조 스트림이다.
		 1바이트씩 입출력 하는 것보다 버퍼(바이트배열)을 이용해서 한번에 여러 바이트를
		 입출력하는것이 빠르기 때문에 대부분의 입출력 작업에 사용된다. 
		 
		 [1]BufferInputStream(inputStream in, int size)
		 인풋스트림 인스턴스를 입력소스로 하고 지정된 크기의 버퍼를 갖는 보조스트림을 생성한다.
		 [2]BufferInputStream(inputStream in)
		 버퍼의 크기를 지정해주지 않으므로 기본적으로 8192byte크기의 버퍼를 갖게된다.
		 
		 
		 [1]BufferOutputStream(OutputStream out, int size)
		 아웃풋스트림 인스턴스를 출력소스로 하며 지정된 크기의 버퍼를 갖는 보조스트림을 생성한다.
		 [2]BufferOutputStream(OutputStream out)
		 버퍼의 크기를 지정해주지 않으므로 기본적으로 8192byte크기의 버퍼를 갖게된다.
		 [3]flush()
		 버퍼의 모든 내용을 출력소스에 출력한 다음, 버퍼를 비운다.
		 [4]close()
		 flush()를 호출해서 버퍼의 모든 내용을 출력소스에 출력하고, 버퍼 객체가 사용하던
		 모든자원을 반환한다.
		 
		 
		 */
	}
}
