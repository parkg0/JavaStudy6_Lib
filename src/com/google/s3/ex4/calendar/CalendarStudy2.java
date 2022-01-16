package com.google.s3.ex4.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarStudy2 {

	public static void main(String[] args) {
		// 현재시간
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime());
		// 시간변경 - 미래시간으로 설정 
		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.YEAR, 2023);
		ca2.set(Calendar.MONTH, 1);//2월 
		ca2.set(Calendar.DATE, 15);
		System.out.println(ca2.getTime());

	}

}
