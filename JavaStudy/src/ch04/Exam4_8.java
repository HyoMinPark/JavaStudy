package ch04;

	public class Exam4_8 {
		public static void main(String[] args) {
			
		//1 ~ 1000 ������ ���� �� 3�� �����ϰ� �ִ� ���ڸ� ���
			int count = 0;
		 for(int i = 1; i <= 301; i++) {
		 // �ڵ� �ۼ�
			 // 3 4 5 6
			 // 12
			 // 1 % 3 == 0 x
			 // 1 == 3
			 int num = i;
			 while(num > 0) {
				 //13�϶� 
				 int n = num % 10;            // 3�̳���
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
