package ch07.blood;

import java.util.Scanner;

//import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.print("이름 ");
//		String a = s.next();
//		System.out.print("혈액형 ");
//		int g = s.nextInt();
//		System.out.print("나이 ");
//		int c = s.nextInt();
		
		Human human = new Human();
		 human.setName("박효민");
		 human.setType('a');
		 human.setAge(20);

		 /* BloodHouse 객체 생성 */
		 BloodHouse b = new BloodHouse();
		 String result = b.action(human); // action() 메소드 호출 결과 저장
		 /* action() 메소드를 호출하면서 매개변수로 헌혈자 정보 넘겨줌 */
		
		 /* action() 메소드 호출 결과 출력 */
		 
		 System.out.println(result);
}
	
}
