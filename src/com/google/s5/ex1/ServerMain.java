package com.google.s5.ex1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		System.out.println("server입니다");
		ServerSocket serverSocket=null; 
		Socket socket=null;
		//소켓 만들어줌
		
		try {
			System.out.println("클라이언트의 접속을 기다리는 중 ");
			serverSocket= new ServerSocket(8282);//접속 준비 
			socket=serverSocket.accept();//접속한 client와 연결
			System.out.println("접속한 client와 1:1로 연결 완료");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
