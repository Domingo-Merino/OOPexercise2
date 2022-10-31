public class mainprogram
{
	public static void main(String[] args) {
		pet pet;
		 Bird bird = new Bird("Snowy",1.2,"Cockatoo");
		Chicken chicken = new Chicken("Curry",2,"Polish");

		pet = bird;
		System.out.println(" " + "Pet Name is " + pet.getName());
        System.out.println( "Breed " + bird.getBreed()   +"\nWeight is " + bird.getWeight());
		pet = chicken;
		System.out.println(" " + "Pet Name is " + pet.getName());
	    System.out.println("Breed " + chicken.getBreed() + "\nWeight is " + chicken.getWeight());
	}

}
