package com.google.s3.ex4.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarStudy3 {

	public static void main(String[] args) {
		// 1초 =1000밀리세컨즈
		// 1분 = 60초
		// 1시간 = 60분
		// 하루 = 24시간
		// 1년 = 365일
		// 1년 = ? 밀리세컨즈

		
		System.out.println(1000 * 60 * 60 * 24 * 365);
		// 1471228928

		// 현재시간
		Calendar ca = Calendar.getInstance();

		// 두시간 뒤 시간
		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.HOUR_OF_DAY, 17);

		System.out.println(ca.getTime());
		System.out.println(ca2.getTime());

		// 둘간의 시간 차를 구하려함
		// 둘다 밀리세컨즈로 바꾸고 빼
		long l1 = ca.getTimeInMillis();
		long l2 = ca2.getTimeInMillis();
		
		System.out.println(l1);
		System.out.println(l2);
		
		long result = l2 - l1;
		System.out.println(result);
		
		long hour=result/(1000*60*60);
		System.out.println(hour);

	}

}
