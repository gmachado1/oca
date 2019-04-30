package br.com.chap04.lambda;

public class CheckIfHopper implements CheckIfSwim {

	public boolean test(Animal a) {
		return a.canHop();
	}

}
