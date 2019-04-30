package lambda;

public class Animal {

	private String species;
	private boolean canHop;
	private boolean canSwim;
	

	public Animal(String species, boolean canHop, boolean canSwim) {
		super();
		this.species = species;
		this.canHop = canHop;
		this.canSwim = canSwim;
	}

	@Override
	public String toString() {
		return "Animal [species=" + species + ", canHop=" + canHop + ", canSwim=" + canSwim + "]";
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public boolean isCanHop() {
		return canHop;
	}

	public void setCanHop(boolean canHop) {
		this.canHop = canHop;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}

}
