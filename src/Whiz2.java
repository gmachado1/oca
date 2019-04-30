interface L{
	public default void print() {
		System.out.println("L");
	}
	static void method() {
		System.out.println("static");
	}
}
class Whiz2 {

	public static void main(String... args) {
		L i = new L(){};
		i.print();
		L.method();
		int g = 10;
		Integer gI=10;
		Double dD=10.0;
		double d=10.0;
		System.out.println();
		System.out.println("compare");
		System.out.println(g==gI);//int=Integer true
		System.out.println(g==dD);//int=Double  true
		System.out.println(g==d);//int=double   true
//		System.out.println(gI==dD);Integer=Double compile
		System.out.println(gI==d);//Integer=double false
		System.out.println(dD==d);//Double=double false
		
		
		
		System.out.println("compare");

//		System.out.println(gI==dD);Integer=Double compile
		System.out.println(gI.equals(dD));//Integer=Double false
		System.out.println(dD.equals(g));//Double=int false
		System.out.println(dD.equals(d));//Integer=Double false
		
	}
}
//(9