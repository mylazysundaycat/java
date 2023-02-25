package Chapter12_지네릭스;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="160101",hhmmss="235959"))
public class Ch12_05_애너테이션예제 {
	public static void main(String[] args) {
		Class<Ch12_05_애너테이션예제> c1 = Ch12_05_애너테이션예제.class;
		
		TestInfo anno = c1.getAnnotation(TestInfo.class);
		/**c1이 갖고있는 아노테이션들 중에서 'TestInfo 타입의 아노테이션을 가져옴*/
	}
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {
	int count() default 1;
	String testedBy();
	String[] testTools() default "JUnit";
	TestType testType() default TestType.FIRST;
	DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime {
	String yymmdd();
	String hhmmss();
}

enum TestType { FIRST, FINAL }
