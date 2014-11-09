public class Test{
    public static void main(String[]args){
	SuperArray a = new SuperArray();
	System.out.println(a.toString());

	a.set(0,'a');
	a.set(1,'b');
	a.set(2,'c');
	a.set(3,'d');
	a.set(4,'e');
	a.set(5,'f');
	a.set(6,'g');
	a.set(7,'h');
	a.set(8,'i');
	a.set(9,'j');
	System.out.println("Original:\n"+a.toString());
	
	System.out.println("Testing get(5):\n"+a.get(5));

	System.out.println(a.set(8,"Hello"));
	System.out.println("set(8,'Hello'):\n"+a.toString());

	a.add(new Integer(2));
	System.out.println("add(new Integer(2)):\n"+a.toString());

	a.add(3,new Integer(99));
	System.out.println("add(3,new Integer(99)):\n"+a.toString());

	a.add(new Character('Z'));
	System.out.println("add(new Character('Z')):\n"+a.toString());

	System.out.println(a.remove(7));
	System.out.println("a.remove(7):\n"+a.toString());

	a.resize(5);
	System.out.println("a.resize(5):\n"+a.toString());

	a.clear();
	System.out.println("a.clear():\n"+a.toString());
    }
}
