package com.google.s2.util.collection;

import java.util.ArrayList;

public class ListStudy {
private final int NUM=1;
	public void study3() {
		//ArrayList<E> 변수명 = new ArrayList<E>();
		//E = Integer
		ArrayList<String> ar3 = new ArrayList<>();
		ar3.add("fdfa");
		ArrayList<Integer> ar = new ArrayList<>();
		
		ar.add(1); // object type이 들어감
		ar.add(2);
		//ar.add(3.12);
		//ar.add("iu");

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		Object obj = 1;
		//obj = "iu";
		int n = (Integer) obj;
		int num = (int) ar.get(0);
		//String name = (String) ar.get(3);
	}

	public void study2() {
		ArrayList ar=new ArrayList();
	ar.add(1);
		// generic : datatype을 보장 배열처럼 같은 타입을 모으겠따
		// refernce type만가능
		ArrayList ar = new ArrayList();

		// 모든 클래스는 오브젝트임
		//Integer n = num; // autoboxing 레펀스타입 오브젝트임
		ar.add(1);
		ar.add(2);// 내부적로 오토박싱한다음에 집어넣은것

		ar.add('a'); // char type = primitive type을 오브젝트타입에 넣은건 원래 불가능
		// 오토박싱된것CHARACTER type으로

		ar.add(3.12);// double autoboxing
		ar.add("name"); // String class의 부모는object //다형성

		String k = "iu"; // String is a Object
		Object obj = k;

	}
	

	public void study1() {
		int[] numbers = new int[3];
		ArrayList ar = new ArrayList();//기본이 10칸, 미리 만들어놓음 
		ArrayList ar = new ArrayList();// 기본이 10칸, 미리 만들어놓음

		//대입
		// 대입
		numbers[0] = 1;
		numbers[1] = 2;
	
		ar.add(1);//0
		ar.add(2);//1	//return: boolean
		ar.add(3);//2
		ar.add(1,100);

		ar.add(1);// 0
		ar.add(2);// 1 //return: boolean
		ar.add(3);// 2
		ar.add(1, 100);
		ar.set(0, 2000);
		ar.remove(0);
	ar.clear();
		//System.out.println(numbers[0]);
		ar.clear();
		// System.out.println(numbers[0]);
//		System.out.println(ar.get(0));
		
		//배열 
		for(int i=0; i<numbers.length; i++) {

		// 배열
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//리스트
		for(int i=0; i<ar.size();i++) {

		// 리스트
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}
}
