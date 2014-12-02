public class SuperArray2{
    private String[] data;
    private int capacity;
    public SuperArray(int size){
	capacity = size;
	data = new String[size];
    }
    public SuperArray(){
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
	    if(data[i].equals(null)){
		slot = true;
	    }
	}
	if(slot){
	    for(int i=0;i<capacity;i++){
		if(slot && data[i].equals(null)){
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
	return capacity;
    }
    public void resize(int newCapacity){
	String[] ans = new Object[newCapacity];
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
	    String[] ans;
	    int count = 0;
	    for(int j=0;j<capacity;j++){
		if(data[j] != null){
		    count++;
		}
	    }
	    if(data[index]!=null){
		count--;
	    }
	    if(count<=capacity/4){
		ans = new String[capacity/4];
		int j=0;
		for(int i=0;i<capacity/4;i++){
		    if(i == index){
			j=1;
		    }else{
			ans[i-j]=data[i];
		    }
		}
		capacity/=4;
	    }else{
		ans = new String[capacity];
		int j=0;
		for(int i=0;i<capacity;i++){
		    if(i == index){
			j=1;
		    }else{
			ans[i-j]=data[i];
		    }
		}
		data = ans;
	    }
	    return data[index];
	}
    }
}
