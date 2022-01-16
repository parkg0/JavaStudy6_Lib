package com.google.s3.ex4.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarStudy5 {
	
	public static void main(String[] args) {
		Calendar ca= Calendar.getInstance();
		//카카오택시
		//30분 소요 예정
		// 도착예정시간은?
		//1000*60*30 =30분 
		System.out.println(ca.getTime());
		long time = ca.getTimeInMillis();
		time = time+1000*60*30;
		
		ca.setTimeInMillis(time);
		System.out.println(ca.getTime());
		
	ca.roll(Calendar.MINUTE, 70);
	System.out.println(ca.getTime());
	
	ca.add(Calendar.MINUTE, 70);
	System.out.println(ca.getTime());
	
	//2022년 01월 14일 - 16시44분11초 표현하고싶다/
	//캘린더 클래스에서 하나하나 꺼내와서 +??
String pattern ="yyyy년 MM월 dd일 - HH:mm:ss";

SimpleDateFormat sd = new SimpleDateFormat(pattern);
String r=sd.format(ca.getTime());
System.out.println(r);

pattern="yyyy-MM-dd (E)";
sd.applyPattern(pattern);

System.out.println(sd.format(ca.getTime()));



	}
	
	
}
