public class ArrayErrorTest{
    private static int capacity = 10;

    public static String toString(String[] data){
	String ans ="";
	for(int i=0; i<capacity; i++){
	    ans+=data[i]+" ";
	}
	return "["+ans.trim()+"]";
    }

    public static int size(String[] data){
	int size=0;
	for(int i=0;i<capacity;i++){
	    if(data[i]!=null){
		size++;
	    }
	}
	return size;
    }

    public static void insertionSort(String[] s){
	String x = ""; 
	//test for each element in array
	for(int i=1;i<size(s);i++){
	    //compare to each element before it in the array
	    for(int j=0;j<i;j++){
		//if s[i]<s[j]
		if(s[i].compareTo(s[j])<0){
		    //stored value to be moved towards the front
		    x = s[i];
		    //now shift everything over (k is just j)
		    for(int k=i;k>j;k--){
			s[k] = s[k-1];
		    }
		    //now add x to the vacant spot
		    s[j] = x;
		}
	    }
	}
    }

    public static void main(String[]args){
	String[] s = new String[10];
	s[0] = "cat";
	s[1] = "zoo";
	s[2] = "apple";
	s[3] = "bear";
	s[4] = "tern";

	System.out.println(s[0]);
	System.out.println(s[8]);

	System.out.println(toString(s));
	insertionSort(s);
	System.out.println(toString(s));
    }
}
