package ch07.blood;

import java.util.Scanner;

//import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.print("�̸� ");
//		String a = s.next();
//		System.out.print("������ ");
//		int g = s.nextInt();
//		System.out.print("���� ");
//		int c = s.nextInt();
		
		Human human = new Human();
		 human.setName("��ȿ��");
		 human.setType('a');
		 human.setAge(20);

		 /* BloodHouse ��ü ���� */
		 BloodHouse b = new BloodHouse();
		 String result = b.action(human); // action() �޼ҵ� ȣ�� ��� ����
		 /* action() �޼ҵ带 ȣ���ϸ鼭 �Ű������� ������ ���� �Ѱ��� */
		
		 /* action() �޼ҵ� ȣ�� ��� ��� */
		 
		 System.out.println(result);
}
	
}
