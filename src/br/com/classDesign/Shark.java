package br.com.classDesign;

public class Shark extends Fish {
	private int numberOfFins = 8;

	public Shark(int age) {
		super(age);
		super.getAge();
		this.size = 4;
	}

	public void displaySharkDetails() {
		System.out.print("Shark with age: " + getAge());
		System.out.print(" and " + size + " meters long");
		System.out.print(" with " + numberOfFins + " fins");
	}

	public void displaySharkDetails2() {
		System.out.print("Shark with age: " + this.getAge());
		System.out.print(" and " + this.size + " meters long");
		System.out.print(" with " + this.numberOfFins + " fins");
	}

	public void displaySharkDetails3() {
		System.out.print("Shark with age: " + super.getAge());
		System.out.print(" and " + super.size + " meters long");
		System.out.print(" with " + this.numberOfFins + " fins");
	}
	
	public static void main(String args[]) {
		Shark s = new Shark(2);
	}
}
