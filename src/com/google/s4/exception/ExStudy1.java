package com.google.s4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExStudy1 {
	
	public void ex1() throws InputMismatchException,ArithmeticException, Exception{ 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		int num1 = sc.nextInt(); //0 또는 문자 넣으면 exception	
		//throw new InputmismatchException(); 
		int num2 = 10;
		
		int num3 = num2/num1;
		//throw new InputmismatchException(); 
		
		System.out.println(num3);
		
				
		
	}

}
