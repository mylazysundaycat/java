package Chapter11_컬렉션프레임워크;

public class Ch11_11_Collections의메서드 {
	public static void main(String[] args) {
		/**
		 1. 컬렉션의 동기화
		 : 멀티쓰레드 프로그래밍에서는 하나의 객체를 여러 쓰레드가 동시에 접근할 수 있기 때문에
		 데이터의 무결성을 유지하기 위해서는 공유되는 객체에 동기화가 필요하다.
		 
		 synchronizedCollection(Collection c)
		 synchronizedList(List list)
		 
		 
		 2. 컬렉션의 변경불가
		 : 컬렉션에 저장된 데이터를 보호하기 위해서 읽기전용으로 만들어야 할때 아래의 메서드를 이용한다.
		 
		 static Collection unmodifiableCollection(Collection c)
		 static List unmodifiableList(List list)
		 
		 
		 3. 컬렉션의 싱글톤
		 : 단 하나의 객체만을 저장하는 컬렉션을 만들어야 하는 경우가 있다. 
		 
		 static List singletonList(Object o)
		 
		 
		 4. 컬렉션의 단일컬렉션
		 : 컬렉션에 모든 종류의 객체를 저장할 수 있다는 것은 장점이기도 하고 단점이기도 하다. 대부분의
		 경우 한 종류의 객체를 저장하며, 컬렉션에 지정된 종류의 객체만 저장할 수 있도록 제한하고 싶을떄
		 아래의 메서드를 사용한다.
		 
		 static Collection checkedCollection(Object o ,Object o)
		 
		 
		 **/
	}
}
