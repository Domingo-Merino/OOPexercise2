public class Chicken extends pet {
	private String breed;

	public Chicken(String name, double weight, String breed) {
		super(name,weight);
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed){
		this.breed = breed;
	}

}
