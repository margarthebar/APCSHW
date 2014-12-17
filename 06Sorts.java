import java.util.Arrays;
public class Sorts{
     public static void insertionSort(int[]c){
	int x = 0;
	//test for each element in array
	for(int i=1;i<c.length;i++){
	    //compare to each element before it in the array
	    for(int j=0;j<i;j++){
		//if c[i]<c[j]
		if(c[i]<c[j]){
		    //store value to be moved towards the front
		    x = c[i];
		    //now shift everything over (k is just j)
		    for(int k=i;k>j;k--){
			c[k] = c[k-1];
		    }
		    //now add x to the vacant spot
		    c[j] = x;
		}
	    }
	}
    }

    public static void selectionSort(int[] c){
	int smallest = c[0];
	for(int i=0; i<c.length; i++){
	    smallest = c[i];
	    for(int j=i; j<c.length; j++){
		if(c[j]<smallest){
		    smallest = c[j];
		    c[j] = c[i];
		    c[i] = smallest;
		}
	    }
	}
    }

    public static void bubbleSort(int[]c){
	int temp = 0;
	for(int upper=c.length; upper>1; upper--){
	    for(int i=0; i<upper-1; i++){
		if(c[i+1]<c[i]){
		    temp = c[i];
		    c[i] = c[i+1];
		    c[i+1] = temp;
		}
	    }
	}
    }

    public static void main(String[]args){
	int[] a = {5,9,2,7,3,1,0};
	System.out.println(Arrays.toString(a));
	bubbleSort(a);
	System.out.println(Arrays.toString(a));

	int[] b = {5,9,2,7,3,1,0};
	System.out.println(Arrays.toString(b));
	insertionSort(b);
	System.out.println(Arrays.toString(b));

	int[] c = {5,9,2,7,3,1,0};
	System.out.println(Arrays.toString(c));
	selectionSort(c);
	System.out.println(Arrays.toString(c));
    }
}
