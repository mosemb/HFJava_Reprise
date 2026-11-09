package chapter1;

public class Loopy {
	
	public static void main(String [] args) {
		
		int x = 1;
		
		System.out.println("While out the loop ");
		
		while (x < 4 ) {
			
			
			System.out.println("In the loop ");
			System.out.println("The value of x is now "+ x);
			
			x = x+1;
		}
		 
		System.out.println("The loop has finished ");
		
	}

}

