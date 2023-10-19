package chapter4;

public class ElectricGuitar {
	
	private boolean rockStarUsesIt;
	private String brand;
	private int numberOfPickUps;
	
	
	public void setBrand(String aBrand) {
		brand = aBrand;
	}
	
	public String getBrand() {
		return brand;	
	}
	
	public void setNumberOfPickUps (int numPicks) {
		numberOfPickUps = numPicks;
	}
	
	public int getNumberOfPickUps () {
		return numberOfPickUps;
	}
	
	public void setRockStarUsesIt(boolean yesOrNo) {
		
		rockStarUsesIt  = yesOrNo;
	}
	
	public boolean getRockStarUsesIt() {
		return rockStarUsesIt;
	}

	
	
}
