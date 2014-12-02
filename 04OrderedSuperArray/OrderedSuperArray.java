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

    public void sort(String[] s){
	String held = "";
	for(int i=0;i<capacity-1;i++){
	    if(s[i].compareTo(s[i+1])>0){
		held = s[i];
		s[i] = s[i+1];
		s[i+1] = held;
	    }
	}
	for(int j=0;j<capacity-1;j++){
	    if(s[j].compareTo(s[j+1])>0){
		sort(s);
	    }
	}
    }

    public void add(String e){
	super.add(e);
	sort(data);
    }

    public String set(int index, String e){
	if(index<0 || index>=size()){
	    throw new IndexOutOfBoundsException();
	}else{
	    String ans = data[index];
	    data[index] = e;
	    return ans;
	}
    }
}
