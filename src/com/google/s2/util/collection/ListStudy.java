package com.google.s2.util.collection;

import java.util.ArrayList;

public class ListStudy {
	
	private final int NUM=1;
	
	
	public void study3() {
		//ArrayList<> 변수명 = new ArrayList<E>();
		//E=Integer
		ArrayList<Integer> ar2 = new ArrayList<>();
		
	ArrayList<Integer> ar =new ArrayList<Integer>();
	ar2.add(3);
	
	
	ar.add(1);
	ar.add(2);
//	ar.add('b');
//	ar.add(3.12);
//	ar.add("iu");
	
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
	Object obj = 1;
	obj="iu"; //String type인데 다형성때문에가능
	
	//int n =obj; // error
	int n =(Integer)obj;
	
		int num =ar.get(0);
//		String name = (String)ar.get(3);
		
	
		
		
		
		
	}
	
	public void study2() {
		ArrayList ar = new ArrayList();
		int num =1;
		Integer n = num;//autoBoxing 다형성
		ar.add(n);
		ar.add(1);      //autoBoxing 다형성
		
		ar.add('a');    //autoBoxing 다형성
		
		ar.add(3.12);   //autoBoxing 다형성
		
		ar.add("name"); //다형성
		
		String k = "iu"; // String is a Object
		Object obj = k;  //다형성
	}
	
	public void study1() {
		int [] numbers = new int [2];
		ArrayList ar = new ArrayList();//기본 10칸
		
		//대입
		numbers[0]=1;
		numbers[1]=2;
		
		ar.add(1);//0
		ar.add(2);//1
		ar.add(3);//2
		ar.add(1, 100);
		ar.set(0, 2000);
		ar.remove(0);
		ar.clear();
		
		System.out.println(numbers[0]);
		//System.out.println(ar.get(0));
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("List 출력");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
		
		
		
		
	}

}