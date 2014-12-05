public class OrderedSuperArray extends SuperArray2{
    public OrderedSuperArray(int size){
        super();
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
    public int find(String target){
	int upper = size();
	int lower = 0;
	int index = size()/2;
	int real = index;
	String[] copy = new String[size()];
	boolean loop = true;

	while(loop){
	    if(size()<=1){
		loop = false;
		return -1;
	    }
	    if(getData()[index].equals(target)){
		System.out.println("found");
		for(int i=index-1;i>=0;i--){
		    if(getData()[i].equals(target)){
			index = i;
		    }else{
			loop = false;
			return index;
		    }
		}   
	    }else if(getData()[index].compareTo(target)>0){
		int i=index;
		while(i<size()){
		    remove(i);
		    System.out.println(toString());
		}
		System.out.println(size()/2);
		index = size()/2;
	    }else{
		String x = getData()[index];
		while(!getData()[0].equals(x)){
		    remove(0);
		    System.out.println(toString());
		}
		System.out.println(size()/2);
		index = size()/2;
	    }
	}
	return index;
    }
}
