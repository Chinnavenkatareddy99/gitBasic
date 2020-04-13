package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingCharctersFromConsole {
	public static void main(String[] args) throws IOException {
		System.out.println("enter characters:");
		BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
		char ch;
do{
		 ch=(char)br.read();
		 System.out.println("out put:"+ch);
}
while(ch!='c');
	}

}
