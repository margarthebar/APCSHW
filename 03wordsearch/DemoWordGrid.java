import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DemoWordGrid{

    public static void main(String[]args) throws FileNotFoundException, NoSuchElementException{

	File input = new File("words.txt");
	Scanner in = new Scanner(input);
	int rows = 14;
	int cols = 14;

	/*this is the "NEW SECTION" 
	 *
	 *This is where you need to write something in order
	 *to get the values from args, OR decide to use default values 
	 */
	
	if(args.length>0){
	    if(args.length>1){
	        rows = Integer.parseInt(args[0]);
		cols = Integer.parseInt(args[1]);
	    }
	}
	WordGrid w = new WordGrid(rows,cols);
	if(args.length>2){
	    w.setSeed(Long.parseLong(args[2]));  
	}

	//w.loadWordsFromFile("fileNameYouMade.txt", /*something from NEW SECTION*/ );
	//System.out.println( "Find these words:\n"+ w.wordsInPuzzle() );
	//System.out.println( w );
	
	w.grid(args);
	System.out.println(w.toString());

    }
}
