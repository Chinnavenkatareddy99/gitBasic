package controlstatements;

public class SwitchDemo {
	public static void main(String[] args) {
		int month=5;
		String season;
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			season="winter";
			break;
		case 3:
		case 4:
		case 5:
			season="summer";
			break;
			
			default:season="dont know";
		}
		System.out.println(season);
		
	}

}
