
public class Bat extends FlyingAnimal {
	private boolean flapping = false;
	
	public Bat(String species) {
		super(species, Flapping.DEFAULT_WING_BEATS, Flapping.DEFAULT_POPULATION);
	}
	
	public Bat(String species, int population, int wingBeats, boolean f) {
		super(species, population, wingBeats);
		System.out.println(this.getClass().getName() + " created, Species is " + species + " wing beats = " + wingBeats);
	}
	
	// added to conform to practice exam answers
	public Bat(String species, int population, int wingBeats) {
		super(species, population, wingBeats);
		System.out.println(this.getClass().getName() + " created, Species is " + species + " wing beats = " + wingBeats);
	}
	
	public int wingBeats() {
		return wingBeatsPerSecond;
	}

	public boolean flaps() {
		return flapping;
	}
	
}
