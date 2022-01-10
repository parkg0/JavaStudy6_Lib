package com.google.s1.lang.object;

public class ObjectStudy1 {

	//
	public void study1() {
		System.out.println("Study1 실행");

		// Object 객체를 생성하고 주소 출력
		Object obj = new Object();
		// 참조변수 obj

		System.out.println(obj);
	Car car=new Car();
	System.out.println("car:"+car);
	System.out.println(car.toString());
		// 참조변수의 주소

		// 멤버메서드 선언
		// 접근지정자 [그외지정자] 리턴타입 메서든명([매개변수선언]){}

		// clone 메서드 호출
		// 참조변수명.멤버

		int num = obj.hashCode();
		System.out.println(num);
		
		String string=obj.toString();
		System.out.println(string);
	}

}
