package com.google.s1.lang.string.ex1;

import java.util.ArrayList;

import com.google.s3.ex1.MemberDTO;

public class MemeberMain {

	public static void main(String[] args) {
		//메인메서드: test,프로그램 실행
		
		MemberData memberData=new MemberData();
		 
	MemberDTO[] members =memberData.init();
	
	for(int i=0; i <members.length;i++) {
		System.out.println(members[i].getId());
		System.out.println(members[i].getPw());
		System.out.println(members[i].getName());
		System.out.println(members[i].getAge());
		System.out.println(members[i].getEmail());
		ArrayList<MemberDTO> members =memberData.init();
		
		memberData.addMember(members);
	
		for(int i=0; i <members.size();i++) {
			System.out.println(members.get(i).getId());
			System.out.println(members.get(i).getPw());
			System.out.println(members.get(i).getName());
			System.out.println(members.get(i).getEmail());
			System.out.println(members.get(i).getAge());
			
	}

	}

}
