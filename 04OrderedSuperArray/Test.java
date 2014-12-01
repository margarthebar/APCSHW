public class Main{
    public static void main(String[]args){
	SuperArray a = new SuperArray();
	System.out.println(a.toString());

	a.set(0,new Integer(3));
	a.set(1,new Integer(5));
	a.set(2,new Integer(8));
	a.set(3,new Integer(4));
	a.set(4,new Integer(1));
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
	    System.out.println("set(1,new Integer(2)):");
	    System.out.println("Returns: "+a.set(1,new Integer(2)));
	    System.out.println(a.toString());
	    System.out.println();
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of range");
	    System.out.println();
	}
	try{
	    System.out.println("set(15,new Integer(2)):");
	    System.out.println("Returns: "+a.set(15,new Integer(2)));
	    System.out.println(a.toString());
	    System.out.println();
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of range");
	    System.out.println();
	}

	System.out.println("add(new Integer(2)):");
	a.add(new Integer(2));
	System.out.println(a.toString());
	System.out.println();

	try{
	    System.out.println("add(3,new Integer(9)):");
	    a.add(3,new Integer(9));
	    System.out.println(a.toString());
	    System.out.println();
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of range");
	    System.out.println();
	}

	try{
	    System.out.println("add(20,new Integer(8)):");
	    a.add(20,new Integer(8));
	    System.out.println(a.toString());
	    System.out.println();
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of range");
	    System.out.println();
	}

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
