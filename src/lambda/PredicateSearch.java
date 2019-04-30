package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSearch {

	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Animal("fish", false, true));
		animalList.add(new Animal("kangoroo", true, false));
		animalList.add(new Animal("turtle", false, true));
		animalList.add(new Animal("Rabbit", true, false));

		print(animalList, a -> a.isCanHop());
		System.out.println();
		String year = "Senior";
		switch (year) {
		
		case "Freshman":
		
		case "Sophomore":
		case "Junior":
			System.out.print("See you next year");
		default:System.out.print("tes");
			break;
		case "Senior":
			System.out.print("Congratulations");
		
		}
	}

	private static void print(List<Animal> list, Predicate<Animal> check) {
		for (Animal a : list)
			if (check.test(a))
				System.out.println("Herbívoro!" + a);

		int x = 10 % 2;
		int y = 3 / 5 + ++x;
		int z = 4 * x;
		System.out.print(x + "," + y + "," + z);

	}
}
