package br.com.chap04.pond.shore;

public class BirdWatcher {

	public void watchBird(){
		Bird bird = new Bird();
		bird.floatInTheWater();
		System.out.println(bird.text);
	}
}
