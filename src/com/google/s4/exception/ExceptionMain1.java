package com.google.s4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int num = 200;
		try {
			int age = sc.nextInt();
			// throw new InputMismatchException(); 자동으로 객체를 만들어줌

			int result = num / age;// ten
			// throw new ArithmeticException(); // 자동으로 생성함

			System.out.println("age:" + age);
			System.out.println("result:" + result);
		} catch (InputMismatchException exception) {
			System.out.println("숫자만 입력해라");

		} catch (ArithmeticException exception) {
			System.out.println("0으로 나눌 수 없음");
		} catch (Exception exception) {
			System.out.println("알 수 없는 예외 발생");
		}catch(Throwable exception) {
			System.out.println("모든 예외는 여기서 처리");
		}
	}

}
