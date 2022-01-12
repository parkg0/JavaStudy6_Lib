package com.google.s2.util.token;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenStudy {
	public static void main(String[] args) {
		String str="봄,16,여름,32,가을,20,겨울,-14";
		String str = "봄,16,여름,32,가을,20,겨울,-14";

		StringTokenizer st = new StringTokenizer(str, ",");
		// 몇번 잘라야될지 모름?

		// hasMoreTokens() 리턴은 불리언 타입
		ArrayList<SeasonDTO> ar =new ArrayList<>();
		
	StringTokenizer st= new StringTokenizer(str,",");
	//몇번 잘라야될지 모름?
	
	//hasMoreTokens() 리턴은 불리언 타입 
	while (st.hasMoreTokens()) {
		SeasonDTO seasonDTO= new SeasonDTO();
	String token =st.nextToken().trim();//retutn:string  //trim:
	seasonDTO.setName(token);//봄
	
	token= st.nextToken(); //16
	seasonDTO.setGion(Integer.parseInt(token));
	
	System.out.println(seasonDTO.getName());
	System.out.println(seasonDTO.getGion());
	}
		while (st.hasMoreTokens()) {
			SeasonDTO seasonDTO = new SeasonDTO();
			String token = st.nextToken().trim();// retutn:string //trim:
			seasonDTO.setName(token);// 봄

			token = st.nextToken(); // 16
			seasonDTO.setGion(Integer.parseInt(token));

			ar.add(seasonDTO);
			System.out.println(seasonDTO.getName());
			System.out.println(seasonDTO.getGion());
		
		}
		for(int i=0; i<ar.size();i++) {
			SeasonDTO seasonDTO =ar.get(i);
			System.out.println(seasonDTO.getName());
			System.out.println(ar.get(i).getGion());
			
		}

	}

}
