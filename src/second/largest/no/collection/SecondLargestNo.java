package second.largest.no.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNo {

	public static void main(String[] args) {
		Integer []a= {20,60,10,120,50,70};
		Integer []b= {4,34,18,22,3,28,5};
		
		System.out.println("\n Second Largest No is "+ getSecondLargestNo(a));
		System.out.println("\n Second Largest No is "+ getSecondLargestNo(b));

	}

	private static int getSecondLargestNo(Integer[] a) {
		int size=a.length;
		
		List<Integer> list=Arrays.asList(a);
		Collections.sort(list);
		System.out.println(list);
		return a[size-2];
	}

}
