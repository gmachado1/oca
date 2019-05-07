package br.com.apis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Zoo {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2019, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2019, Month.MARCH, 30);
		performAnimalEnrichment(start, end);
		
		
		LocalDate date = LocalDate.of(2020,Month.JANUARY,10);
		LocalTime time = LocalTime.of(11,12,34);
		LocalDateTime dateTime = LocalDateTime.of(date,time);
		
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(shortF.format(dateTime));
		System.out.println(mediumF.format(dateTime));
		
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate date1 = LocalDate.parse("01/02/2015", f);
		LocalTime time1 = LocalTime.parse("11:22");
		System.out.println(date1); // 2015-01-02
		System.out.println(time1); // 11:22
				
		
	}

	private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) { // check if still before end
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plusMonths(1); // add a month
		}
		System.out.println("end new toy: " + upTo);
	}

}
