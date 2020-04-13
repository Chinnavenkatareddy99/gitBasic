package methods;

public class Basic {
		double width;
		double lenthg;
		double height;
		
		void volume() {
			System.out.println("volume is:"+(width*lenthg*height));
		}
		
		public static void main(String[] args) {
			Basic b=new Basic();
			b.width=12;
			b.height=15;
			b.lenthg=5;
			b.volume(); 
			
		}
}
