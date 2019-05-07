package br.com.methodAndEncapsulation.pond.goose;

import br.com.methodAndEncapsulation.pond.shore.Bird;
import br.com.methodAndEncapsulation.pond.swan.Swan;

public class Goose extends Bird {

	public void helpGooseSwim() {
		Goose other = new Goose();
		other.floatInTheWater();
		System.out.println(other.text);
	}

	public void helpOtherGooseSwim() {
		Swan other = new Goose();
		other.floatInTheWater();
		System.out.println(other.text);
	}

}
