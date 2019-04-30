

class Animal2 {
	public void eat() throws Exception {
		System.out.println("Animal eats!");
	}

	protected void makeSound() {
		System.out.println("sound");
	}
}

public class Dog extends Animal2 {
		
		static int x = 10;

	public void eat() {
		System.out.println("Dog eat!");
	}

	public void makeSound() {
		System.out.println("Bark!");
	}

	public static void main(String... args) {
		Integer []ar= new Integer[2];
		ar[1]= 10;
		for (Integer i : ar) {
			System.out.println(i);
		}
		
		Dog gg= new Dog();
		gg.x=5;
		int y  = x/gg.x;
		System.out.println(">> y = "+y);
		int c1=2,c2=2,c3=2;
		int h = (c1/c2)*c3;
		double wd = 10;
		
		Animal2 a = new Animal2();
		Dog d = new Dog();
		d.eat();
		try {
			a.eat();
			// a.sound();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public String toString() {
	return ToStringBuilder.reflectionToString(this);
	}

}
enum Race {
	PASTOR(1),
	LABRADOR(2),
	BOTHER_COLIE(3);

	private final int race;
	
	Race(int race) { //só pode ser default ou private
		this.race = race; // erro no contrutor se public ou protected
	}
}