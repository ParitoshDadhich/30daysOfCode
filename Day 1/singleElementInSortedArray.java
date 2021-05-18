class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        
        // boundary check;
        if(end == 0)
            return arr[end];
        else if(arr[0] != arr[1])
            return arr[0];
        else if(arr[n-2] != arr[n-1])
            return arr[n-1];
        
        // binary search
        while(start <= end){
        int mid = start + (end - start)/2; 
            
            // check for the unique element
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1])
                return arr[mid];
            
            // partition
            if( (mid%2 == 0 && arr[mid] == arr[mid+1])  || 
                (mid%2 != 0 && arr[mid] == arr[mid-1]) )
                start = mid + 1;
            else
                end = mid - 1;
        }
        
        return -1;
    }
}
