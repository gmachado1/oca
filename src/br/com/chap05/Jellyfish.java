package br.com.chap05;

public class Jellyfish extends Animal2 {
	public int length = 5;

	public static void main(String[] args) {
		Jellyfish jellyfish = new Jellyfish();
	//	Jellyfish jellyfish2 = new Animal2();
		Animal2 animal = new Jellyfish();
		Animal2 animal2 = new Animal2();
		System.out.println(jellyfish.length);
		System.out.println(animal.length);
		System.out.println(animal2.length);
	}
}
