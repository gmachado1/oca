public class Cardinal {
	static int number;

	Cardinal() {
		number++;
	}

	public static void main(String[] args) {
		Cardinal c1 = new Cardinal();
		if (c1 == null) {
			Cardinal c2 = new Cardinal();
		} else {
			Cardinal c2 = new Cardinal();
		}
		Cardinal c2 = new Cardinal();
		System.out.println(c1.number);
		
		
		Integer x = null;
		int y = 0;
		 if(x == y) {
		 System.out.print("1");
		 } else {
		System.out.print("2");
		 } finally {
		 System.out.print("3");
		 }
	}
}
