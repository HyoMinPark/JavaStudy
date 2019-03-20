package ch07;

public class MemberMain {
	public static void total(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	
	public static void printData(Member m) {
		System.out.println(m.id);
		System.out.println(m.name);
	}
	
	public static void printData(Member[] m) {
		for(int i = 0; i < m.length; i++) {
			printData(m[i]);
		}
	}
	
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.id = "ggoreb";
		m1.name = "park";
		printData(m1);
		
		Member m2 = new Member();
		m2.id = "seoreb";
		m2.name = "kim";
		printData(m2);
	}
}
