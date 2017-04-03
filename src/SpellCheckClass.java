// hi
import java.util.*;
 import java.io.BufferedReader; 
 import java.io.File; 
 import java.io.FileNotFoundException; 
 import java.io.FileReader; 
 import java.io.PrintWriter; 
 import java.nio.file.Paths; 

public class SpellCheckClass {

	public static void main(String[] args) {
		LinuxWord lw = new LinuxWord();
		boolean result;
		int spellresult = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the statement for spellcheck");
		String stringToSplit= scan.nextLine();
		// TODO Auto-generated method stub
		//String stringToSplit = "This is my string";
		String delim = " ";
		String[] parts = stringToSplit.split(delim);
		for (String eachword : parts){
			System.out.println(eachword.toString());
			result = lw.spellCheck(eachword.toString());
			if (!result) {
				System.out.println(eachword.toString()+ " is not a word. Please reenter.");	
				spellresult = 1;
				break;
			}
			
			
		}
		if (spellresult ==0){
		System.out.println("No spelling mistake detected");
		}
	}
	
	/* public static ArrayList<String> readLines(File file) throws Exception { 
		  	      if (!file.exists()) { 
		 	          return new ArrayList<String>(); 
		  	      } 
		 	      BufferedReader reader = new BufferedReader(new FileReader(file)); 
		  	      ArrayList<String> results = new ArrayList<String>(); 
		  	      String line = reader.readLine(); 
		  	      while (line != null) { 
		  	          results.add(line); 
		  	          line = reader.readLine(); 
		  	      } 
		  	      reader.close(); 
		  	      return results; 
		  	  } 

	 
	public static String spellCheck(String word){
		ArrayList<String> wordlist = new ArrayList<String>();
		 
		String filename = (System.getProperty("user.dir") + File.separatorChar +"linuxwords.txt");
		try { 
			 			 
			 			wordlist = readLines(new File(filename)); 
			 			for(String correctword:wordlist) 
			 			{ 
			 				if (word.contains(correctword.toString())){
			 					return "t";
			 				} 
			 			} 
			 			return "f";
			 		} catch (Exception e) { 
			 			e.printStackTrace(); 
			 			return "f";
					} 

	}*/

}
