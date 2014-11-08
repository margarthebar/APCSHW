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
        return data[index];
    }

    public void set(int index, Object e){
	data[index] = e;
    }
}
