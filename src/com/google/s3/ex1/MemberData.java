package com.google.s3.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import com.google.s2.util.token.SeasonDTO;

public class MemberData {

	Scanner sc = new Scanner(System.in);

	private String data;

	// 기본생성자 :멤버변수를 초기화하거나 객체가 만들어질때 뭔가를 실행하려
	public MemberData() {
		this.sc = new Scanner(System.in);// ???????/
		this.data = "id1-pw1-name1-id1@gmail.com-20-";
		this.data = this.data + "id2 - pw2 - name2 - name2@naver.com-42-";
		this.data = this.data + "id3 - pw3 - name3 - name3@daum.net-36-";
		this.data = this.data + "id4 - pw4 - name4- name4@daum.net-17-";
		System.out.println(this.data);
	}

	// this.data
	// id1빼내서집어넣고 이름 빼내서 집어넣고배열에 담아서 회원
	// 멤버데이터 3개나와야되고 그걸 배열에 담아서리턴

//	MemberDTO[] memberDTO =new MemberDTO[3];
	public void addMember(ArrayList<MemberDTO>ar) {
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("id를 입력하쇼");
		 memberDTO.setId(sc.next());
		System.out.println("pw를 입력하쇼");
		 memberDTO.setPw(sc.next());
		System.out.println("name을 입력하쇼");
		 memberDTO.setName(sc.next());
		System.out.println("email을 입력하쇼");
		 memberDTO.setEmail(sc.next());
		System.out.println("age를 입력하쇼");
		 memberDTO.setAge(sc.nextInt());
		 ar.add(memberDTO);
		//새로 추가할 MemberDTO생성
		//키보드로부터 id,pw,name, email, age입력받아서
		//MemberDTO의 멤버변수 값으로 대입
		//매개변수로 받은 ar에  MemberDTO 추가
		 
	}

	public MemberDTO removeMember(ArrayList<MemberDTO>ar) {
		MemberDTO memberDTO= null;
		System.out.println("삭제할 아이디 입력하쇼 ");
		String id=sc.next();
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i).getId().equals(id)) {
				memberDTO=ar.remove(i);///////???????????????????????????????????????
				//삭제하고 리턴
				break;
			
			}
		}return memberDTO;
	}
	public ArrayList<MemberDTO> init() {
		//data에 있는 문자열을 StringTokenizer로 파싱해서
		//MemberDTO를 생성해서 멤버변수값으로 대입
		//MemberDTO들을 ArrayList에 담아서 리턴
		System.out.println("MemberEx1 Branch");
		
		StringTokenizer st = new StringTokenizer(this.data, "-");
		ArrayList<MemberDTO> ar = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(st.nextToken().trim());
			memberDTO.setPw(st.nextToken().trim());
			memberDTO.setName(st.nextToken().trim());
			memberDTO.setEmail(st.nextToken().trim());
			memberDTO.setAge(Integer.parseInt(st.nextToken().trim()));
			ar.add(memberDTO);
		}
		
		return ar;
	}

}
