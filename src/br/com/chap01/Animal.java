package br.com.chap01;

public class Animal {
	String name;

	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}
	
	public static void main(String args[]) {
		System.out.println("Bem vindo!");
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
}