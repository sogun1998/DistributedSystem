package com.hust.soict.ducanh.client_server;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("127.0.0.1", 9898);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		System.out.println(in.readLine());
		Scanner scanner = new Scanner(System.in);
		while (true){
			  System.out.println("Enter array: ");
			  String input = scanner.nextLine();
			  if (input == null || input.isEmpty()){
			    System.out.println("Completed!");
			    break;
			  }else {
			     out.println(input);
			     System.out.println("Array:" +in.readLine());
			  }
			}

		socket.close();
		scanner.close();

	}

}
