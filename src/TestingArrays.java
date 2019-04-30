
public class TestingArrays {

	public static void main(String[] args) {
		int ar[][] = { { 1, 0 }, { -4 }, { 3, 1 } };

		f1: for (int[] a : ar) {
			for (int x = 0; x < a.length; x++) {
				if (a[x] < 0)
					break f1;
				System.out.println(a[x]);
			}
		}

		for (int x = 10; x > 5; x++) {
			if (x == 16) {
				x -= 11;
			}
			System.out.println(x);

		}
	}
}
