package com.google.s5.ex1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		System.out.println("Client입니다");
		Socket socket=null;
		Scanner scanner = new Scanner(System.in);	

		try {
			socket = new Socket("192.168.35.24", 8282);
			System.out.println("서버와 접속이 성공!");
			System.out.println("서버로 보낼 메세지 입력");
			String message = scanner.next();
			System.out.println(message);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
