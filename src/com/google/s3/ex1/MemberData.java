package com.google.s3.ex1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.google.s1.lang.string.ex1.MemberDTO;
import com.google.s2.util.token.SeasonDTO;
public class MemberData {
	

	private String data;

	// 기본생성자 :멤버변수를 초기화하거나 객체가 만들어질때 뭔가를 실행하려
	Scanner sc=new Scanner(System.in);
	public MemberData() {
		this.data = "id1-pw1-name1-id1@gamil.com-20-";
		this.data = this.data + "id2-pw2-name2-id2@naver.com-42-";
		this.data = this.data + "id3-pw3-name3-id3@daum.net-36-";
		this.data = this.data + "id4-pw4-name4-id4@daum.net-36-";
		System.out.println(this.data);
	}
	public void addMember(ArrayList<MemberDTO> ar) {
	MemberDTO memberDTO = new MemberDTO();
	System.out.println("id를 입력하세요");
	memberDTO.setId(sc.next());
	System.out.println("pw를 입력하세요");
	memberDTO.setPw(sc.next());
	System.out.println("name를 입력하세요");
	memberDTO.setName(sc.next());
	System.out.println("email을 입력하세요");
	memberDTO.setEmail(sc.next());
	System.out.println("나이를 입력하세요");
	memberDTO.setAge(sc.nextInt());
	
	ar.add(memberDTO);
	
	
	
		//새로 추가할 MemberDTO 생성
				//키보드로부터 id,pw,이름,이메일,나이 입력받아서
				//MemberDTO의 멤버변수 값으로 대입
				//매개변수로 받은 ar에 MemberDTO추가 
			}

	// this.data
	// id1빼내서집어넣고 이름 빼내서 집어넣고배열에 담아서 회원
	// 멤버데이터 3개나와야되고 그걸 배열에 담아서리턴

//	MemberDTO[] memberDTO =new MemberDTO[3];

	public ArrayList<MemberDTO> init() {
		//data에 있는 문자열을 StringTokenizer로 파싱해서
				//MemberDTO를 생성해서 멤버면수값으로 대입
				//MemberDTO들을  ArrayList에 담아서 리턴
	System.out.println("memeberex1브랜치");
	}
		
			//data에 있는 문자열을 StringTokenizer로 파싱해서
	
	StringTokenizer st = new StringTokenizer(this.data,"-");
	ArrayList<MemberDTO> ar = new ArrayList<>();
	
	while(st.hasMoreTokens()) {
		//MemberDTO를 생성해서 멤버면수값으로 대입
		//MemberDTO들을  ArrayList에 담아서 리턴
 
			return null;
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(st.nextToken().trim());
		memberDTO.setPw(st.nextToken().trim());
		memberDTO.setName(st.nextToken().trim());
		memberDTO.setEmail(st.nextToken().trim());
		memberDTO.setAge(Integer.parseInt(st.nextToken()));
		ar.add(memberDTO);
	}
			return ar;
	}
//		if(i%4==1) {
// System.out.println(data[i]);
// dto.setId(data[i]);
//		}
//	}
//	return dtos;

//		String[] datas = this.data.split("-");
//
//		MemberDTO[] members = new MemberDTO[4];
//
//		
//		int index = 0;
//		for (int i = 0; i < 4; i++) {
//			MemberDTO memberDTO = new MemberDTO();
//			memberDTO.setId(datas[index++]); // datas[0] 4 8
//			memberDTO.setPw(datas[index++]); // datas[1] 5 9
//			memberDTO.setName(datas[index++]); // datas[2] 6 10
//			memberDTO.setEmail(datas[index++]); // datas[3] 7
//			memberDTO.setAge(Integer.parseInt(datas[index++]));
//		
//			members[i] = memberDTO;
////			index++;
//			// ++index인 이유는 먼저 플러스하고 계산해야되기때문 . 뒤에오면 안됨
//		}
//		return members;

//}
}

