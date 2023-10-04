package chapter1;

public class BeersLeft {
	
	public static void main(String [] args) {
		
		int var = 101;
		String beers = "Beers";
		String conj = "are";
		
		for(int i = 0; i<var; var--)
		{
			if(var ==1) {
				
				beers = "Beer";
				conj = "is";
			}
			System.out.println("There "+conj + " "+var );
			System.out.println(beers + " on the wall");
			System.out.println("Take one down");
			System.out.println(" ");
		}
		
		System.out.println("No beers left on the wall ");
		
		
	}

}
