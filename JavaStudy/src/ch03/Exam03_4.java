package ch03;

public class Exam03_4 {
	public static void main(String[] args) {
		int num = 456;
		//1�� % ������ Ȱ��
		//int remain = num % 100;
		//num = num - remain;
		
		
		//num = num / 100 * 100;
		int n1 = num / 100;
		num = n1 * 100;
		System.out.println(num); // ������, ���ϱ� ������ �̿�
		
//		 int n1 = num % 100;
//		 num = num - n1;
//		 System.out.println(num); // ������, ���ϱ� ������ �̿�
	}
}