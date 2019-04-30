package br.com.chap04.pond.swan;

import br.com.chap04.pond.shore.Bird;

public class Swan extends Bird {

	public void swim() {
		floatInTheWater();
		System.out.println(text);
	}

	public void helpOtherSwanSwim() {
		Swan other = new Swan();
		other.floatInTheWater();
		System.out.println(other.text);
	}

	public void helpOtherBirdSwim() {
		Bird other = new Bird();
		other.floatInTheWater();
		System.out.println(other.text);
	}
}
