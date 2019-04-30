package br.com.intro;

public class Deer {
	
	public Deer(){
		System.out.println("Dear");
	}
	
	public Deer(int age) {
		System.out.println("Deer age");
	}
	
	public boolean hasHorns() {
		return false;
	}
	
	public static void main(String[] args) {

		Deer deer = new Reindeer(5);
		System.out.println(","+deer.hasHorns());
	}

}
