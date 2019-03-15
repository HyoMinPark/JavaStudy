package ch06;

public class MethodTest {
	public static int firstMethod() {// int= return type 무조건 리턴 숫자; 적어줘야뎀
		//2번  ,4번
		int a = 100;
		return a;
	}
	// 메소드 생성 규칙
	// 반드시 클래스 내에 표현되어야한다.
	// 메소드 내에 표현할 수 없음.
	// 위치 상관 없음.
	public static void main(String[] args) {
		//1번 실행순서
		System.out.println(firstMethod());
		//변수 명은 개발자 마음대로 지을 수 있다.
		//3번
		int num = firstMethod();
		//5번
		System.out.println(num * 6);
	}
}
