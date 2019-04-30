package br.com.chap05;

class Fish {
	protected int size;
	private int age;

	public Fish(int age) {
		this.age = age;
	}

	public int getAge() {
		System.out.println("age method");
		return age;
	}
}