package ch06;

public class Exam6_3_2 {
	public static int getBetweenSum(int n1, int n2) {
		int sum = 0;
		// 두번쨰 방식 삼항연산자
//		 int start = n1 > n2 ? n2 : n1;
//		 int end = n1 < n2 ? n1 : n2;
		
		//첫번째 방식
		if(n1 > n2) {
			int temp = 0;
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		
		for(int i = n1; i<= n2; i++) {
			sum += i;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		int sum = getBetweenSum(3, 5);
		System.out.println(sum);
	}
}
