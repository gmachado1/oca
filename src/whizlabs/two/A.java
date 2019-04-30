package whizlabs.two;

public class A {
	protected int x;
	final static int j=32;
	
	public static void main(String args[]) {
		char c = 'A';
		System.out.println((char)calc(c));
	}

	private static int calc(int c) {
		
		return (c+j);
	}
	
}
