package chapter2;

public class MovieTestDrive {
	
	public static void main (String [] args) {
		
		Movie movie1 = new Movie();
		movie1.title = "The rich also cry";
		movie1.genre = "Adventure";
		movie1.rating = 5;
		movie1.playmovie();
		
		Movie movie2 = new Movie();
		movie2.genre = "Action";
		movie2.title = "Rambo2";
		movie2.rating = 4;
		movie2.playmovie();
	}

}
