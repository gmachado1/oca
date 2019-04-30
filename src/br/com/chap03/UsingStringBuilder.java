package br.com.chap03;

import java.util.ArrayList;
import java.util.List;

public class UsingStringBuilder {

	public static void main(String[] args) {
		// ######################################################
		System.out.println("#########  1 ##############");
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		System.out.println("#########   ##############");
		// formas de criar StringBuilder
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("animal");
		StringBuilder sb3 = new StringBuilder(10);

		System.out.println("#####   TESTANDO ");
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println(sub + " " + len + " " + ch);
		System.out.println("#####   TESTANDO ");
		StringBuilder sb4 = new StringBuilder("animals");
		sb4.insert(7, "-"); // sb = animals-
		sb4.insert(0, "-"); // sb = -animals-
		sb4.insert(4, "-"); // sb = -ani-mals-
		System.out.println(sb4);
		sb4.deleteCharAt(4);
		System.out.println(sb4);
		sb4.reverse();
		System.out.println(sb4);
//	######################################3	
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println(one == two); // false
		System.out.println(one == three); // true
//######################################################

		String x = "Hello World";
		String z = " Hello World".trim();
		System.out.println(z);
		System.out.println(x.equals(z)); // true
		// ################## 5 ###################################
		System.out.println("############################5 ###############");
		StringBuilder sb5 = new StringBuilder("animals");
		String sub5 = sb5.substring(sb5.indexOf("a"), sb5.indexOf("al"));
		int len5 = sb5.length();
		char ch5 = sb5.charAt(6);
		System.out.println(sub5 + " " + len5 + " " + ch5);
		System.out.println("Platypus");
		System.out.println("############################  6  ###############");
		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		birds.add(1, "robin"); // [hawk, robin]
		birds.add(0, "blue jay"); // [blue jay, hawk, robin]
		birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
		birds.add(4, "teste"); // [blue jay, cardinal, hawk, robin]
		System.out.println(birds); // [blue jay, cardinal, hawk, robin]
	}
}
