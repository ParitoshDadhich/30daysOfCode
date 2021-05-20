package binarySearch;

public class MinimumDifferenceElementInSortedArray {

	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 18, 23};
		System.out.println(minmumDifferenceElement(arr, 7));

	}
	
	private static int minmumDifferenceElement(int arr[], int key) {
		
		// method1: we can solve this question by calcutating flor and ceil
		
		// method2
		int n = arr.length;
		int start = 0;
		int end = n - 1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(key == arr[mid])
				return arr[mid];
			else if(key > arr[mid])
				start = mid + 1;
			else
				end = mid - 1;
		}
		
		if(start == n)
			start = n - 1;
		
		System.out.println(start + " " + end);
		//return Math.abs(Math.min(arr[start] - key, arr[end] - key));
		
		return Math.abs(arr[start] - key) < Math.abs(arr[end] - key) ? arr[start] : arr[end];
	}

}
