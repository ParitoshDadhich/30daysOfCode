package binarySearch;

public class CeilingInASortedArray {

	public static void main(String[] args) {
		int arr[] = {1, 2, 8, 10, 10, 12, 19};
		System.out.println(ceilingInSortedArray(arr, 10));
	}
	
	private static int ceilingInSortedArray(int arr[], int key) {
		
		int n = arr.length;
		int start = 0;
		int end = n - 1;
		int res = -1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(key == arr[mid]) return mid;
			
			if(key < arr[mid]) {
				res = mid;
				end = mid - 1;
			}
			
			else if(key > arr[mid])	start = mid + 1;
		}
		
		return res;
	}

}
