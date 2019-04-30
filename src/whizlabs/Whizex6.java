package whizlabs;

public class Whizex6 {

	public static void main(String args[]) {
		l i = new l() {
		};
		System.out.println(l.x + i.getValue() + "i");
		System.out.println(i instanceof l);
		StringBuilder sb = new StringBuilder();
		int x = 10 % 2;
		int y = 3 / 5 % ++x;
//		int z += 4*x;
		System.out.println(y);
		System.out.println(x);

		char value = 'c';
		do
			System.out.print(value++);
		while (value <= 'f');

		StringBuilder sb2 = new StringBuilder("teste");
		StringBuilder sb3 = new StringBuilder("teste");
		if (sb2 == sb3)
			System.out.println("==");
		if (sb2.equals("teste"))
			System.out.println("equals");
//		if (sb2 == "teste")
//			System.out.println("teste");
		if (sb2.toString() == "teste")
			System.out.println("teste2");
	}
}

interface l {
	int x = 10;

	public default int getValue() {
		return 5;
	}
//	public default String toString() {
//		return "l";
//	}
}
