package com.google.s1.lang.string;

import java.util.Scanner;

public class StringStudy1 {

	public void subStringEx1() {
		// 키보드로부터 업로드할 파일명을 입력받음
		// a.txt , b.pdf, iu.jpg
		// jpg, gif,png 면 이미지파일입니다 출력
		// txt, pdf hwp 면 문서파일입니다 출력
		// mp3, wave, ogg 면 음원파일입니다 출력
		// 그외 나머지 알수없는파일입니다 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("파일이름 입력하세요");
		String name = sc.next();

//		String end = name.substring(name.length() - 4, name.length());
//		// System.out.println(end);
//		if (end.equals(".jpg") || end.equals(".gif") || end.equals(".png")) {
//			System.out.println("이미지파일입니다.");
//		} else if (end.equals(".txt") || end.equals(".pdf") || end.equals(".hwp")) {
//			System.out.println("문서파일입니다.");
//		} else if (end.equals(".mp3") || end.equals("wave") || end.equals(".ogg")) {
//			System.out.println("음원파일입니다.");
//		} else {
//			System.out.println("알 수 없는 파일 ");
//		}
//	}
		// abc.test.txt
		String result = name.substring(name.lastIndexOf("." + 1));

		if (result.equals("jpg") || result.equals("gif") || result.equals("png")) {
			System.out.println("이미지파일입니다.");
		} else if (result.equals("txt") || result.equals("pdf") || result.equals("hwp")) {
			System.out.println("문서파일입니다.");
		} else if (result.equals(".mp3") || result.equals("wave") || result.equals(".ogg")) {
			System.out.println("음원파일입니다.");
		} else {
			System.out.println("알 수 없는 파일 ");
		}
	}

	public void subStringTest() {

		String title = "West Side Story";

		String result = title.substring(title.indexOf("S"));

		result = title.substring(5, 9);
		System.out.println(result);
	}

	public void lengthTest() {
		String title = "West Side Story";
		int len = title.length();
		// System.out.println(len);

		String find = "e";
		// title find에 들어가있는 글자가 몇개인지 출력 S
		int count = 0;
		for (int i = 0; i < len; i++) {
			int index = title.indexOf(find, i);
			// fromindex 쓴이유 :찾고 나서 그 다음부터 찾기위해)
			if (index >= 0) {
				count++;
				i = index;
			} else {
				break;
			}
		}

		System.out.println("count:" + count);

		// 한글자씩 출력
//		for(int i=0;i<len;i++) {
//			char a=title.charAt(i);
//			System.out.println(a);
//		}
	}

	public void indexOfTest() {
		String msg = "Hello World";
		int num = msg.indexOf('e', 6);
		// int ch='w'
		// 못찾으면 -1
		// 여러개있으면 맨앞에꺼 찾고 끝남
		// carat =인덱스번호로 문자 찾고
		// indexof
		System.out.println(num);

	}

	public void equalTest() {
		System.out.println("==============");
		String str = "iu";
		String str2 = "iu";
		String str3 = new String("iu");
		String str4 = new String("iu");

		System.out.println(str == str2); // true
		//
		System.out.println(str);
//object-toString(); -객체의 주소 문자열로 반환
//Stirng-toString(); -오버라이딩(실제 값을 찍어주는걸로 바

		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str3 == str4);// false
		System.out.println(str == str3);// false
		System.out.println("==============");
		System.out.println(str.equals(str2));// t
		System.out.println(str3.equals(str4));// t
		System.out.println(str.equals(str3));// t
		// ==은 프리미티브 타입 비교할때 -주소를 비교하는 것
		// 스트링 비교할때는 이퀄스 사용 -실제 값을 비교하는 것
	}
}
