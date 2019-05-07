
package br.com.apis;

import java.util.ArrayList;

public class QuestionsExam {

	public static void main(String[] args) {
		int numFish = 4;
		String fishType = "tuna";
		String anotherFish = numFish + 1 + "";
		System.out.println(anotherFish + " " + fishType);
		System.out.println(numFish + " " + 1);

		String s1 = "java";
		StringBuilder s2 = new StringBuilder("java");
		if (s1 == s2.toString())
			System.out.print("1");
		if (s1.equals(s2))
			System.out.print("2");

		StringBuilder b = new StringBuilder("rumble");
		// erro StringBuilder b1 = "rumble";
		b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
		System.out.println(b);
		System.out.println("##############");

		StringBuilder puzzle = new StringBuilder("Java");
		// puzzle.reverse();
		System.out.print("reverse - ");
		System.out.println(puzzle);

		// puzzle.append("vaJ$").substring(0, 4);
		System.out.print("substring 0,4 - ");
		System.out.println(puzzle);

		puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
		System.out.print("delete - ");
		System.out.println(puzzle);
		// puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());
		// System.out.println(puzzle);

		char teste[][] = new char[2][0];
		System.out.println(teste.length);

		ArrayList l = new ArrayList();
		l.size();

		StringBuilder alpha = new StringBuilder();
		for (char current = 'a'; current <= 'z'; current++)
			alpha.append(current);
		System.out.println(alpha);
		
		

	}
}
