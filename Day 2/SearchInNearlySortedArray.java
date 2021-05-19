package binarySearch;

public class SearchInNearlySortedArray {

	public static void main(String[] args) {
		int arr[] =  {10, 3, 40, 20, 50, 80, 70};
		System.out.println(searchInNearlySortedArray(arr, 0));
	}
	
	private static int searchInNearlySortedArray(int arr[], int key) {
		
		int n = arr.length;
		int start = 0;
		int end = n - 1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] == key) return mid;
			else if(mid - 1 >= start && arr[mid - 1] == key) return mid - 1;
			else if(mid + 1 <= end && arr[mid + 1] == key) return mid + 1;
			
			
			if(arr[mid] < key) start = mid + 2;
			else if(arr[mid] > key) end = mid - 2;
		}
		
		return -1;
	}
}
