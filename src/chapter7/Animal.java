package chapter7;

abstract public class Animal {
	
// An abstract class is one that cannot be instantiated 	
	String food;
	boolean hunger;
	String boundaries;
	String location;
	
	
	String makeNoise() {
		String noise = null;
		return noise;
	}
	
	String eat() {
		String eats = "null";
		return eats;
	}
	
	boolean sleep(boolean slept) {
		slept = false;
		return slept;
	}
	
	boolean roam(boolean roaming) {
		roaming = true;
		return roaming;
	}
	
	

}
