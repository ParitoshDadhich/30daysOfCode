package binarySearch;

public class FindPostionOfKeyInInfiniteSortedArray {

	public static void main(String[] args) {
		int arr[] = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
		
		int ans = findPsotionOfKeyInInfiniteSortedArray(arr,130);
		
		if (ans==-1)
		System.out.println("Element not found");
		else
		System.out.println("Element found at index " + ans);

	}

	private static int findPsotionOfKeyInInfiniteSortedArray(int [] arr, int key) {
		
		int n = arr.length;
		int start = 0;
		int end = 1;
		
		while(key > arr[end] ) {
			start = end;
			end = end * 2;
		}
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] == key) return mid;
			else if(arr[mid] < key) start = mid + 1;
			else	end = mid - 1;
		}
		
		return -1;
	}
}
