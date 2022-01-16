package com.google.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy4 {

	public static void main(String[] args) {
		// 현재시간
		Calendar ca = Calendar.getInstance();
		//내가 태어난날로 셋팅
		Calendar ca2 = Calendar.getInstance();
		ca2.set(1998,7, 3);
		System.out.println(ca2.getTime());
		
	
		long l1=ca.getTimeInMillis();
		long l2=ca2.getTimeInMillis();
		
		long result= (l1-l2)/(1000*60*60*24);
		System.out.println(result);
		//며칠째 살고있는지 
		System.out.println(8503/365);
		//365.2425
		
		//나이 계산
		
		

	}

}
