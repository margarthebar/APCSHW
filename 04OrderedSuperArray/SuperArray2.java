public class SuperArray2{
    private String[] data;
    private int capacity;
    public SuperArray2(int size){
	capacity = size;
	data = new String[size];
    }
    public SuperArray2(){
	this(10);
    }
    public String toString(){
	String ans ="";
	for(int i=0; i<capacity; i++){
	    ans+=data[i]+" ";
	}
	return "["+ans.trim()+"]";
    }
    public void add(String e){
	boolean slot = false;
	for(int i=0;i<capacity;i++){
	    if(data[i] == null){
		slot = true;
	    }
	}
	if(slot){
	    for(int i=0;i<capacity;i++){
		if(slot && data[i] == null){
		    data[i] = e;
		    slot = false;
		}
	    }
	}else{
	    String[] ans = new String[capacity*2];
	    for(int i=0;i<capacity;i++){
		ans[i]=data[i];
	    }
	    ans[capacity] = e;
	    capacity*=2;
	    data = ans;
	}
    }
    void add(int index, String o){
	if(index<0 || index>= size()){
	    throw new IndexOutOfBoundsException();
	}else{
	    String[] ans;
	    //test if there's room (is there a null?)
	    boolean slot = false;
	    for(int j=0;j<capacity;j++){
		if(data[j].equals(null)){
		    slot = true;
		}
	    }
	    if(!slot){
		//double capacity
		ans = new String[capacity*2];
	    }else{
		ans = new String[capacity];
		//add o at index, shift everything else over, get rid of a null
		ans[index] = o;
	    }
	    int x = 0;
	    for(int i=0; i<capacity; i++){
		if(i == index){
		    x=1;
		}
		if(i+x<=capacity-1){
		    ans[i+x] = data[i];
		}
	    }
	    data = ans;
	    if(!slot){
		capacity*=2;
	    }
	}
    }
    public int size(){
	int size=0;
	for(int i=0;i<capacity;i++){
	    if(data[i]!=null){
		size++;
	    }
	}
	return size;
    }
    public void resize(int newCapacity){
	String[] ans = new String[newCapacity];
	if(newCapacity > capacity){
	    for(int i=0;i<capacity;i++){
		ans[i] = data[i];
	    }
	}else{
	    for(int i=0; i<newCapacity;i++){
		ans[i] = data[i];
	    }
	}
	data = ans;
	capacity = newCapacity;
    }
    public void clear(){
	capacity = 0;
	data = new String[0];
    }
    public String get(int index){
	if(index< 0 || index>= size()){
	    throw new IndexOutOfBoundsException();
	}else{
	    return data[index];
	}
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
    public String remove(int index){
	if(index<0 || index>=size()){
	    throw new IndexOutOfBoundsException();
	}else{
	    String[] ans = new String[capacity];
	    String removed = data[index];
	    int ansIndex=0;
	    for(int i=0;i<capacity;i++){
		if(i!=index){
		    ans[ansIndex] = data[i];
		    ansIndex++;
		}
	    }
	    int count = 0;
	    for(int j=0;j<capacity;j++){
		if(ans[j] != null){
		    count++;
		}
	    }
	    if(ans[index]!=null){
		count--;
	    }
	    if(count<capacity/4){
		String[] ans2 = new String[capacity/4];
		capacity/=4;
		for(int k=0;k<capacity;k++){
		    ans2[k] = ans[k];
		}
		ans = ans2;
	    }
	    data = ans;
	    return removed;
	}
    }
    public void insertionSort(){
	String x = "";
	//test for each element in array
	for(int i=1;i<size();i++){
	    //compare to each element before it in the array
	    for(int j=0;j<i;j++){
		//if data[i]<data[j]
		if(data[i].compareTo(data[j])<0){
		    //store value to be moved towards the front
		    x = data[i];
		    //now shift everything over (k is just j)
		    for(int k=i;k>j;k--){
			data[k] = data[k-1];
		    }
		    //now add x to the vacant spot
		    data[j] = x;
		}
	    }
	}
    }
}
