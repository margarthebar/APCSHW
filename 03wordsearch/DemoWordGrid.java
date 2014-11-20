public class DemoWordGrid{
    private static WordGrid puzzle = new WordGrid(5,5);

    public static void main(String[]args){
	System.out.println(puzzle.toString());

	System.out.println(puzzle.addWordHorizontal("CAT",3,3));
	System.out.println(puzzle.toString());

	System.out.println(puzzle.addWordHorizontal("BUNNY",3,0));
	System.out.println(puzzle.toString());

	System.out.println(puzzle.addWordVertical("STEAK",0,2));
	System.out.println(puzzle.toString());

	System.out.println(puzzle.addWordVertical("FIEND",1,2));
	System.out.println(puzzle.toString());

	System.out.println(puzzle.addWordVertical("FIEND",1,1));
	System.out.println(puzzle.toString());

	System.out.println(puzzle.addWordVertical("FIEND",0,2));
	System.out.println(puzzle.toString());
	
	System.out.println(puzzle.addWordDiagonal("STEAK",0,0));
	System.out.println(puzzle.toString());

	System.out.println(puzzle.addWordDiagonal("AIRY",0,1));
	System.out.println(puzzle.toString());
    }
}
