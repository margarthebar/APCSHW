import java.util.Arrays;
public class Sorts{
    /*
     public void insertionSort(int[]c){
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
    public void selectionSort(int[]c){
	String smallest = data[0];
	int smallestIndex = 0;
	for(int i=0; i<size(); i++){
	    for(int j=i; j<size(); j++){
		if(data[j].compareTo(smallest)<0){
		    smallest = data[j];
		    smallestIndex = j;
		}
	    }
	    data[smallestIndex] = data[0];
	    data[0] = smallest;
	}
    }*/
    public static void bubbleSort(int[]c){
	int temp = 0;
	for(int upper=c.length; upper>1; upper--){
	    for(int i=0; i<upper-1; i++){
		if(c[i+1]<c[i]){
		    temp = c[i];
		    c[i] = c[i+1];
		    c[i+1] = c[i];
		}
	    }
	}
    }

    public static void main(String[]args){
	int[] a = {5,9,2,7,3,1,0};
	System.out.println(Arrays.toString(a));
	bubbleSort(a);
	System.out.println(Arrays.toString(a));
    }
}
