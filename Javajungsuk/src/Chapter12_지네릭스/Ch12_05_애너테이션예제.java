package Chapter12_���׸���;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="160101",hhmmss="235959"))
public class Ch12_05_�ֳ����̼ǿ��� {
	public static void main(String[] args) {
		Class<Ch12_05_�ֳ����̼ǿ���> c1 = Ch12_05_�ֳ����̼ǿ���.class;
		
		TestInfo anno = c1.getAnnotation(TestInfo.class);
		/**c1�� �����ִ� �Ƴ����̼ǵ� �߿��� 'TestInfo Ÿ���� �Ƴ����̼��� ������*/
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
