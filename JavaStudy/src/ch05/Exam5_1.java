package ch05;

public class Exam5_1 {
	public static void main(String[] args) {
		//1, 3, 5, 7, 9
		//           0  1  2  3  4  5  6  7  8  9
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		String sep = "";
		for (int i = 0; i < arr.length;  i++) //{
		//if(arr[i] % 2 != 0)	//���� ������ �Ѱ� ���� Ȧ�������� �ϴ°�
   	    //}  
		//�ؿ��� �ε��������� �Ѱ� �ϴٺ��ϱ� �쿬�� 1,3,5,7,9�����°�
			if(i % 2 == 0){
			 
			System.out.print(sep + arr[i]);
			sep = ",";// ������ �ٸ��ִ� ����
			}
//		for (int i = 0 ; i < arr.length;  i += 2) {
//			
//			System.out.print(arr[i]);
//			 
//		}
	}
}
