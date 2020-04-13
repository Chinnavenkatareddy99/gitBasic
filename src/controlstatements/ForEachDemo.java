package controlstatements;

public class ForEachDemo {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3 };
		int sum = 0;
		for (int x : num) {
			// System.out.println(x);
			sum += x;
		}
		System.out.println(sum);
	}

}
