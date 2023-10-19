package chapter4;

public class GoodDogTestDrive {
	
	public static void main(String [] args) {
		
		GoodDog gddg = new GoodDog();
		gddg.setDogSize(61);
		gddg.bark();
		
		
		GoodDog mediumdog = new GoodDog();
		mediumdog.setDogSize(17);
		mediumdog.bark();
		
		
		GoodDog smalldog = new GoodDog();
		smalldog.setDogSize(1);
		smalldog.bark();
		
	}

}
