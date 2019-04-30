package other;

class Sparrow extends Bird {
}

public abstract class Bird {
	public static void main(String[] args) {
		Bird b = new Sparrow();
		Sparrow s = new Sparrow();
		Sparrow s2 = new Sparrow();
		if (b == s) {
			System.out.println("==");
		}
		if (b.equals(s)) {
			System.out.println("bird");
			Sparrow s1 = new Sparrow();
		}
		if (b.equals(s2))
			System.out.println("sparrow");
	}
}