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
	    Object[] ans = new Object[capacity+1];
	    for(int i=0;i<capacity;i++){
		ans[i]=data[i];
	    }
	    ans[capacity] = e;
	    capacity+=1;
	    data = ans;
	}
    }

    void add(int index, Object o){
	if(index<0 || index>= size()){
	    throw new IndexOutOfBoundsException();
	}else{
	    Object[] ans = new Object[capacity+1];
	    ans[index] = o;

	    int x = 0;
	    for(int i=0; i<capacity; i++){
		if(i == index){
		    x=1;
		}
		ans[i+x] = data[i];
	    }
	    capacity+=1;
	    data = ans;
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
	    Object[] ans = new Object[capacity-1];
	    int j = 0;
	    Object removed = data[index];
	    for(int i=0;i<capacity;i++){
		if(i == index){
		    j=1;
		}else{
		    ans[i-j]=data[i];
		}
	    }
	    data = ans;
	    capacity-=1;
	    return removed;
	}
    }
}
