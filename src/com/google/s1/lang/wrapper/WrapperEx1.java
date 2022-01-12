package com.google.s1.lang.wrapper;

import java.util.Scanner;

//스트링클래스 메서드와 래퍼클래스 메서드 활용 
public class WrapperEx1 {
	private Scanner sc = new Scanner(System.in);
	// 내부에서만 쓰도록
	// 정상적인주민번호인지 판별하는 프로그램
	// 키보드로부터 주민등록번호를 입력받음
//9 7 1 2 2 4 - 1 2 3 4 5 6 7
//* 2 3 4 5 6 7   8 9 2 3 4 5 마지막번호는 체크용번호 
//18 21 4 10 12 28  8 18 6 12 20 24
//결과 모두 더한 값이 예를 들어 122가 나왔다

	// 2.모두 더한 결과값을 11로 나누어서 나머지를 구함
	// 122/11 =11...1

	// 3.11로 나눈 나머지값을 11에서 뺌 그 값을 체크용 번호와 같은지 비교하기
//11-1=10 =7

	// 4.만약에 결과값이 두자리라면 결과값을 다시 10으로 나누어서 그 나머지값을
	// 체크용번호랑 같은지 비교
	// 10/10 =1...0==7
	// ==============================================================================
	public void ex2() {

		System.out.println("주민번호를 입력해주세요 ******-******* -까지~!	");
		String number = sc.next();

		String[] num = number.split("");// - 없애
		// String type 배열에 {9,9,0,9,0,9,-,1,2,3,4,5,6,7,} 있음
		int[] num2 = new int[13];// "-" 뺀 각각의 번호 배열
		int[] num3 = new int[13];// 곱한 값
		for (int i = 0; i < 13; i++) {
			if (i < 6) {
				num2[i] = Integer.parseInt(num[i]);

			} else if (i >= 6) {// - 빼
				num2[i] = Integer.parseInt(num[i + 1]);

			} else if (i == 13) {
				break;
			}

		}

		int mul = 1; // 곱할 값
		int hap = 0; // 곱한 값들의 합
		for (int i = 0; i < 12; i++) {
			num3[i] = num2[i] * ++mul;
			hap += num3[i];

			if (mul == 9) {
				mul = 1;
			}
		}

		if (Integer.parseInt(num[13]) == 11 - (hap % 11)) {
			System.out.println("정상");
		} else if (9 < 11 - (hap % 11)) {
			if (Integer.parseInt(num[13]) == ((11 - (hap % 11)) % 10)) {
				System.out.println("정상");
			}
		} else {
			System.out.println("비정상");
		}

	}

	// ==============================================================================

	public void ex1() {

		System.out.println("주민번호를 입력해주세요 ******-******* -까지~!	");
		String number = sc.next();
		// 남녀
		char sex = number.charAt(7);
		if (sex == '1') {
			System.out.println("남자입니다.");
		} else if (sex == '2') {
			System.out.println("여자입니다.");
		} else if (sex == '3') {
			System.out.println("2000년대 이후 남자입니다.");
		} else if (sex == '4') {
			System.out.println("2000년대 이후 여자입니다.");
		}

		// 나이
		int birth = Integer.parseInt(number.substring(0, 2));
		int age = 122 - birth;
		if (sex == '1' || sex == '2') {
			System.out.println("나이:" + age);
		} else if (sex == '3'|| sex == '4') {

			System.out.println("나이:"+ (age-100));

		}

		// 계절
		int month = Integer.parseInt(number.substring(2, 4));
		System.out.println(month);
		if (month == 3 || month == 4 || month == 5) {
			System.out.println("봄에 태어남 ");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("여름에 태어남 ");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("가을에 태어남 ");
		} else if (month == 12 || month == 1 || month == 2) {
			System.out.println("겨울에 태어남 ");
		}
//	if(number.charAt(7)) {

		// 키보드로부터 주민등록번호를 입력받음
		// 앞에6자리-1234567
		// 0101010-1919191 형식
		// 뒤에 첫번재 1or2 남자 여자
		// 3or4 2000년대 이후 남자 여자

		// 나이를 대충 계산 현재년도 -출생년도

		// 남자인지 여자인지 출력
		// 3월에서 5월에 태어났으면 계절 봄
		// 678 -여름
		// 91011-가을
		// 1212-겨울

//	}//if

	}// ex1 메서드
}// class