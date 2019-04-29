
public abstract class Animal {
	String species;
	int population;
	
	public Animal (String s, int p) {
		if (s==null || s.equals("")) {
			throw new InvalidAnimalException("Species must be given.");
		}
		if(p<0) {
			throw new InvalidAnimalException("Population cannot be negative");
		}
		species = s;
		population = p;
		System.out.println("New animal, species is " + species + " population " + population);
	}
	// Question 3.a
	public String getSpecies() {
		return species;
	}
	
	// Question 4.b
	public void setPopulation(int p) {
		if(p<0) {
			throw new InvalidAnimalException("Population cannot be negative");
		}
		this.population = p;
	}
}
