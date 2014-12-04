public class Main3{
    public static void main(String[]args){
	OrderedSuperArray a = new OrderedSuperArray();
	System.out.println(a.toString());
	a.add("dog");
	System.out.println(a.toString());
	System.out.println("zoo".compareTo("dog"));
	a.add("zoo");
	System.out.println(a.toString());
	a.add("game");
	System.out.println(a.toString());
	a.add("gear");
	System.out.println(a.toString());
	a.add("elephant");
	System.out.println(a.toString());
	a.add("once");
	System.out.println(a.toString());
	a.add("upon");
	System.out.println(a.toString());
	a.add("time");
	System.out.println(a.toString());
	a.add("kingdom");
	System.out.println(a.toString());
	a.add("far");
	System.out.println(a.toString());
	a.add("away");
	System.out.println(a.toString());
	a.add("sea");
	System.out.println();
	try{
	    System.out.println("set(8,'animal'):");
	    System.out.println("Returns: "+a.set(8,"animal"));
	    System.out.println(a.toString());
	    System.out.println();
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of range");
	    System.out.println();
	}
	System.out.println(a.toString());
    }
}
