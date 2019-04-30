package br.com.chap03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exam {

	public static void main(String... ar) {
		System.out.println("  iniciando   ");
		List<Integer> list = Arrays.asList(10, 4, -1, 5);
		Collections.sort(list);
		Integer arrays[] = list.toArray(new Integer[8]);
		System.out.println(arrays[0]);
		System.out.println("teste");
//		for(int a :arrays)
//		System.out.println(a);

		System.out.println("tempo");

	;

		List list2 = Arrays.asList("C", "c", "1", "4", "a", "A", "0D");
		Collections.sort(list2);
		System.out.println(list2);
		
		
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.of(1, 2, 3);
		d = d.minus(p);
		System.out.println(d.getYear() + "/" + d.getMonth() + "/" + d.getDayOfMonth());
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(d.format(f));
		
		//DATE TIME aceita encadealmento CHAINING
		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
// ERRO		LocalDateTime dateTime = LocalDateTime.of(date2, time).minusDays(1).minusHours(10).minusSeconds(30);
		LocalDateTime dateTime = LocalDateTime.of(date2, time);
		System.out.println(dateTime);
		dateTime=  dateTime.minusDays(1).minusHours(10).minusSeconds(30).minusYears(2).minusMonths(2).minusDays(1);
		System.out.println(dateTime);
		
		Period wrong = Period.ofDays(3).ofYears(1).ofMonths(8);
		
		
		LocalDate date3 = LocalDate.of(2015, 1, 20);
		LocalTime time3 = LocalTime.of(6, 15);
		LocalDateTime dateTime3 = LocalDateTime.of(date3, time);
		Period period = Period.ofMonths(1);
		System.out.println("---");
		System.out.println(date3.plus(wrong)); // 2015-02-20
		System.out.println("---");		
		System.out.println(date3.plus(period)); // 2015-02-20
		System.out.println(dateTime3.plus(period)); // 2015-02-20T06:15
		System.out.println(time3.plus(period));
	
	
				LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
				date.plusDays(2);
				date.plusHours(3);
				System.out.println(date.getYear() + " " + date.getMonth() + " "
				+ date.getDayOfMonth());
	}
	
	

}
