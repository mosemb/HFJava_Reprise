package chapter7;

public class Overloading {
	
	String UniqueId;
	
	public int addNums(int a, int b) {
		return a+b;
	}
	
	public double addNums(double a, double b) {
		return a+b;
	}
	
	public void setUniqueId(String theId) {
		
		UniqueId = theId;
	}
	
	public void setUniqueId(int ssNumber) {
		String numString = ""+ssNumber;
		setUniqueId(numString);
	}
	
	

}
