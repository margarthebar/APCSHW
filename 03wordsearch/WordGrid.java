import java.util.*;

public class WordGrid{
    private char[][]data;

    /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     */
    public WordGrid(int rows,int cols){
	data = new char[rows][cols];
	for(int r=0; r<rows; r++){
	    for(int c=0; c<cols; c++){
		data[r][c] = '-';
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
	    if(word.length() > space || (data[row+(i*rowChange)][col+(i*colChange)] != '-' && data[row+(i*rowChange)][col+(i*colChange)] != word.charAt(i))){
		return false;
	    }
	}
	for(int i=0; i<word.length(); i++){
	    data[row+(i*rowChange)][col+(i*colChange)] = word.charAt(i);
	}
	return true;
    }

    public boolean addWordHorizontal(String word, int row, int col){
	return addWord(word,row,col,data[row].length-col,0,1);
    }
    public boolean addWordVertical(String word, int row, int col){
	return addWord(word,row,col,data.length-row,1,0);
    }
    public boolean addWordDiagonal(String word, int row, int col){
	return addWord(word,row,col,data.length-row,1,1);
    }
    public boolean addWordHorizontalBack(String word, int row, int col){
	String flipped = "";
	for(int i=0; i<word.length(); i++){
	    flipped +=word.charAt(word.length()-1-i);
	}
	return addWordHorizontal(flipped,row,col);
    }
  
}
