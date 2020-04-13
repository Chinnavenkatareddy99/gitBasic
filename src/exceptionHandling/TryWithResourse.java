package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourse {
	static void stuff() {
		try (BufferedReader br=new BufferedReader(new FileReader("abc.text")) ){
			
		}
		catch(IOException io) {
			io.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
	}

}
