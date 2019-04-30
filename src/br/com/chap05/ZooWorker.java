package br.com.chap05;

public class ZooWorker {
	public static void feed(Reptile reptile) {
		float value1 = 102;
		float value2 = (int) 102.0;
		// float value3 =1f * 0.0;
		float value4 = 1f * (short) 0.0;
		// float value5 =1f * (boolean)0;

		System.out.println("Feeding: " + reptile.getName());
	}

	public static void main(String[] args) {
		int[] times [] = new int[3][3];
		 for (int i = 0; i < times.length; i++)
		 for (int j = 0; j < times.length; j++)
		 times[i][j] = i*j;
		 System.out.println(times[2][2]);
		
		
		feed(new Alligator());
		feed(new Crocodile());
		feed(new Reptile());
		System.out.println("------------------referencia---------------------");
		Reptile reptile = new Reptile();
		Reptile crocR = new Crocodile();
		Reptile alligR = new Alligator();
		feed(alligR);
		feed(crocR);
		feed(reptile);
		System.out.println("-------------------------------");
		Crocodile croc = new Crocodile();
		Alligator allig = new Alligator();
		feed(allig);
		feed(croc);
		System.out.println("-------------------------------");
		try {
			Crocodile crocR3 = (Crocodile) crocR;
			System.out.print("ok 1: ");
			feed(crocR3);
			System.out.println("- ok!");
		} catch (ClassCastException e) {
			System.out.println("erro1");
		}
		;
		try {
			Alligator alligR2 = (Alligator) alligR;
			System.out.print("ok 2:");
			feed(alligR2);
			System.out.println("- ok!");
		} catch (ClassCastException e) {
			System.out.println("erro2");
		}
		;
		System.out.println("-------------------------------");
		try {
			Crocodile crocR2 = (Crocodile) reptile;
			System.out.println("ok 1");
			feed(crocR2);
			System.out.println("ok!");
		} catch (ClassCastException e) {
			System.out.println("erro1");
		}
		;
		try {
			Alligator alligR2 = (Alligator) reptile;
			System.out.println("ok 2");
			feed(alligR2);
			System.out.println("ok!");
		} catch (ClassCastException e) {
			System.out.println("erro2");
		}
		;
	}
}
