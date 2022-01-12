package com.google.s1.stringBuffer;

public class StringBufferMain {

	public static void main(String[] args) {
		//iu lee
		
		StringBuffer sb= new StringBuffer();
		sb.append("iu");
		sb.append("lee");
		System.out.println(sb.toString());
		//참조변수 출력하면 주소가 나와야됨 근데 iu와 lee가 나옴
		// 그렇다는건 toString을 오버라이딩한것이라는걸 알수있음
		//참조변수 찍으면 toString 메서드 자동 출력
		String name="iu";
		String name2="lee";
		name= name+name2;
		System.out.println(name);
		//결과는 같지만 내부적으로는 다름 append는 하나의 객체에 내용만 바뀌는것
		//아래는 객체를 여러개만들어냄
		name=sb.toString();
		//error이유 : 데이터타입이 달라서 
		

	}

}
