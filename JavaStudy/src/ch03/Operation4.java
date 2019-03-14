package ch03;

public class Operation4 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;
		//    앞의식이 거짓이기 떄문에 num2++ 은 실행되지 않음.
		result = num1++ < 0 && num2++ > 0;
		System.out.println(num1); // 1
		System.out.println(num2); // 0
		
	}
}
