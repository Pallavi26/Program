package second.largest.no.array;

public class SecondLargestNo {

	public static void main(String[] args) {
		
		int []a= {20,60,10,120,50,70};
		int []b= {4,34,18,22,3,28,5};
		
		System.out.println("\n Second Largest No is "+ getSecondLargestNo(a));
		System.out.println("\n Second Largest No is "+ getSecondLargestNo(b));
	}

	private static int getSecondLargestNo(int[] a) {
		int size=a.length;
		int temp=0;
		
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0;k<size;k++) {
			System.out.print(a[k]+" ");
		}
		return a[size-2];
	}

}
