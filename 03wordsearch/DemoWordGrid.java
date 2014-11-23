import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.util.ArrayList;

public class DemoWordGrid{
    private static WordGrid puzzle = new WordGrid(5,5);
    private static WordGrid puzzle1 = new WordGrid(5,5);
    private static ArrayList<String> words = new ArrayList<String>();

    public static void main(String[]args) throws FileNotFoundException, NoSuchElementException{

	File input = new File("words.txt");
	Scanner in = new Scanner(input);
	String word = "";
	while(in.hasNext()){
	    words.add(in.next());
	}

	System.out.println(words.toString());

    }
}
