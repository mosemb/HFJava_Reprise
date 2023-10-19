package chapter4;

public class SimpleDotComTestDrive {
	
	
	
	public static void main(String [] args) {
		
		SimpleDotCom dotcom = new SimpleDotCom();
		int [] locations = {2,3,4};
		dotcom.setLocationCells(locations);
		String userGuess = "4";
		dotcom.checkYourSelf(userGuess);
	}

}
