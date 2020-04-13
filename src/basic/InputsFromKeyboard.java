package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class InputsFromKeyboard {
	public static void main(String[] args) throws IOException {
		/*System.out.println("enter name:");
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		System.out.println(str);
		
		int roll=Integer.parseInt(bf.readLine());
		*/
		Properties p = System.getProperties();
		p.list(System.out);
	byte b=50;
	byte c=40;
	int d=c*b;
		
	}

}
