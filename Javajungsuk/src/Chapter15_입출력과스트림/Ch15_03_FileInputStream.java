package Chapter15_입출력과스트림;

public class Ch15_03_FileInputStream {
	public static void main(String[] args) {
		/**
		 FileInputStream/FileOutputStream은 파일을 입출력 하기 위한 스트림이다.
		 
		 [1] FileInputStream(String name)
		 지정된 파일이름을 가진 실제 파일과 연결된 스트림을 생성한다.
		 [2] FileInputStream(File file)
		 파일 인스턴스를 받아 연결된 스트림을 생성한다.
		 [3] FileInputStream(FileDescriptor fdObi)
		 파일 디스크립터로 스트림을 생성한다.
		 
		 
		 [1] FileOutputStream(String name)
		 지정된 파일이름을 가진 실제 파일과 연결된 FileOutputStream을 생성한다.
		 [2] FileOutputStream(String name, boolean append)
		 지정된 파일이름을 가진 실제 파일과 연결된 FileOutputStream을 생성한다.
		 두번째 인자인 append를 true로 하면 출력시 기존의 파일내용의 마지막에 추가한다.
		 false로 하면 기존의 파일내용을 덮어쓰게 된다.
		 [3] FileOutputStream(File file)
		 파일 인스턴스를 받아 스트림을 생성한다.
		 [4] FileOutputStream(File file, boolean append)
		 [5] FileOutputStream(FileDescriptor fdObj)
		 
		 
		 */
	}
}
