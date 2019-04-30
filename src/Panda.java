import java.util.Arrays;
import java.util.function.Predicate;

public class Panda {

	int age;

	public static void main(String[] args) {
		int a[]= {2,5,9,5,0,3};
		Arrays.sort(a,2,6);
		System.out.println(a);
		System.out.println(a[2]+a[5]);
		if(a.length>=0) {
			a[1]=1;
		}
		System.out.println("teste!"+a[1]);
		Panda p1 = new Panda();
		p1.age = 1;
		check(p1,(Panda p) -> p.age < 5);
	}

	private static void check(Panda panda, Predicate<Panda> pred) {
		String result = pred.test(panda) ? "match" : "not match";
		System.out.print(result);
	}
}
//import java.util.function.Predicate;
//
//public class Panda {
//
//	int age;
//	public static void main(String args[]) {
//		Panda p1 = new Panda();
//		p1.age = 3;
//		check(p1,p->p.age<5);
//	}
//	
//	private static void check(Panda panda,Predicate<Panda> pred) {
//		String result  = pred.test(panda) ? "match" :"not match";
//		System.out.println(result);
//	}
//}
