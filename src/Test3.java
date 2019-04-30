import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test3 {

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 0, 2 };
		Object p = nums;
		int[] two = (int[]) p;
		System.out.println(10 / two[2]);

		final int movieRating = 4;
		int badMovie = 0;
		switch (badMovie) {
		case 0:
//		case badMovie:
//			System.out.println("Awful");
//			break;
//		case 4:
//		case movieRating:
//			System.out.println("Great");
//			break;
		default:
		case (int) 'a':
		case 1 * 1:
			System.out.println("Too be determined");
			break;
		}

		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period pe = Period.of(1, 2, 3);
		d.minus(pe);//d=d.minus(pe);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(f.format(d));

	}
}
