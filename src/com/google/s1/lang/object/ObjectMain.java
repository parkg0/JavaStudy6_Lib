package com.google.s1.lang.object;

public class ObjectMain {

	public static void main(String[] args) {
		ObjectStudy1 objectStudy1 = new ObjectStudy1();
		// 참조변수: 객체를 가리키는 주소를 담고 있는 변수

//참조변수명.멤버  -호출
		objectStudy1.study1();

		Car car = new Car();
		car.toString();
//자기 메서드가 아니라 오브젝트 클래스에 상속받은것
		Object obj = car;

		FireCar fc = new FireCar();
		fc.hashCode();
		obj = fc;// fc는 오브젝트타입이다.

		boolean check = car.equals(fc);
		System.out.println(check);
//		Object obj = car;
//
//		FireCar fc = new FireCar();
//		fc.hashCode();
//		obj = fc;// fc는 오브젝트타입이다.
//
//		boolean check = car.equals(fc);
//		System.out.println(check);
	}

}
