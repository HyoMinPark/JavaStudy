package ch03;

public class Operation1 {
	public static int getA(int a) {
		a = -a;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a); // -9
		System.out.println(++a); // -8
		return a;
	}
	public static void main(String[] args) {
		int a = 10;
		int result =getA(a);
		System.out.println(result);
		// ���ﶧ ctrl + d ���� ctrl + alt + ȭ��ǥ
//		int a = 10;
//		a = -a;
//		System.out.println(a);
//		System.out.println(a++);
//		System.out.println(a); // -9
//		System.out.println(++a); // -8
	}
}
