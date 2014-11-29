import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DemoWordGrid{
    private static WordGrid puzzle = new WordGrid(14,14);
    //   private static ArrayList<String> words = new ArrayList<String>();

    public static void main(String[]args) throws FileNotFoundException, NoSuchElementException{

	File input = new File("words.txt");
	Scanner in = new Scanner(input);

	/*this is the "NEW SECTION" 
	 *
	 *This is where you need to write something in order
	 *to get the values from args, OR decide to use default values 
	 */
	
	//WordGrid w = new WordGrid( /*some stuff from NEW SECTION*/ );
	//if(you need to change the random seed){  /*see more notes on this later*/
	//    w.setSeed( ??? );  
	//}
	//w.loadWordsFromFile("fileNameYouMade.txt", /*something from NEW SECTION*/ );
	//System.out.println( "Find these words:\n"+ w.wordsInPuzzle() );
	//System.out.println( w );
	
	puzzle.grid();
	System.out.println(puzzle.toString());

    }
}
