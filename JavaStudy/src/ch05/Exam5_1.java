package ch05;

public class Exam5_1 {
	public static void main(String[] args) {
		//1, 3, 5, 7, 9
		//           0  1  2  3  4  5  6  7  8  9
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		String sep = "";
		for (int i = 0; i < arr.length;  i++) //{
		//if(arr[i] % 2 != 0)	//실제 값으로 한것 실제 홀수값으로 하는것
   	    //}  
		//밑에는 인덱스값으로 한것 하다보니까 우연히 1,3,5,7,9가나온것
			if(i % 2 == 0){
			 
			System.out.print(sep + arr[i]);
			sep = ",";// 문장을 꾸며주는 내용
			}
//		for (int i = 0 ; i < arr.length;  i += 2) {
//			
//			System.out.print(arr[i]);
//			 
//		}
	}
}
