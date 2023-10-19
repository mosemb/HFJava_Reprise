package chapter4;

public class SimpleDotCom {
	
	int [] locationCells;
	int numOfHits = 0;
	
	
	public void setLocationCells(int [] locCells) {
		locationCells = locCells;
	}
	
	
	public String checkYourSelf(String guessStr) {
		
		int guess = Integer.parseInt(guessStr);
		String result = "miss";
		
		for (int cell : locationCells) {
			
			if (guess ==cell) {
				
				
				result = "hit";
				numOfHits = numOfHits + 1;
				break;
			}
			
		}
       
		if (numOfHits == locationCells.length) {
			
			result = "kill";
			
		}
		
		System.out.print(result);
		
		return result;
	}

}
