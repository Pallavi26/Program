package second.largest.no.collection.array;

import java.util.Arrays;

public class SecondLargestNo {

	public static void main(String[] args) {
		int []a= {20,60,10,120,50,70};
		int []b= {4,34,18,22,3,28,5};
		
		System.out.println("\n Second Largest No is "+ getSecondLargestNo(a));
		System.out.println("\n Second Largest No is "+ getSecondLargestNo(b));

	}

	private static int getSecondLargestNo(int[] a) {
		int size=a.length;
		
		Arrays.sort(a);
		System.out.println("Sorted element "+ Arrays.toString(a));
		return a[size-2];
	}

}
