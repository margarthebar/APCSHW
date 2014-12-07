public class TestSorts{
    public static void main(String[]args){
	SuperArray2 a = new SuperArray2();
	for(int i=0; i<100000; i++){
	    a.add(""+i);
	}
	long start = System.currentTimeMillis();
	a.insertionSort();
	long end = System.currentTimeMillis();
	System.out.println("insertionSort done: "+(end-start));

	SuperArray2 b = new SuperArray2();
	for(int i=0; i<100000; i++){
	    b.add(""+i);
	}
	start = System.currentTimeMillis();
	b.insertionSort();
	end = System.currentTimeMillis();
	System.out.println("selectionSort done: "+(end-start));

	SuperArray2 c = new SuperArray2();
	for(int i=0; i<100000; i++){
	    c.add(""+i);
	}
	start = System.currentTimeMillis();
	c.badInsertionSort();
	end = System.currentTimeMillis();
	System.out.println("badInsertionSort done: "+(end-start));
    }
}
