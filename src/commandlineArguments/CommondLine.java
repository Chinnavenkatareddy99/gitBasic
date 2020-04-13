package commandlineArguments;

public class CommondLine {
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) {
			System.out.println("args["+i+"]"+args[i]);
		}
	}

}
