package chapter4;


import java.io.*;

public class GameHelper {
	
	
	public String getUserInput(String prompt) {
		
		String inputline = null;
		System.out.println(prompt + " ");
		
		try {
			
			BufferedReader bf = new BufferedReader( new InputStreamReader(System.in) );
			inputline = bf.readLine();
			
			if(inputline.length()== 0) return null;
			
		} catch (IOException e) {
			
			System.out.println("IOException "+ e);	
		}
		return inputline;
	}

}
