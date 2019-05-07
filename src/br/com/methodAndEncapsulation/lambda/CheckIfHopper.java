package br.com.methodAndEncapsulation.lambda;

public class CheckIfHopper implements CheckIfSwim {

	public boolean test(Animal a) {
		return a.canHop();
	}

}
