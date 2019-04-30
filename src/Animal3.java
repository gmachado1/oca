interface Walk {
	public default int getSpeed() {
		System.out.println(5);
		return 5;
	}
}

interface Run {
	public default int getSpeed() {
		System.out.println(8);
		return 8;
	}
}
	public class Animal3 implements  Walk {

		public static void main(String args[]) {
			Walk a = new Animal3();
			System.out.println(a.getSpeed());
		}

//		public int getSpeed() {
//			
//		return 2;
//		}

}
