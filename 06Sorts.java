import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
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
	int place = 10;
	ArrayList<ArrayList<Integer>> bucketArray = new ArrayList<ArrayList<Integer>>(10);
	//intialize buckets
	for(int i=0;i<10;i++){
	    bucketArray.add(new ArrayList<Integer>());
	}
	//find the necessary number of passes through the original array
	int digits = 1;
	for(int a:c){
	    System.out.println((""+a).length());
	    if((""+a).length()>digits){
		digits = (""+a).length();
	    }   
	}
	System.out.println(digits);
	//sort into buckets
	for(int i=0; i<digits; i++){
	    System.out.println("place: "+place);
	    for(int a:c){
		System.out.println("a: "+a+" digitSort: "+(i+1)+" index: "+((a%place-a%(place/10))/(place/10)));
		bucketArray.get((a%place-a%(place/10))/(place/10)).add(a);
	    }
	    place*=10;
	    //copy values in order over to original array
	    int indexOriginal = 0;
	    for(ArrayList<Integer> a:bucketArray){
		for(int el:a){
		    System.out.println("indexOriginal: "+indexOriginal+" el: "+el);
		    c[indexOriginal]=el;
		    indexOriginal++;
		}
	    }
	}
    }
    public static int[] randomArray(){
	Random rand = new Random();
	int[] ans = new int[1000];
	for(int i=0;i<1000;i++){
	    ans[i] = rand.nextInt();
	}
	return ans;
    }

    public static void main(String[]args){
	long startTime,endTime;
	int[] a = randomArray();
	System.out.println(Arrays.toString(a));
	startTime = System.currentTimeMillis();
	bubbleSort(a);
	endTime = System.currentTimeMillis();
	System.out.println(Arrays.toString(a));
	System.out.println(endTime-startTime);

	int[] b = randomArray();
	System.out.println(Arrays.toString(b));
	startTime = System.currentTimeMillis();
	insertionSort(b);
	endTime = System.currentTimeMillis();
	System.out.println(Arrays.toString(b));

	int[] c = randomArray();
	System.out.println(Arrays.toString(c));
	startTime = System.currentTimeMillis();
	selectionSort(c);
	endTime = System.currentTimeMillis();
	System.out.println(Arrays.toString(c));
	
	System.out.println((432%100-432%10)/10);
	System.out.println((461%100-461%10)/10);
	System.out.println((461%10-461%1)/1);
	

	int[] d = {5,23,7,461,0,12,32,6};
	System.out.println(Arrays.toString(d));
	radixSort(d);
	System.out.println(Arrays.toString(d));

	/*
	int[] d = randomArray();
	System.out.println(Arrays.toString(d));
	startTime = System.currentTimeMillis();
	selectionSort(d);
	endTime = System.currentTimeMillis();
	System.out.println(Arrays.toString(d));
	*/
    }
}
