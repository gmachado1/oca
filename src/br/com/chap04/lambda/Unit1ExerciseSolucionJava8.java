package br.com.chap04.lambda;

import java.util.*;
import java.util.function.*;

public class Unit1ExerciseSolucionJava8 {

	List<Person> people = Arrays.asList(new Person("Gustavo","Machado",36),
	new Person("Luciana","Machado",37),
	new Person("Hamilton","Antonio",65),
	new Person("Ana Lúcia","Araujo",63));

	Collections.sort(people , (p1,p2) -> p1.getLastName().comparteTo(p2.getLastName()));
	
	private static void printConditionally(List<Person>list,Predicate<Person> condition) {
		for(Person p :list) {
			if(condition.test(p))
				System.out.println(p);
		}
	}
}
