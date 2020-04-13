package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadingStrings {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		System.out.println("enter the strings:");
		String str = br.readLine();
		System.out.println(str);
	}

}
