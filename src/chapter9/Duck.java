package chapter9;

public class Duck extends Animal {
	
	int size;
	
	// The Duck constructor
	public Duck(int newsize) {
		
		super();
		System.out.println("Quack");
		size = newsize;
		System.out.print("The new duck size is "+size);
		 
	}
	
	public void setSize(int newSize) {
		size = newSize;
	}

}
