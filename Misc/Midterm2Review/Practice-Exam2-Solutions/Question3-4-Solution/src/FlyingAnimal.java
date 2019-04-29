
public abstract class FlyingAnimal extends Animal implements Flapping {
	protected int wingBeatsPerSecond;
	
	public FlyingAnimal(String name, int population, int w) {
		super(name,population);
		if(w<0) {
			throw new FlyingAnimalException("Wing beats must be greater than zero.");
		} else {
			wingBeatsPerSecond = w;
		}
	}
	
	public String toString() {
		return this.getClass().getName();
	}
	
}
