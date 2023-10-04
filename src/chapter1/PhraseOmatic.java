package chapter1;

public class PhraseOmatic {
	
	public static void main(String [] args) {
		
		String[] wordListOne = {"24/7","multi_Tier","30,000 foot","B-to-B","win-win","front end", 
				       "web-based","pervasive", "smart", "six_sigma","critical-path", "dynamic"};
		
		String [] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", 
				"distributed", "clustered", "branded","outside-the-box", "positioned", "networked",
				"focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
		
		String[] wordListThree = {"process", "tippingpoint", "solution", "architecture",
				"core competency", "strategy", "mindshare", "portal", "space", "vision", 
				"paradigm", "mission"};
		
		
		int lenListOne = wordListOne.length;
		int lenListTwo = wordListTwo.length;
		int lenListThree = wordListThree.length;
		
		//Generate some random numbers
		int listnum1  = (int) (Math.random() * lenListOne);
		int listnum2 = (int) (Math.random()*lenListTwo);
		int listnum3 = (int) (Math.random()*lenListThree);
		
		String phrase = " "+ wordListOne[listnum1] + " "+wordListTwo[listnum2]+" "+wordListThree[listnum3];
		
		System.out.println(phrase);
		
	}

}
