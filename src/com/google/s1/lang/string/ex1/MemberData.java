package com.google.s1.lang.string.ex1;

public class MemberData {

	private String data;

	// 기본생성자 :멤버변수를 초기화하거나 객체가 만들어질때 뭔가를 실행하려
	public MemberData() {
		this.data = "id1-pw1-name1-id1@gamil.com-";
		this.data = this.data + "id2-pw2-name2-id2@naver.com-";
		this.data = this.data + "id3-pw3-name3-id3@daum.net";
		System.out.println(this.data);
	}

	// this.data
	// id1빼내서집어넣고 이름 빼내서 집어넣고배열에 담아서 회원
	// 멤버데이터 3개나와야되고 그걸 배열에 담아서리턴

//	MemberDTO[] memberDTO =new MemberDTO[3];

	public MemberDTO[] init() {
			String[] datas=this.data.split("-");
			
			MemberDTO[] members = new MemberDTO[3];
			
			int index=0;
			
			for(int i=0;i<3;i++) {
		MemberDTO memberDTO= new MemberDTO(); 
		memberDTO.setId(datas[index]); //datas[0] 4 8
		memberDTO.setPw(datas[++index]); //datas[1]	5 9
		memberDTO.setName(datas[++index]); //datas[2] 6	 10
		memberDTO.setEmail(datas[++index]); //datas[3] 7 
		members[i]=memberDTO;
		index++;
		//++index인 이유는 먼저 플러스하고 계산해야되기때문 . 뒤에오면 안됨 
 }
			return members;
//		if(i%4==1) {
// System.out.println(data[i]);
// dto.setId(data[i]);
//		}
//	}
//	return dtos;
}
}