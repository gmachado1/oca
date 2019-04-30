package lambda;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Animal("fish", false, true));
		animalList.add(new Animal("kangoroo", true, false));
		animalList.add(new Animal("turtle", false, true));
		animalList.add(new Animal("Rabbit", true, false));
		
		print(animalList, new CheckIfHopper());
		//print(animals, a -> a.canHop());
	}
	
	private static void print(List<Animal> list, CheckIfHopper check) {
		for(Animal a:list)
			if(check.test(a))
				System.out.println("Animal"+a);
				System.out.println("-_-");
		
	}

}
