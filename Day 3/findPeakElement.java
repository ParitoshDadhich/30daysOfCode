class Solution {
    public int findPeakElement(int[] arr) {
        
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        
        if(n == 1)
            return 0;
        
        while(start <= end){
            
                int mid = start + (end - start)/2;

                // checking edge cases
                if(mid > 0 && mid < (n - 1)){

                    // condition for peak element
                    if(arr[mid] >= arr[mid - 1] && arr[mid] >= arr[mid + 1])
                        return mid;

                    // condition for whether to move left or right
                    // move towards the side who dominates the another
                    else if(arr[mid] < arr[mid - 1])
                        end = mid - 1;
                    else if(arr[mid] < arr[mid + 1])
                        start = mid + 1;
                }

                else if(mid == 0){
                        if(arr[0] > arr[1])
                            return 0;
                        else 
                            return 1;
                }

                else if(mid == n-1){
                        if(arr[n-1] > arr[n-2])
                            return n - 1;
                        else 
                            return n - 2;
                }
            
        }
        
        return -1;
    }
}
