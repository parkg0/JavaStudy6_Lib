package com.google.s3.ex1.member;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {
		//test, 프로그램 실행
		MemberData memberData = new MemberData();
		ArrayList<MemberDTO> members = memberData.init();
		memberData.addMember(members);
		MemberDTO memberDTO=memberData.removeMember(members);//???????????????????????????????????
		if(memberDTO != null) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
		for(int i=0;i<members.size();i++) {
			System.out.println(members.get(i).getId());
			System.out.println(members.get(i).getPw());
			System.out.println(members.get(i).getName());
			System.out.println(members.get(i).getEmail());
			System.out.println(members.get(i).getAge());
			System.out.println("================");
		}
		
	}

}
