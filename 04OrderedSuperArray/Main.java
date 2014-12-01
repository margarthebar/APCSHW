public class Main{
    public static void main(String[]args){
	SuperArray a = new SuperArray();
	System.out.println(a.toString());

	a.set(0,"dog");
	a.set(1,"zoo");
	a.set(2,"game");
	a.set(3,"gear");
	a.set(4,"elephant");
	System.out.println("Original:\n"+a.toString());
	System.out.println();
	
	try{
	    System.out.println("get(2):");
	    System.out.println(a.get(2));
	    System.out.println();
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of range");
	    System.out.println();
	}
	try{
	    System.out.println("get(6):");
	    System.out.println(a.get(6));
	    System.out.println();
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of range");
	    System.out.println();
	}
	try{
	    System.out.println("get(15):");
	    System.out.println(a.get(15));
	    System.out.println();
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of range");
	    System.out.println();
	}
	
	try{
	    System.out.println("set(1,'hi'):");
	    System.out.println("Returns: "+a.set(1,"hi"));
	    System.out.println(a.toString());
	    System.out.println();
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of range");
	    System.out.println();
	}
	try{
	    System.out.println("set(15,'animal'):");
	    System.out.println("Returns: "+a.set(15,"animal"));
	    System.out.println(a.toString());
	    System.out.println();
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of range");
	    System.out.println();
	}

	System.out.println("add('extreme'):");
	a.add("extreme");
	System.out.println(a.toString());
	System.out.println();

	try{
	    System.out.println("a.remove(3):");
	    System.out.println("Returns: "+a.remove(3));
	    System.out.println(a.toString());
	     System.out.println();
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of range");
	    System.out.println();
	}
	try{
	    System.out.println("a.remove(7):");
	    System.out.println("Returns: "+a.remove(7));
	    System.out.println(a.toString());
	    System.out.println();
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of range");
	    System.out.println();
	}
	try{
	    System.out.println("a.remove(20):");
	    System.out.println("Returns: "+a.remove(20));
	    System.out.println(a.toString());
	    System.out.println();
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of range");
	    System.out.println();
	}

	System.out.println("a.resize(4):\n");
	a.resize(4);
	System.out.println(a.toString());
	System.out.println();

	try{
	    System.out.println("a.remove(0):");
	    System.out.println("Returns: "+a.remove(0));
	    System.out.println(a.toString());
	    System.out.println();
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of range");
	    System.out.println();
	}
	try{
	    System.out.println("a.remove(0):");
	    System.out.println("Returns: "+a.remove(0));
	    System.out.println(a.toString());
	    System.out.println();
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of range");
	    System.out.println();
	}
	try{
	    System.out.println("a.remove(0):");
	    System.out.println("Returns: "+a.remove(0));
	    System.out.println(a.toString());
	    System.out.println();
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of range");
	    System.out.println();
	}

	System.out.println("a.clear():");
	a.clear();
	System.out.println(a.toString());
	System.out.println();
    }
}
