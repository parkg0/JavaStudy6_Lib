package com.google.s2.util.collection;

import java.util.ArrayList;

public class ListStudy {
	public void study2() {
		ArrayList ar=new ArrayList();
	ar.add(1);
	}
	
	public void study1() {
		int[] numbers = new int[3];
		ArrayList ar = new ArrayList();//기본이 10칸, 미리 만들어놓음 

		//대입
		numbers[0] = 1;
		numbers[1] = 2;
	
		ar.add(1);//0
		ar.add(2);//1	//return: boolean
		ar.add(3);//2
		ar.add(1,100);
		ar.set(0, 2000);
		ar.remove(0);
	ar.clear();
		//System.out.println(numbers[0]);
//		System.out.println(ar.get(0));
		
		//배열 
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//리스트
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}
}
