package com.google.s3.ex1.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.google.s3.ex1.member.MemberDTO;

public class StudentData {
	
	Scanner sc = new Scanner(System.in);
	public Map<String, StudentDTO> addStudent(List<MemberDTO> ar) {
		HashMap<String, StudentDTO> map = new HashMap<>();
		
		
		for (int i = 0; i < ar.size(); i++) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setId(ar.get(i).getId());
			studentDTO.setName(ar.get(i).getName());
			
			System.out.println("국어 성적을 입력하세요.");
			studentDTO.setKor(sc.nextInt());
			System.out.println("영어 성적을 입력하세요.");
			studentDTO.setEng(sc.nextInt());
			System.out.println("수학 성적을 입력하세요.");
			studentDTO.setMath(sc.nextInt());
		

			int total = studentDTO.getEng() + studentDTO.getKor() + studentDTO.getMath();
			studentDTO.setTotal(total);
			double avg = total / 3.0;
			studentDTO.setAvg(avg);
			
			map.put(studentDTO.getId(), studentDTO);

		}
		// 키보드로부터 member의 수만큼 성적정보를 입력받음
		// 이 정보들을 StudentDTO에 넣어줘 =멤버디티오의 갯수만큼 만들어짐
		// 아이디하고 네임은 회원의 정보를쓴다
		// map의 키는 id value는 StudentDTO
		// 출력은 나름대로 해보기 어떻게든
		return map;
	}

}
