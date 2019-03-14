package ch04;

	public class Exam4_8 {
		public static void main(String[] args) {
			
		//1 ~ 1000 사이의 숫자 중 3을 포함하고 있는 숫자를 출력
			int count = 0;
		 for(int i = 1; i <= 301; i++) {
		 // 코드 작성
			 // 3 4 5 6
			 // 12
			 // 1 % 3 == 0 x
			 // 1 == 3
			 int num = i;
			 while(num > 0) {
				 //13일때 
				 int n = num % 10;            // 3이나옴
				 if( n == 3) {
					 System.out.println(i);
					 count ++;
					 break;
				 }
				 num = num / 10;
			 }
		}
		 System.out.println(count);
}
}
