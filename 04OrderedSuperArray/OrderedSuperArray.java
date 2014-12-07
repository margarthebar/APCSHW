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
	int lower = 0;
	int upper = size()-1;
	int index = (size()-1)/2;
	boolean loop = true;

	while(loop){
	    //GO LOWER
	    if(getData()[index].compareTo(target)>0){
		//checks to see if element isn't there
		if(lower == upper){
		    return -1;
		}
		upper = index-1;
		index = lower + (upper-lower)/2; 
	    }

	    //GO HIGHER
	    if(getData()[index].compareTo(target)<0){
		//checks to see if element isn't there
		if(lower == upper){
		    return -1;
		}
		lower = index+1;
		index = lower + (upper-lower)/2; 
	    }

	    //FOUND!
	    if(getData()[index].equals(target)){
		//check for earlier instances
		if(getData()[index-1].equals(target)){
		    index--;
		}else{
		    loop = false;
		}
	    }
	}
	return index;
    }
}

