class Animal {
	Animal() {
		super();
	}
	public void teste() {
		System.out.println("teste a");
	}
}
class Bird extends Animal{
	Bird(String name) {
		System.out.println(name);
	}
	Bird(){
		System.out.println("unknown");
	}
	public void teste() {
		System.out.println("teste B");
	}
}
class Whiz {
	int j;
	static int i;
	
	Whiz(){
		System.out.println("--");
		System.out.println(i);
		j=i++;
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String args[]) {
		new Bird("parrot");
		Animal a = new Bird();
		a.teste();
		
		Whiz w = new Whiz();
		Whiz w1 = new Whiz();
		Whiz w2 = new Whiz();
		System.out.println("w.i-"+w2.i);
		System.out.println("w.j-"+w2.j);
		int k = 3;
		int kd = k>>1;
		int kdt = k>>2;
		int kdts = k>>3;
		float pp = 10f;
		System.out.println(pp);
		if(k!=3&&k++==1);
		if(k==11|++k==4)System.out.println("te");
		System.out.println();
		
		System.out.println("k ===>" + k);
		System.out.println("kd ===>" + kd);
		System.out.println("kdt ===>" + kdt);
		System.out.println("kdts===>" + kdts);
		for (int i = 0; args.length>++i;) {
			System.out.println(i);
			System.out.println(args[i]);
			
		}
	}
	
}
