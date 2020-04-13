package multiThreading;

public class SysDisplay {
	 void display(String name) {
		for(int i=0;i<5;i++) {
			System.out.println("good morning:"+name);
			/*try {
				Thread.sleep(100);
			}
			catch(InterruptedException ie) {
				
			}*/
		}
		
	}

}
