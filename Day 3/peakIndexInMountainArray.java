class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            // dealing with edge cases
            if(mid != 0 && mid != n-1){
                // peak element condition
                if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                    return mid;

                else if(arr[mid - 1] > arr[mid])
                    end = mid - 1;
                
                else if (arr[mid + 1] > arr[mid])
                    start = mid + 1;
            }
            
            // when mid = 0;
            else if( mid == 0){
                if(arr[0] > arr[1])
                    return 0;
                else 
                    return 1;
            } 
            
            // when mid = n-1;
            else if(mid == n - 1){
                if(arr[n - 1] > arr[n - 2])
                    return n - 1;
                else 
                    return n - 2;
            }
        }
        
        return -1;
    }
}
 
