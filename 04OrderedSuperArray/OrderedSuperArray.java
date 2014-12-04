public class OrderedSuperArray extends SuperArray2{
    private String[] data;
    private int capacity;
    public OrderedSuperArray(int size){
	capacity = size;
	data = new String[size];
    }
    public OrderedSuperArray(){
	super(10);
    }
    public void add(String e){
	super.add(e);
	insertionSort();
    }
    public void add(int index, String e){
	this.add(e);
    }
    public String set(int index, String e){
	String ans = super.set(index,e);
	insertionSort();
	return ans;
    }
}
