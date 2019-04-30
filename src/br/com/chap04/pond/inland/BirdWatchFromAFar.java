package br.com.chap04.pond.inland;

import br.com.chap04.pond.shore.Bird;

public class BirdWatchFromAFar {

	public void watchBird() {
		Bird bird = new Bird();
		bird.foatInWater();
		System.out.println(bird.text);
	}
}
