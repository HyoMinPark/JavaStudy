package ch04;

import java.util.Calendar;

public class CheckTime {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);// 분,년
		System.out.println(hour);
		
		if(hour >= 12) {
			System.out.println("오후");
		} else {
			System.out.println("오전");
		}
		
		int min = cal.get(Calendar.MINUTE);
		System.out.println(min);
	}
}
