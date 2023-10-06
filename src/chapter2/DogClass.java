package chapter2;

public class DogClass {
	
	int size;
	int age;
	String name;
	String breed;
	
	void bark() {
		if(size>60) {
			
			System.out.println("Woof Woof");
		}else if(size >14) {
			
		   System.out.println("Ruff Ruff");	
		}else {
			
			System.out.print("Yip Yip");
		}
		
	}
	
	void eat() {
		System.out.println("Dog is eating some meat");
	}
	
	
	void chaseCat() {
		System.out.println("Do is chasing the cat");
	}

}
