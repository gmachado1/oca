package br.com.chap04.lambda;

public class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;

	/**
	 * @param speciesName
	 * @param hopper-saltador
	 * @param swimmer-nadador
	 */
	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}

	public String getSpecies() {
		return species;
	}

	public String toString() {
		return species;
	}

}
