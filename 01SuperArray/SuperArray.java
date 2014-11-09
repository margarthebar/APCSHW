public class SuperArray{
    private Object[] data;
    private int currentLength;

    public SuperArray(int size){
	currentLength = size;
	data = new Object[size];
    }
    public SuperArray(){
	this(10);
    }

    public String toString(){
	String ans ="";
	for(int i=0; i<currentLength; i++){
	    ans+=data[i]+" ";
	}
	return "["+ans.trim()+"]";
    }

    public void add(Object e){
	Object[] ans = new Object[currentLength+1];
	for(int i=0;i<currentLength;i++){
	    ans[i]=data[i];
	}
	ans[currentLength] = e;
	currentLength+=1;
	data = ans;
    }
    
    void add(int index, Object o){
	Object[] ans = new Object[currentLength+1];
	ans[index] = o;

	int x = 0;
	for(int i=0; i<currentLength; i++){
	    if(i == index){
	        x=1;
	    }
	    ans[i+x] = data[i];
	}
	currentLength+=1;
	data = ans;
    }

    public int size(){
	return currentLength;
    }

    public void resize(int newCapacity){
	Object[] ans = new Object[newCapacity];
	if(newCapacity > currentLength){
	    for(int i=0;i<currentLength;i++){
		ans[i] = data[i];
	    }
	}else{
	    for(int i=0; i<newCapacity;i++){
		ans[i] = data[i];
	    }
	}
	data = ans;
	currentLength = newCapacity;
    }

    public void clear(){
	currentLength = 0;
	data = new Object[0];
    }

    public Object get(int index){
	if(index< 0 || index>= size()){
	    System.out.println("Error: index out of range");
	    return null;
	}else{
	    return data[index];
	}
    }

    public Object set(int index, Object e){
	if(index<0 || index>=size()){
	    System.out.println("Error: index out of range");
	    return null;
	}else{
	    Object ans = data[index];
	    data[index] = e;
	    return ans;
	}
    }
    
    public Object remove(int index){
	if(index<0 || index>=size()){
	    System.out.println("Error: index out of range");
	    return null;
	}else{
	    Object[] ans = new Object[currentLength-1];
	    int j = 0;
	    Object removed = data[index];
	    for(int i=0;i<currentLength;i++){
		if(i == index){
		    j=1;
		}else{
		    ans[i-j]=data[i];
		}
	    }
	    data = ans;
	    currentLength-=1;
	    return removed;
	}
    }
}
