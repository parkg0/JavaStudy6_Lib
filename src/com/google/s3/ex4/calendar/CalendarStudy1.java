package com.google.s3.ex4.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarStudy1 {

	public static void main(String[] args) {
		// Calenedar은 추상 클래스
		// GregorianCalendar가 Calendar 클래스 상속
		// Calendar의 메서드는 GregorianCalendar에도 있다.

		// 현재 날짜와 시간정보를 가지는 객체를 생성
		GregorianCalendar gc = new GregorianCalendar();

		// Calenedar객체는 못만들어도 선언은 가능( Calenedar은 추상 클래스)
		Calendar calendar = new GregorianCalendar();
		// =위 코드와 아래 코드는 같다.
		Calendar ca = Calendar.getInstance(); // Gregorian
//		System.out.println(gc);
//		System.out.println(calendar);
//		System.out.println(ca);
//		// 셋 다 같은 결과가 나옴

		int y = ca.get(Calendar.YEAR);
		int m = ca.get(Calendar.MONTH);
		int d = ca.get(Calendar.DATE);
		int h = ca.get(Calendar.HOUR);
		int hh = ca.get(Calendar.HOUR_OF_DAY);
		int min = ca.get(Calendar.MINUTE);
		int s = ca.get(Calendar.SECOND);
		int ms = ca.get(Calendar.MILLISECOND);
		// 천분의 1 초
		// 1000ms =1s

		long millis = ca.getTimeInMillis();

		Date date = ca.getTime();

		System.out.println("y:" + y);
		System.out.println("m:" + (m + 1));
		System.out.println("d:" + d);
		System.out.println("h:" + h);
		System.out.println("hh:" + hh);
		System.out.println("min:" + min);
		System.out.println("s:" + s);
		System.out.println("ms:" + ms);
		System.out.println("millis:" + millis);
		System.out.println(date);
		// 월만 0부터 시작 /1월이 0임

	}

}
