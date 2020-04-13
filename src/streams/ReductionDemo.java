package streams;

import java.util.ArrayList;
import java.util.Optional;

public class ReductionDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(2);
		list.add(3);
		/*Optional<Integer> result = list.stream().reduce((a, b) -> a * b);
		System.out.println(result.get());
		Integer r = list.stream().reduce(1, (a, b) -> a + b);
		System.out.println(r);
		Optional<Integer> pr = list.parallelStream().reduce((a, b) -> a * b);
		System.out.println(pr.get());
		System.out.println("the normal stream result is:");
		list.stream().forEach(x -> System.out.println(x));
		System.err.println("the parallel output is:");
		list.stream().parallel().forEach(x -> System.out.println(x));*/

		Integer combiner = list.parallelStream().reduce(1, (a, b) -> a + b,(a, b) -> a * b);
		System.err.println("combine result:" + combiner);
	}
}
