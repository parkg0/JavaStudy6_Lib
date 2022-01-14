package com.google.s3.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.google.s3.ex1.Student.StudentDTO;
import com.google.s3.ex1.Student.StudentData;
import com.google.s3.ex1.member.MemberDTO;
import com.google.s3.ex1.member.MemberData;

public class Ex1Main {

	public static void main(String[] args) {
		MemberData memberData = new MemberData();
		StudentData studentData = new StudentData();
		MemberDTO memberDTO= new MemberDTO();
		
		//회원들의 정보 모음 
		ArrayList<MemberDTO> ar=memberData.init();//네명올겨 
		Map<String, StudentDTO> map=studentData.addStudent(ar);//을 이쪽으로 보내려고함 
		Set<String> keys = map.keySet();
		
		//반복문 돌리기 위해 바꿔줌 열거형으로 
		Iterator<String> k = keys.iterator();
		
		while(k.hasNext()) {
			String key = k.next();
			StudentDTO studentDTO = map.get(key);
			System.out.println("key:"+key);
			System.out.println(studentDTO.getId());
			System.out.println(studentDTO.getName());
			System.out.println(studentDTO.getKor());
			System.out.println(studentDTO.getEng());
			System.out.println(studentDTO.getMath());
			System.out.println(studentDTO.getTotal());
			System.out.println(studentDTO.getAvg());
			System.out.println("=====================");
		}
		
		System.out.println(map);
		
//		for(int i=0; i<map.size();i++) {
//			
//			System.out.println(ar.get(i).getName());
//			map.get(ar.get(i).getName());
//			map.get(ar.get(i).getName());
//		System.out.println(map.get(ar.get(i).getName()));
//		
	
	}
	
}
