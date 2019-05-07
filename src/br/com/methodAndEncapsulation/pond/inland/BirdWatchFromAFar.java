package br.com.methodAndEncapsulation.pond.inland;

import br.com.methodAndEncapsulation.pond.shore.Bird;

public class BirdWatchFromAFar {

	public void watchBird() {
		Bird bird = new Bird();
		bird.foatInWater();
		System.out.println(bird.text);
	}
}
