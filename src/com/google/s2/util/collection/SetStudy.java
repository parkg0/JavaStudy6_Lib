package com.google.s2.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetStudy {
	
	public void study4() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		Iterator<Integer> it=hs.iterator();
		
		//iterator안에 요소가 있는지 없는지 검사 
		while(it.hasNext()) {
			int num=it.next();
			System.out.println(num);
		}
	}
	
	public void study3() {
		Random random = new Random();
		HashSet<Integer> hs = new HashSet<>();
		while(hs.size()!=6) {
			int num= random.nextInt(45)+1;
			hs.add(num);
		}
		System.out.println(hs);
	}
		
	public void study2() { //숙제 중복되지 않은 값 보장하기
		//뽑았을때 중복이면 아이가 증가가 안되는게 point	
		//Random
		Random random = new Random();
		
		//Lotto 번호를 랜덤 1-45 6개 
		ArrayList<Integer> ar = new ArrayList<>();
		
		for(int i=0; i<6;i++) {
		 int num=random.nextInt(45)+1;
		 ar.add(num);
		}
		 
		 
		 System.out.println(ar);
		//int num = random.nextInt(10);// 0~10미만
		
		//출력
		
	}

	public void study1() {

		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(1);
		hs.remove(2);//  Integer 2
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(100);
		ar.add(200);
		ar.add(100);
		
		System.out.println(ar);
		System.out.println(hs);
		System.out.println(hs.size());
	}
}
