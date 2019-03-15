package ch05;

public class Exam5_5 {
	public static void main(String[] args) {
		int[][] arr = {
				{ 95, 86 }, 
				{ 83, 92, 96 }, 
				{ 78, 83, 93, 87, 88 } 
        };

		int sum = 0;
		double avg = 0.0;
//		int [] arr0 =arr[0]; //{98,86}
//		int arr0Lenth = arr0.length
//		arr[0].length;  À§¿¡¶û ¹Ø¿¡¶û °°Àº¸»
		// ÄÚµå ÀÛ¼º
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				count++;
			}
		}
		avg = sum / (double) count;
		System.out.println("ÇÕ : " + sum);
		System.out.println("Æò±Õ : " + avg);
	}
}
