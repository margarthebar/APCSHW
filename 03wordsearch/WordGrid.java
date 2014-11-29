import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WordGrid{
    private char[][]data;
    private Random rand = new Random();
    private int rows;
    private int cols;

    public void setSeed(long seed){
	rand = new Random(seed);
    }


    /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     */
    public WordGrid(int rows,int cols){
	data = new char[rows][cols];
	this.rows = rows;
	this.cols = cols;
	for(int r=0; r<rows; r++){
	    for(int c=0; c<cols; c++){
		data[r][c] = ' ';
	    }
	}
    }

    /**Set all values in the WordGrid to spaces ' '*/
    private void clear(){
	for(int r=0; r<data.length; r++){
	    for(int c=0; c<data[r].length; c++){
		data[r][c] = ' ';
	    }
	}
    }

    /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and each row
     *separated by newlines.
     */
    public String toString(){
	String ans = "";
	for(int r=0; r<data.length; r++){
	    for(int c=0; c<data[r].length; c++){
		ans+=data[r][c]+" ";
	    }
	    ans+="\n";
	}
	return ans;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
    public boolean addWord(String word, int row, int col, int space, int rowChange, int colChange){
	for(int i=0; i<word.length(); i++){
	    if(word.length() > space ||
	       (data[row+(i*rowChange)][col+(i*colChange)] != ' ' && 
		data[row+(i*rowChange)][col+(i*colChange)] != word.charAt(i))){
		return false;
	    }
	}
	for(int i=0; i<word.length(); i++){
	    data[row+(i*rowChange)][col+(i*colChange)] = word.charAt(i);
	}
	return true;
    }

    public boolean addWordHorizontal(String word, int row, int col){
	return addWord(word,row,col,cols-col,0,1);
    }
    public boolean addWordVertical(String word, int row, int col){
	return addWord(word,row,col,rows-row,1,0);
    }
    public boolean addWordDiagonal(String word, int row, int col){
	if(row >= col){
	    return addWord(word,row,col,rows-row,1,1);
	}else{
	    return addWord(word,row,col,cols-col,1,1);
	}
    }
    public boolean addWordDiagonal1(String word, int row, int col){
	for(int i=0; i<word.length(); i++){
	    if(word.length() > data.length-row || word.length() > col || (data[row+i][col-i] != ' ' && data[row+i][col-i] != word.charAt(i))){
		return false;
	    }
	}
	for(int i=0; i<word.length(); i++){
	    data[row+i][col-i] = word.charAt(i);
	}
	return true;
    }

    public void fill(){
	String alpha = "abcdefghijklmnopqrstuvwxyz";

	for(int r=0; r<data.length; r++){
	    for(int c=0; c<data[r].length; c++){
		if(data[r][c]==' '){
		    data[r][c] = alpha.charAt(rand.nextInt(26));
		}
	    }
	}
    }

    public String flip(String word){
	String flipped = "";
	for(int i=0; i<word.length(); i++){
	    flipped +=word.charAt(word.length()-1-i);
	}
	return flipped;
    }

    public void grid() throws FileNotFoundException, NoSuchElementException{
	ArrayList<String> words = new ArrayList<String>();

	File input = new File("words.txt");
	Scanner in = new Scanner(input);

	while(in.hasNext()){
	    words.add(in.next());
	}

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
		    if(addWordHorizontal(words.get(i),rand.nextInt(rows),rand.nextInt(cols))){
			done = true;
		    }
		}else if(rand.nextInt(4) == 1){
		    if(addWordVertical(words.get(i),rand.nextInt(rows),rand.nextInt(cols))){
			done = true;
		    }
		}else if(rand.nextInt(4) == 2){
		    if(addWordDiagonal(words.get(i),rand.nextInt(rows),rand.nextInt(cols))){
			done = true;
		    }
		}else{
		    if(addWordDiagonal1(words.get(i),rand.nextInt(rows),rand.nextInt(cols))){
			done = true;
		    }
		}
		tries++;
	    }
	    done = false;
	}

	fill();
    }
  
}
