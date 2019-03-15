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
		// 지울때 ctrl + d 복사 ctrl + alt + 화살표
//		int a = 10;
//		a = -a;
//		System.out.println(a);
//		System.out.println(a++);
//		System.out.println(a); // -9
//		System.out.println(++a); // -8
	}
}
