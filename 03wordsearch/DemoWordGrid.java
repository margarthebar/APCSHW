public class DemoWordGrid{
    private static WordGrid puzzle = new WordGrid(5,5);

    public static void main(String[]args){
	System.out.println(puzzle.toString());

	System.out.println(puzzle.addWordHorizontal("CAT",3,3));
	System.out.println(puzzle.toString());

	System.out.println(puzzle.addWordHorizontal("BUNNY",3,0));
	System.out.println(puzzle.toString());
    }
}
