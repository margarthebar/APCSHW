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
	System.out.println(a.toString());
	
	System.out.println(a.get(5));

	a.set(8,"Hello");
	System.out.println(a.toString());

	a.add(2);
	System.out.println(a.toString());
	a.add(new Integer(99));
	System.out.println(a.toString());
	a.add(new Character('Z'));
	System.out.println(a.toString());


	a.resize(5);
	System.out.println(a.toString());
	a.clear();
	System.out.println(a.toString());
    }
}
