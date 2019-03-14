package ch04;

public class If {
	public static void main(String[] args) {
		
		// 주석처리 법위지정후 : crtl + /
		int score = 87;
		if(score >= 90) {
		 System.out.println("A");
		} 
		else if(score >= 80) { //(score < 90 && >= 80)원래는 써야하지만 않써도 됨
		 System.out.println("B");
		} 
		else if(score >= 70) {
		 System.out.println("C");
		} 
		else if(score >= 60) {
		 System.out.println("D");
		} 
		else {
		 System.out.println("F");
		}
		
		//오류
//		int score = 87;
//		if(score >= 60) {
//		 System.out.println("D");
//		} else if(score >= 70) {
//		 System.out.println("C");
//		} else if(score >= 80) {
//		 System.out.println("B");
//		} else if(score >= 90) {
//		 System.out.println("A");
//		} else {
//		 System.out.println("F");
//		}
	}
}


