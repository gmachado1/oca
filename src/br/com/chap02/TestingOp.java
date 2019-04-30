package br.com.chap02;

public class TestingOp {

	public static void main(String args[]) {
		int y = 4;
		double x = 3 + 2 * --y;
		System.out.println("-------------------inicio-----------------");
		System.out.println(x);
		System.out.println(y);
		System.out.println("---------------zero---------------------");
		int x1 = 3;
		float y1 = ++x1 * 5 / x1-- + --x1;
		System.out.println("x1 is " + x1);
		System.out.println("y1 is " + y1);
		System.out.println("-------primeiro-----------------------------");
		int x2 = 6;
		boolean y2 = (x2 >= 6) || (++x2 <= 7);
		System.out.println(x2);
		System.out.println(y2);
		System.out.println("----segundo--------------------------------");
		int y3 = 1;
		int z3 = 1;
		final int x3 = y3 < 10 ? y3++ : z3++;
		System.out.println(y3 + "," + z3); // Outputs 2,1
		System.out.println("-terceiro-----------------------------------");
		int dayOfWeek = 0;
		switch (dayOfWeek) {
		case 0:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Weekday");
		case 6:
			System.out.println("Saturday");
			break;
		}

		System.out.println("---------------------------------------------");
		int[] values = new int[3];
		values[0] = 10;
		values[1] = new Integer(5);
		values[2] = 15;
		for (int i = 1; i < values.length; i++) {
			System.out.print((values[i] - values[i - 1]) + ",");

		}
		System.out.println("");

		System.out.println("-------array complex--------------------------------------");

		int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 12, 7 } };
		for (int[] mySimpleArray : myComplexArray) {
			for (int i = 0; i < mySimpleArray.length; i++) {
				System.out.print(mySimpleArray[i] + "\t");
			}
			System.out.println();
		}

		System.out.println("-------for each");
		FIRST_CHAR_LOOP: for (int a1 = 1; a1 <= 4; a1++) {
			for (char x4 = 'a'; x4 <= 'c'; x4++) {

				if (a1 == 2 || x4 == 'b')
					continue FIRST_CHAR_LOOP;
				System.out.print(" " + a1 + x4);
			}
		}

	}

}
