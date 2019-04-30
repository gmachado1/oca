package br.com.intro;

abstract class Otter implements Animal, Mammal {
	boolean b1, b2;
	String s1 = "2", s2;
	double d1;
	double d2;
	int i4, i2;

	public static void main(String[] args) {
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^true);
		System.out.println(false^false);
		byte a=40,b=50;
		byte sum = (byte)(a+b);
		System.out.println(sum);
		Integer e;
		int e2;
		Integer.parseInt(null);
		Integer.valueOf(null);
		
		
		
		
	}
	
	public String getName() {
		int x = 0;
		//String message = x > 10 ? "Greater than" : false;
		return "message";
		
	}
	/// public abstract String getName();
}
