
import java.util.Arrays;
public class TestandoArray {

	public final static void main(String[] args) {
		int[]a1 = {2,-1,4,5,3};
		int[]a2 = {2,-1,4,5,3};
		Object[]a3 = {2,-1,4,5,3};
		Object[]a4 = {2,-1,4,5,3};
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		System.out.println(Arrays.equals(a1, a2));
		System.out.println(Arrays.deepEquals(a3, a4));
		
		int a5[] = {3,2,1,0};
		int y = a5.length;
		int x = y-1;
		System.out.println();
		while (y>=0) {
			System.out.println(--y);
		}
	}
}
