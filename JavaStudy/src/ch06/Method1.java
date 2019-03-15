package ch06;

public class Method1 {
	public static int checkGrade(int num) {
		if (num > 10) {
			num = 1;
		}else if(num > 7) {
			num= 2;
		}else if (num > 4) {
			num = 3;
		}else {
			num =4;
		}
		return num;
	}public static void main(String[] args) {
		System.out.println (checkGrade(5)+"등급");
		System.out.println (checkGrade(2)+"등급");
		System.out.println (checkGrade(10)+"등급");
		System.out.println (checkGrade(7)+"등급");
	}
	   		
		
	}

