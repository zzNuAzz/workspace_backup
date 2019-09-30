import java.util.*;
public class Main {
	public static void main(String[] args) {
		int[] arr = new int[1];
		Random rand = new Random();
		for(int i = 0 ; i < arr.length; i++ ) arr[i] = rand.nextInt(Integer.MAX_VALUE);
//print before sort
		
//sort
		Sort.mergeSort(arr,0, arr.length- 1);
//print after sort
		// System.out.println("Sorted array: ");
		// for(int i : arr )
		// System.out.print(i + " ");
		// System.out.println();
	System.out.println("done");
	int i = 0;
	while(true)

		if (++i % 1000000 == 0) System.out.println(i);

	}
}