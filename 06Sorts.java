import java.util.Arrays;
public class Sorts{
    //extra
    public static String name(){
	return "Burkart,Margaret";
    }
    public static int period(){
	return 6;
    }
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

     public static void radixSort(int[]c){
	int place = 1;
	ArrayList<ArrayList<int>> bucketArray = new ArrayList<ArrayList<int>>(10);
	for(int a:c){
	    for(int i=0;i<10;i++){
		// add a to ArrayList at index remainder of a/10 in bucketArray
	    }
	}
    }
    public static void main(String[]args){
	long startTime,endTime;
	int[] a = {5,9,2,7,3,1,0};
	System.out.println(Arrays.toString(a));
	startTime = System.currentTimeMillis();
	bubbleSort(a);
	endTime = System.currentTimeMillis();
	System.out.println(Arrays.toString(a));
	System.out.println(endTime-startTime);

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
