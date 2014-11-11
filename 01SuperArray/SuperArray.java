public class SuperArray{
    private Object[] data;
    private int capacity;

    public SuperArray(int size){
	capacity = size;
	data = new Object[size];
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

    public void add(Object e){
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
	    Object[] ans = new Object[capacity*2];
	    for(int i=0;i<capacity;i++){
		ans[i]=data[i];
	    }
	    ans[capacity] = e;
	    capacity*=2;
	    data = ans;
	}
    }

    void add(int index, Object o){
	if(index<0 || index>= size()){
	    throw new IndexOutOfBoundsException();
	}else{
	    Object[] ans;

	    //test if there's room (is there a null?)
	    boolean slot = false;
	    for(int j=0;j<capacity;j++){
		if(data[j] == null){
		    slot = true;
		}
	    }
	 
	    if(!slot){
		//double capacity
		ans = new Object[capacity*2];
	    }else{
		ans = new Object[capacity];
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
	Object[] ans = new Object[newCapacity];
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
	data = new Object[0];
    }

    public Object get(int index){
	if(index< 0 || index>= size()){
	    throw new IndexOutOfBoundsException();
	}else{
	    return data[index];
	}
    }

    public Object set(int index, Object e){
	if(index<0 || index>=size()){
	    throw new IndexOutOfBoundsException();
	}else{
	    Object ans = data[index];
	    data[index] = e;
	    return ans;
	}
    }

    public Object remove(int index){
	if(index<0 || index>=size()){
	    throw new IndexOutOfBoundsException();
	}else{
	    Object[] ans;

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
		ans = new Object[capacity/4];
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
		ans = new Object[capacity];
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
