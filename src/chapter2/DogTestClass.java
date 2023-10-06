package chapter2;

public class DogTestClass {
	
	
	public static void main(String [] args) {
		DogClass dog = new DogClass();
		dog.age = 5;
		dog.size = 30;
		dog.breed = "Germany_Shepard";
		dog.name = "Ricky";
		
		dog.bark();
		
		// Make an array of Dogs
		
		DogClass [] dogs = new DogClass[3];
		
		dogs[0] = new DogClass();
		dogs[1] = new DogClass();
		dogs[2] = dog;
		
		// Assign dogs names
		dogs[0].name = "James Brown";
		dogs[1].name = "Dre";
		
		dogs[0].size = 70;
		dogs[1].size = 6;
		dogs[2].size = 14;
		
		// Last Dogs name
		// dogs[2]
		//System.out.println("Dog in position 2 is "+dogs[2].name);
		
		int x = 0;
		while (x<dogs.length) {
			dogs[x].bark();
			//dogs[x].eat();
			x=x+1;
		}
		
		
	}

}
