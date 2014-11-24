import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DemoWordGrid{
    private static WordGrid puzzle = new WordGrid(14,14);
    private static ArrayList<String> words = new ArrayList<String>();

    public static String flip(String word){
	String flipped = "";
	for(int i=0; i<word.length(); i++){
	    flipped +=word.charAt(word.length()-1-i);
	}
	return flipped;
    }

    public static void main(String[]args) throws FileNotFoundException, NoSuchElementException{

	File input = new File("words.txt");
	Scanner in = new Scanner(input);

	while(in.hasNext()){
	    words.add(in.next());
	}

	System.out.println(words.toString());

	Random rand = new Random();
	String word = "";
	boolean done = false;
	int tries = 0;

	for(int i=0; i<words.size(); i++){
	    while(!done && tries<100){
		word = words.get(i);

		if(rand.nextInt(2) == 1){
			word = flip(word);
		}

		if(rand.nextInt(4) == 0){
		    if(puzzle.addWordHorizontal(words.get(i),rand.nextInt(14),rand.nextInt(14))){
			done = true;
		    }
		}else if(rand.nextInt(4) == 1){
		    if(puzzle.addWordVertical(words.get(i),rand.nextInt(14),rand.nextInt(14))){
			done = true;
		    }
		}else if(rand.nextInt(4) == 2){
		    if(puzzle.addWordDiagonal(words.get(i),rand.nextInt(14),rand.nextInt(14))){
			done = true;
		    }
		}else{
		    if(puzzle.addWordDiagonal1(words.get(i),rand.nextInt(14),rand.nextInt(14))){
			done = true;
		    }
		}
		tries++;
	    }
	    done = false;
	}

        puzzle.fill();

	System.out.println(puzzle.toString());

    }
}

