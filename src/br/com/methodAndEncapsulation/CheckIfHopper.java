package br.com.methodAndEncapsulation;

public class CheckIfHopper implements CheckTrait {

	public boolean test(Animal a) {
		return a.canHop();
	}

}
