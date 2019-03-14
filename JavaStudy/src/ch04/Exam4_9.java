package ch04;

import java.util.Scanner;

public class Exam4_9 {
		public static void main(String[] args) {
			System.out.println("숫자를 입력하시오. =>");
		//1 ~ n 사이의 숫자 중 8을 포함하고 있는 숫자갯수를 출력
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			int count = 0;
		 for(int i = 1; i <= num ; i++) {
			 int n = i;
			 while(n > 0) {
				 int n2 = n % 10;          
				 if( n2 == 8) {                      //횟수세기
					 count ++; 
				 }
				 n = n / 10;
			 }
		 }
		 System.out.println(count);
    }
}