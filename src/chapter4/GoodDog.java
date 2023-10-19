package chapter4;

public class GoodDog {;
	
	

	private int size;
	
	
	public void setDogSize(int size_dog) {
		
		size = size_dog;
	}
	
	public int getDogSize() {
		
		return size;
	}

	
	void bark() {
		if(size > 60) {
			
			System.out.println("Woof Woof, Woof");
		}else if (size> 14) {
			
			System.out.println("Ruff Ruff Ruff");
		}else {
			System.out.println("Yip Yip Yip");
		}
	}

}
