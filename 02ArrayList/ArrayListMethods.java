import java.util.*;

public class ArrayListMethods{
    public static void main(String[]args){
	ArrayList<Integer> L = new ArrayList<Integer>(14);
	L.add(new Integer(1));
	L.add(new Integer(9));
	L.add(new Integer(3));
	L.add(new Integer(3));
	L.add(new Integer(4));
	L.add(new Integer(2));
	L.add(new Integer(2));
	L.add(new Integer(2));
	L.add(new Integer(7));
	L.add(new Integer(8));
	L.add(new Integer(8));
	L.add(new Integer(8));
	L.add(new Integer(8));
	L.add(new Integer(9));
	System.out.println(L);

	collapseDuplicates(L);
	System.out.println(L);

	randomize(L);
	System.out.println(L);

	randomize(L);
	System.out.println(L);

	randomize(L);
	System.out.println(L);
	
    }
    public static void collapseDuplicates(ArrayList<Integer> L){
	for(int i=0; i<L.size()-1; i++){
	    if(L.get(i).equals(L.get(i+1))){
	    L.remove(L.get(i));
		collapseDuplicates(L);
	    }
	}
    }

    public static void randomize(ArrayList<Integer> L){
	Random rand = new Random();

	for(int i=L.size(); i>1; i--){
	    L.add(L.remove(rand.nextInt(i)));
	}
    }
}
