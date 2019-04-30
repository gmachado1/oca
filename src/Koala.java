
interface CanClimb {
	int maxHeight();
}

interface HasClaws {
	boolean isSharp();
}

class Koala implements CanClimb, HasClaws {
	public boolean isSharp() {
		return true;
	}

	public int maxHeight() {
		return 15;
	}

	public static void main(String[] args) {
		// Object
		Object koala = new Koala();
		double aaa = 100;
		CanClimb canClimb = (CanClimb) koala;
		HasClaws hasClaws = (HasClaws) canClimb;
		System.out.print(canClimb.maxHeight());
		System.out.print(hasClaws.isSharp());
		
		
		for (int i = 0; i < 14;System.out.println(i++));

	}
}
