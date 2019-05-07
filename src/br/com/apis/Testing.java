package br.com.apis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testing {

	public synchronized static void main(String[] args) {
		String string = "animals";
		// #############################################################################
		// charAt
		System.out.println("************   charAt");
		System.out.println(string.charAt(0)); // a
		System.out.println(string.charAt(6)); // s
		try {
			System.out.println(string.charAt(7)); // throws exception
		} catch (Exception e1) {
			e1.printStackTrace();
			System.out.println("erro 1 charAt");
		}
		// ############################################################################
		// indexOF
		System.out.println("************   indexOF");
		System.out.println(string.indexOf('a')); // 0
		System.out.println(string.indexOf("al")); // 4
		System.out.println(string.indexOf('a', 4)); // 4
		System.out.println(string.indexOf("al", 5)); // -1 não joga exceção
		// ############################################################################
		// substring
		System.out.println("************   substring");
		System.out.println(string.substring(3)); // mals
		System.out.println(string.substring(string.indexOf('m'))); // mals
		System.out.println(string.substring(3, 4)); // m
		System.out.println(string.substring(3, 7)); // mals

		System.out.println(string.substring(3, 3)); // empty string

		try {
			System.out.println(string.substring(3, 2)); // throws exception
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("erro 2 substring");
		}

		try {
			System.out.println(string.substring(3, 8)); // throws exception
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("erro 3 substring");
		}
		// ############################################################################
		// toLowerCase and toUpperCase
		System.out.println("************   toLowerCase and toUpperCase");
		System.out.println(string.toUpperCase()); // ANIMALS
		System.out.println("Abc123".toLowerCase()); // abc123
		// ####### EQUALS ######################################################
		// equals
		System.out.println("************   EQUALS");
		System.out.println("abc".equals("ABC")); // false
		System.out.println("ABC".equals("ABC")); // true
		System.out.println("abc".equalsIgnoreCase("ABC")); // true
		// ################# STARTWITH ##############################################
		System.out.println("************   STARTWITH");
		System.out.println("abc".startsWith("a")); // true
		System.out.println("abc".startsWith("A")); // false
		System.out.println("abc".endsWith("c")); // true
		System.out.println("abc".endsWith("a")); // false
		// ################# contains ##############################################
		System.out.println("************   contains");
		System.out.println("abc".contains("b")); // true
		System.out.println("abc".contains("B")); // false
		// ################# replace ##############################################
		System.out.println("************   replace");
		System.out.println("abcabc".replace('a', 'A')); // AbcAbc
		System.out.println("abcabc".replace("a", "A")); // AbcAbc
		// ################# trim
		System.out.println("************   trim");
		System.out.println("abc".trim()); // abc
		System.out.println("\t x  a b c\n".trim()); // x a b c
		// ################# TESTE 1
		System.out.println("************   TESTE 1");
		String start = "AniMaL   ";
		String trimmed = start.trim(); // "AniMaL"
		String lowercase = trimmed.toLowerCase(); // "animal"
		String result = lowercase.replace('a', 'A'); // "AnimAl"
		System.out.println(result);

		String result1 = "AniMaL   ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result1);
		// ################# TESTE 2
		System.out.println("************   TESTE 2");
		String a = "abc";
		String b = a.toUpperCase();
		b = b.replace("B", "2").replace('C', '3');
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		// ################# TESTE 3
		System.out.println("************   TESTE 3");
		String a3 = "";
		for (char c = 'a'; c <= 'z'; c++) {
			a3 += c;
		}
		System.out.println("a3 =" + a3);

		StringBuilder sb3 = new StringBuilder("");
		for (char c = 'a'; c <= 'z'; c++) {
			sb3.append(c);
		}
		System.out.println("sb3=" + sb3.toString());

		// ################# TESTE 4
		System.out.println("************   TESTE 44");
		int[] numbers = { 2, 4, 6, 8 };
		System.out.println("binary " + Arrays.binarySearch(numbers, 2));
		System.out.println("binary " + Arrays.binarySearch(numbers, 4));
		System.out.println("binary " + Arrays.binarySearch(numbers, 1));
		System.out.println("binary " + Arrays.binarySearch(numbers, 3));
		System.out.println("binary " + Arrays.binarySearch(numbers, 7));
		System.out.println("binary " + Arrays.binarySearch(numbers, 9));

		// ################### TEste
		System.out.println("ttt");
		String[] array = { "gustavo", "luciana" };
		List<String> listgg = Arrays.asList(array);
		List<String> lll = new ArrayList<String>();
		lll.addAll(listgg);
		
		
		System.out.println(listgg.size());
		listgg.set(0,"Ana");
		
		lll.add("hamilton");
		//array.add("Hamilton"); não pode addicionar em array
		for (String k : array) {
			System.out.println(k);
		}
		System.out.println("intervalo");
		for (String ç : listgg) {
			System.out.println(ç);
		}
		for (String ç : lll) {
			System.out.println("lll>"+ç);
		}
		
		
		
		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		birds.add("hawk"); // [hawk, hawk]
		System.out.println(birds.remove("cardinal")); // prints false
		System.out.println(birds.remove("hawk")); // prints true
		System.out.println(birds.remove(0)); // prints hawk
		System.out.println(birds); // []
	}
	
}
