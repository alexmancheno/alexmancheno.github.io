public class Car{

	private static int numCars = 0;
	private String Make, Model;
	private int Year, Mileage;
	
	public Car(String Make, String Model, int Year, int Mileage){
		this.Make = Make;
		this.Model = Model;
		this.Year = Year;
		this.Mileage = Mileage;
		
		numCars++;
	}
	
	public int compareTo(Car other){
		return this.Make.compareTo(other.Make);
	}
	
	public static int count(){
		return numCars;
	}
	
	public String toString(){ // Unsure about this
		return this.Make+" "+this.Model+" "+this.Year+" "+this.Mileage;
	}
	public void setMake(String s){
		Make = s;
	}
	
	public String getMake(){
		return Make;
	}
	
	public void setModel(String s){
		Model = s;
	}
	
	public String getModel(){
		return Model;
	}
	
	public void setYear(int i){
		Year = i;
	}
	
	public int getYear(){
		return Year;
	}
	
	public void setMileage(int i){
		Mileage = i;
	}
	
	public int getMileage(){
		return Mileage;
	}
}