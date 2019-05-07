package br.com.methodAndEncapsulation.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TraditionalSearchPredicate {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));

		// System.out.println("pula");
		// test(animals, new CheckIfHopper());
		// System.out.println("nada");
		// test(animals, new CheckIfSwim());
		System.out.println("pula");
		test(animals, a -> a.canHop());
		System.out.println("nada");
		test(animals, a -> a.canSwim());
		System.out.println();
		System.out.println("comecam com F ");
		test(animals, a -> a.getSpecies().startsWith("f"));

	}

	private static void test(List<Animal> animals, Predicate<Animal> checker) {
		for (Animal animal : animals) {
			if (checker.test(animal)) {
				System.out.println(animal + "");
			}
		}
	}


}
