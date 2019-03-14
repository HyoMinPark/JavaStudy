package ch04;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		//달력 기능(라이브러리) 사용
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		
		// 달력의 날짜를 지정
		cal.set(2019, 2, 1);
		int dayOfweek = cal.get(Calendar.DAY_OF_WEEK);
		int lastdate = cal.getActualMaximum(Calendar.DATE);
		
		// 달력의 요일 제목 출력하기
		System.out.println("SU MO TU WE TH FR SA");
		System.out.println("====================");
		
		// 매월 1일의 시작요일 맞춰주기(여백)
		for(int i = 1; i < dayOfweek; i++) {
			System.out.print("   ");
		}
		
		// 실제 날짜 출력하기
		for(int i =1; i <= lastdate; i++) {
			if(i < 10) {
				System.out.print("0" + i + " ");
			} else {
				System.out.print(i + " ");
			}
			if(dayOfweek % 7 == 0) {
				System.out.println();
		}
			dayOfweek++;
	}
//		System.out.println(year);
//		System.out.println(month);
//		System.out.println(date);
//		System.out.println(dayOfweek);
//		System.out.println(lastdate);
	}
}
